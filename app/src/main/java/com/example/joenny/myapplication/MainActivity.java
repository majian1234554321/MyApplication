package com.example.joenny.myapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        List<BaseFragment> list = new ArrayList<>();

        list.add(new MainGragment1());
        list.add(new MainGragment2());
        list.add(new MainGragment3());
        list.add(new MainGragment4());



        viewPager = findViewById(R.id.vp);
        viewPager.setOffscreenPageLimit(3);
        viewPager.setAdapter(new MyViewPagerAdapter(getSupportFragmentManager(),list));


        RadioButton rb1 = findViewById(R.id.rb1);
        RadioButton rb2 = findViewById(R.id.rb2);
        RadioButton rb3 = findViewById(R.id.rb3);
        RadioButton rb4 = findViewById(R.id.rb4);

        RadioGroup rg = findViewById(R.id.rgs);

        rg.setOnCheckedChangeListener(this);


    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.rb1:
                viewPager.setCurrentItem(0);
                break;
            case R.id.rb2:
                viewPager.setCurrentItem(1);
                break;
            case R.id.rb3:
                viewPager.setCurrentItem(2);
                break;
            case R.id.rb4:
                viewPager.setCurrentItem(3);
                break;
        }
    }



    public class MyViewPagerAdapter extends FragmentPagerAdapter{


        String  [] array = {"1","2","3","4"};

        public List<BaseFragment> baseFragmnetList;
        public MyViewPagerAdapter(FragmentManager fm,List<BaseFragment> baseFragmnetList) {
            super(fm);
            this.baseFragmnetList = baseFragmnetList;
        }

        @Override
        public Fragment getItem(int position) {
            return baseFragmnetList.get(position);
        }

        @Override
        public int getCount() {
            return 4;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return array[position];
        }
    }
}
