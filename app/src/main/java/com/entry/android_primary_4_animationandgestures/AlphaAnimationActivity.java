package com.entry.android_primary_4_animationandgestures;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**alpha
 * @anthor _yuanhao
 */
public class AlphaAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpha_animation);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.alpha_anim);
        animation.setFillAfter(false);// 变化之后是永久更改还是恢复原样

        ImageView imageView = findViewById(R.id.image);
        imageView.startAnimation(animation);

        TextView textView   = findViewById(R.id.text);
        textView.startAnimation(animation);
    }

    public static void actionStart(AppCompatActivity activity){
        Intent intent = new Intent(activity, AlphaAnimationActivity.class);
        activity.startActivity(intent);
    }
}
