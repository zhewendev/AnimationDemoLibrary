package com.baiheng.valueanimatordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.TextView;

/**
* author:zhewen
* description:一个完整的ValueAnimator简单示例
* date: 9/2/2019
* version:
*/
public class SimpleValueAnimatorActivity extends AppCompatActivity {

    private Button mBtn;
    private TextView mTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_value_animator);
        mBtn = (Button) findViewById(R.id.btn_start_animation);
        mTv = (TextView) findViewById(R.id.tv_content);
        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doTranslateAnimation();
            }
        });
        mTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    /**
     * 实现平移动画
     */
    public void doTranslateAnimation() {
        ValueAnimator valueAnimator = ValueAnimator.ofInt(0,500);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int curValue = (int) valueAnimator.getAnimatedValue();
                mTv.layout(curValue, curValue,curValue + mTv.getWidth(), curValue + mTv.getHeight());
            }
        });
        valueAnimator.setDuration(1000);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.start();
    }
}
