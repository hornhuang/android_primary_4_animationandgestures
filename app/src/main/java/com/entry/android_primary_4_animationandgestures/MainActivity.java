package com.entry.android_primary_4_animationandgestures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniViews();
    }

    private void iniViews(){
        Button buttonAlpha = findViewById(R.id.alpha);
        buttonAlpha.setOnClickListener(this);

        Button buttonScale = findViewById(R.id.scale);
        buttonScale.setOnClickListener(this);

        Button buttonTranslate = findViewById(R.id.translate);
        buttonTranslate.setOnClickListener(this);

        Button buttonRotate = findViewById(R.id.rotate);
        buttonRotate.setOnClickListener(this);

        Button buttonTween = findViewById(R.id.tween);
        buttonTween.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.alpha:
                AlphaAnimationActivity.actionStart(MainActivity.this);
                return;

            case R.id.scale:
                ScaleAnimationActivity.actionStart(MainActivity.this);
                return;

            case R.id.translate:
                TranslateAnimationActivity.actionStart(MainActivity.this);
                return;

            case R.id.rotate:
                RotateAnimationActivity.actionStart(MainActivity.this);
                return;

            case R.id.tween:
                TweenActivity.actionStart(MainActivity.this);
                return;
        }
    }
}
