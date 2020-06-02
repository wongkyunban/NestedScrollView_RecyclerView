package com.wong.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 运单号列表
        mRV = (RecyclerView) findViewById(R.id.rv_num);
        // 防止卡顿
        mRV.setHasFixedSize(true);
        mRV.setNestedScrollingEnabled(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setSmoothScrollbarEnabled(true);
        // 取消recycleview的滑动
        mRV.setLayoutManager(linearLayoutManager);
        List<String> list = new ArrayList<>();
        for(int i = 0; i < 30;i++){
            list.add("020-88888"+i);
        }
        mRV.setAdapter(new RVAdapter(list));
    }
}
