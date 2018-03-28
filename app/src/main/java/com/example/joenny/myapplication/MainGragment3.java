package com.example.joenny.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainGragment3 extends BaseFragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(inflater.getContext(), R.layout.maingragment3, null);


        MainGragment3_1 f1 = new MainGragment3_1();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        //fl为占位布局
        ft.add(R.id.fl3, f1);
        ft.commit();





        return view;
    }
}
