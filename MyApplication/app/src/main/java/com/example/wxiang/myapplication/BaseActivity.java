package com.example.wxiang.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;

public class BaseActivity extends AppCompatActivity implements OnChartValueSelectedListener {

    @Override
    public void onValueSelected(Entry e, Highlight h){

    };

    @Override
    public void onNothingSelected(){

    };
}
