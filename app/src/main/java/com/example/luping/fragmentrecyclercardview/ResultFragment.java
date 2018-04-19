package com.example.luping.fragmentrecyclercardview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by luping on 2018/4/1.
 */

public class ResultFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_result, container, false);
        TextView tvResult = view.findViewById(R.id.tvResult);
        Button btnBack = view.findViewById(R.id.btnBack);
        Bundle bundle = getArguments();
        if (bundle != null) {
            String name = bundle.getString("name");
            String price = bundle.getString("price");
            String text = "name : " + name + "\nprice : " + price;
            tvResult.setText(text);
        }
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().popBackStack();
            }
        });
        return view;
    }

}
