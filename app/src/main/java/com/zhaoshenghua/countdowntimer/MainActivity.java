package com.zhaoshenghua.countdowntimer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.count)
    CountDownTimer count;

    private ArrayList<PieData> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        PieData a = new PieData("1111", 30);
        mData.add(a);

        count.setData(mData);
        count.setStartAngle(0);
    }
}
