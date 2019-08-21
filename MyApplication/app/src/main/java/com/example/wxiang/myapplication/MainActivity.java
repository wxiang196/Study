package com.example.wxiang.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.github.mikephil.charting.charts.LineChart;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my);//程序被创建时显示my布局
        //button2被点击时，跳转activity2页面
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,Main2Activity.class);
                Bundle bundle=new Bundle();
                bundle.putString("1","test Bundle");
                intent.putExtras(bundle);
                startActivity(intent);
                //创建使用service的Intent
                //Intent intent2 = new Intent("com.example.wxiang.myapplication.abc");//隐式intent
                intent.setClass(MainActivity.this,Testservice.class);
                 startService(intent);
                Bundle bundle1=intent.getExtras();
                //intent2.setPackage("com.example.wxiang.myapplication");//隐式启动service兼容android5.0
                //startService(intent2);
            }
        });
    }
}
