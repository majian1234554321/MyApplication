package com.example.joenny.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainGragment1_2 extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(inflater.getContext(), R.layout.maingragment1_2, null);


        Button tv1 = view.findViewById(R.id.tv1);
        Button tv2 = view.findViewById(R.id.tv2);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainGragment1_3 f2 = new MainGragment1_3();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction tx = fm.beginTransaction();
                tx.replace(R.id.fl, f2);
//将当前的事务添加到了回退栈
                tx.addToBackStack(null);
                tx.commit();


            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //回退到Fragment1
                FragmentManager fm = getFragmentManager();
//将当前的事务退出回退栈
                fm.popBackStack();
            }
        });


        return view;
    }
}
