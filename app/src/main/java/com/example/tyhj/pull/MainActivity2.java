package com.example.tyhj.pull;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    private SimpleAdapter mAdapter;
    private List<String> mDatas;
    RecyclerView rvToDoList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
         rvToDoList= (RecyclerView) findViewById(R.id.rvToDoList);
        recycleView();
    }


    private void recycleView() {
        mDatas=new ArrayList<String>();
        for(int i='A';i<='z';i++){
            mDatas.add(""+(char)i);
        }
        mAdapter=new SimpleAdapter(MainActivity2.this,mDatas);
        rvToDoList.setAdapter(mAdapter);
        //设置布局管理
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        rvToDoList.setLayoutManager(linearLayoutManager);
        //分割线
        //rclv.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL_LIST));
        rvToDoList.setItemAnimator(new DefaultItemAnimator());
    }
}
