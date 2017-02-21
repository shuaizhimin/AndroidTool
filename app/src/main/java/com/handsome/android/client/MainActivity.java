package com.handsome.android.client;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;


import com.handsome.android.sdk.design.adapter.BaseRecyclerAdapter;

import java.util.ArrayList;
import java.util.List;



public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private MainAdapter mMainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView=(RecyclerView)findViewById(R.id.mRecylerView);
        mMainAdapter=new MainAdapter(this);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this,3));
        mRecyclerView.setAdapter(mMainAdapter);
        initData();

        mMainAdapter.setOnItemClickListener(new BaseRecyclerAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                LaunchInfo info=mMainAdapter.getItem(position);
                Intent intent=new Intent();
                intent.setData(Uri.parse(info.schemeUrl));
                startActivity(intent);
            }
        });
    }
    private void initData(){
        List<LaunchInfo> launchInfos=new ArrayList<>();
        LaunchInfo httpInfo=new LaunchInfo();
        httpInfo.name="请求";
        httpInfo.resId=R.drawable.ic_http;

        LaunchInfo picInfo=new LaunchInfo();
        picInfo.name="图片处理";
        picInfo.resId=R.drawable.ic_pic;
        picInfo.schemeUrl="Handsome://pic.com/pic/large";

        launchInfos.add(httpInfo);
        launchInfos.add(picInfo);
        mMainAdapter.setData(launchInfos);
    }
}
