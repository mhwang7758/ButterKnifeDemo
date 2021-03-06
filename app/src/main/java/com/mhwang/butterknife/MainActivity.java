package com.mhwang.butterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.tv_test)
    TextView tv_test;
    @BindView(R.id.btn_click)
    Button btn_click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        tv_test.setText("你好呀");

    }
    @OnClick(R.id.btn_click) void onBtnClick(){
        tv_test.setText("点击了");
    }
}
