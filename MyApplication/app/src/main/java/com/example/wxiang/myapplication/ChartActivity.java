package com.example.wxiang.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.WindowManager;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ChartActivity extends BaseActivity {
    private LineChart mChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chartlayout);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        mChart = findViewById(R.id.chart1);
        mChart.setOnChartValueSelectedListener(this);
        //设置是否绘制chart边框的线
        mChart.setBorderColor(Color.RED);
        //设置图表背景颜色
        mChart.setBackgroundColor(Color.WHITE);
        //设置char线边框线宽度
        mChart.setBorderWidth(1f);
        //设置chart是否可触摸
        mChart.setTouchEnabled(true);
        mChart.setDragDecelerationFrictionCoef(0.9f);
        //设置是否可以拖拽
        mChart.setDragEnabled(true);
        //设置是否可以缩放x和y,默认true
        mChart.setScaleEnabled(true);
        //设置是否可以通过双击屏幕放大图表。默认是true
        mChart.setDoubleTapToZoomEnabled(false);
        //是否启动网格背景
        mChart.setDrawGridBackground(false);
        mChart.setHighlightPerDragEnabled(true);
        //设置chart动画 x轴与Y轴都有动画
        mChart.animateXY(2000, 2000);
        //设置X轴和Y轴的点
        List<Entry> entryList = new ArrayList<>();
        for (float i = 0; i <= 15; i++) {
            entryList.add(new Entry(i,(float)(Math.sin(Math.toRadians(i)))));
        }
        LineDataSet lineDataSet = new LineDataSet(entryList, "Label");
        lineDataSet.setColor(Color.RED);
        //设置数据刷新图表
        LineData lineData = new LineData(lineDataSet);
        mChart.setData(lineData);
        mChart.invalidate();//refresh

    }
}
