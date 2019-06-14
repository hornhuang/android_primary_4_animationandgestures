package com.entry.android_primary_4_animationandgestures;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class RotateAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotate_animation);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotate_anim);
        animation.setFillAfter(false);// 变化之后是永久更改还是恢复原样

        ImageView imageView = findViewById(R.id.scale_image);
        imageView.startAnimation(animation);

        TextView textView   = findViewById(R.id.scale_text);
        textView.startAnimation(animation);
    }

    public static void actionStart(AppCompatActivity activity){
        Intent intent = new Intent(activity, RotateAnimationActivity.class);
        activity.startActivity(intent);
    }
}
