package com.baiheng.frameanimationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button mBtn;
    private ImageView mImg;
    private AnimationDrawable mAnimationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtn = (Button) findViewById(R.id.btn_stop_animation);
        mImg = (ImageView) findViewById(R.id.img_frame_animation);
        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAnimationDrawable.stop();
            }
        });
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        //方式一
//        mImg.setBackgroundResource(R.drawable.frame_animation);
//        mAnimationDrawable = (AnimationDrawable) mImg.getBackground();
//        mAnimationDrawable.start();
        //方式二
//        mImg.setImageResource(R.drawable.frame_animation);
//        mAnimationDrawable = (AnimationDrawable) mImg.getDrawable();
//        mAnimationDrawable.start();
        //方式三
        mAnimationDrawable = (AnimationDrawable) getResources().getDrawable(R.drawable.frame_animation,null);
        mImg.setBackground(mAnimationDrawable);
        mAnimationDrawable.start();
    }
}
