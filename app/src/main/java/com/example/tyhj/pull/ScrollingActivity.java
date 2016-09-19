package com.example.tyhj.pull;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class ScrollingActivity extends Activity implements View.OnClickListener{
    Button btn1,btn2,btn3,btn4,btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        btn1= (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn2= (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        btn3= (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        btn4= (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
        btn5= (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                startActivity(new Intent(ScrollingActivity.this,MainActivity1.class));
            break;
            case R.id.btn2:
                startActivity(new Intent(ScrollingActivity.this,MainActivity2.class));
                break;
            case R.id.btn3:
                startActivity(new Intent(ScrollingActivity.this,MainActivity3.class));
                break;
            case R.id.btn4:
                startActivity(new Intent(ScrollingActivity.this,MainActivity4.class));
                break;
            case R.id.btn5:
                startActivity(new Intent(ScrollingActivity.this,MainActivity5.class));
                break;
        }
    }
}
