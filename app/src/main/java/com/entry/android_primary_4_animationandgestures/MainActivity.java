package com.entry.android_primary_4_animationandgestures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniViews();
    }

    private void iniViews(){
        Button button = findViewById(R.id.alpha);
        button.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.alpha:
                AlphaAnimationActivity.actionStart(MainActivity.this);
                return;
        }
    }
}
