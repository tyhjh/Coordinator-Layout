package com.example.tyhj.pull;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;

import java.util.ArrayList;
import java.util.List;

public class MainActivity4 extends AppCompatActivity {
    private SimpleAdapter mAdapter;
    private List<String> mDatas;
    RecyclerView rvToDoList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_simple_coordinator);
        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.maincollapsing);
        collapsingToolbar.setTitle("Title");
        rvToDoList= (RecyclerView) findViewById(R.id.rvToDoList);
        recycleView();
    }
    private void recycleView() {
        mDatas=new ArrayList<String>();
        for(int i='A';i<='z';i++){
            mDatas.add(""+(char)i);
        }
        mAdapter=new SimpleAdapter(MainActivity4.this,mDatas);
        rvToDoList.setAdapter(mAdapter);
        //设置布局管理
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        rvToDoList.setLayoutManager(linearLayoutManager);
        //分割线
        //rclv.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL_LIST));
        rvToDoList.setItemAnimator(new DefaultItemAnimator());
    }
}