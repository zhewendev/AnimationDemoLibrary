package com.baiheng.valueanimatordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mBtn;
    private TextView mTv;
    private Button mBtn1;   //跳转跳转ValueAnimator示例

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtn = (Button) findViewById(R.id.btn_start_animation);
        mTv = (TextView) findViewById(R.id.tv_content);
        mBtn1 = (Button) findViewById(R.id.btn_second);
        mBtn.setOnClickListener(this);
        mTv.setOnClickListener(this);
        mBtn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.btn_start_animation:
                TranslateAnimation translateAnimation = new TranslateAnimation(Animation.ABSOLUTE,0,Animation.ABSOLUTE,400,
                        Animation.ABSOLUTE,0,Animation.ABSOLUTE,500);
                translateAnimation.setDuration(1000);
                translateAnimation.setFillAfter(true);
                mTv.startAnimation(translateAnimation);
                break;
            case R.id.btn_second:
                Intent intent = new Intent(this,SimpleValueAnimatorActivity.class);
                startActivity(intent);
            default:
                break;
        }
    }
}
