package com.baiheng.tweenanimationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mScaleBtn;
    private Animation mScaleAnimation;
    private TextView mContentTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScaleAnimation = AnimationUtils.loadAnimation(this,R.anim.scale);
        mScaleBtn = (Button) findViewById(R.id.btn_scale_animation);
        mContentTv = (TextView) findViewById(R.id.tv_content);

        mScaleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mContentTv.startAnimation(mScaleAnimation);
            }
        });
    }
}
