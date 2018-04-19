package com.example.luping.fragmentrecyclercardview;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class RecyclerFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recyclerview, container, false);
        RecyclerView recyclerView=view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(
                new StaggeredGridLayoutManager(
                        1, StaggeredGridLayoutManager.VERTICAL));
        List<Phone> phoneList=getPhoneList();
        recyclerView.setAdapter(new MyAdapter(getContext(),phoneList));

        return view;

    }
    public List<Phone> getPhoneList(){
        List<Phone> phoneList=new ArrayList<>();
        phoneList.add(new Phone("Phone1",12000,R.drawable.phone1));
        phoneList.add(new Phone("Phone2",13700,R.drawable.phone2));
        phoneList.add(new Phone("Phone3",15500,R.drawable.phone3));
        phoneList.add(new Phone("Phone4",12000,R.drawable.phone4));
        phoneList.add(new Phone("Phone5",12500,R.drawable.phone5));
        phoneList.add(new Phone("Phone6",18000,R.drawable.phone6));
        phoneList.add(new Phone("Phone7",23000,R.drawable.phone7));
        return phoneList;
    }

}
