package com.dalimao.mytaxi.splash;

import android.databinding.DataBindingUtil;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

import com.dalimao.mytaxi.R;
import com.dalimao.mytaxi.databinding.ActivitySplashBinding;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySplashBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_splash);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
        {
            AnimatedVectorDrawable drawableAnim = (AnimatedVectorDrawable) getResources().getDrawable(R.drawable.anim);
            binding.logo.setImageDrawable(drawableAnim);
            drawableAnim.start();
        }
    }
}
