package com.example.luping.fragmentrecyclercardview;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private Context context;
    private List<Phone> phoneList;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imvPhone;
        TextView tvName, tvPrice;

        public MyViewHolder(final View itemView) {
            super(itemView);

            imvPhone = itemView.findViewById(R.id.imvPhone);
            tvName = itemView.findViewById(R.id.tvName);
            tvPrice = itemView.findViewById(R.id.tvPrice);
//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//
//                    String name=tvName.getText().toString();
//                    String price=tvPrice.getText().toString();
//                    Bundle bundle=new Bundle();
//                    bundle.putString("name",name);
//                    bundle.putString("price",price);
//
//
//
//                }
//            });
        }
    }

    public MyAdapter(Context context, List<Phone> phoneList) {
        this.context = context;
        this.phoneList = phoneList;
    }

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View itemView = layoutInflater.inflate(R.layout.item_view, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyAdapter.MyViewHolder holder, int pos) {
        final Phone phone = phoneList.get(pos);
        holder.tvName.setText(phone.getName());
        holder.tvPrice.setText(String.valueOf(phone.getPrice()));
        holder.imvPhone.setImageResource(phone.getImgID());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast=Toast.makeText(context,phone.getName() + " , NTD : " + phone.getPrice(),Toast.LENGTH_LONG);
                toast.show();
                String name=phone.getName().toString();
                String price=String.valueOf(phone.getPrice());
                Bundle bundle=new Bundle();
                bundle.putString("name",name);
                bundle.putString("price",price);

                AppCompatActivity activity=(AppCompatActivity) holder.itemView.getContext();
                Fragment resultFragment=new ResultFragment();
                resultFragment.setArguments(bundle);
                activity.getSupportFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.content,resultFragment).commit();

            }
        });

    }

    @Override
    public int getItemCount() {

        return phoneList.size();
    }


}
