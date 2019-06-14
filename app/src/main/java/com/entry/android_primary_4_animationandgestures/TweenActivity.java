package com.entry.android_primary_4_animationandgestures;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.LinearLayout;

import com.entry.android_primary_4_animationandgestures.adapter.TweenRecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

public class TweenActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween);

        iniList();
        iniRecyclerView();
    }
    private List<String> list;

    private void iniList(){
        list = new ArrayList<>();
        for (int i = 0 ; i < 30 ; i ++){
            list.add(i + " -- tween 测试 --");
        }
    }

    private void iniRecyclerView(){
        recyclerView = findViewById(R.id.recycler);
        GridLayoutManager manager = new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(manager);

        LayoutAnimationController lac=new LayoutAnimationController(AnimationUtils
                .loadAnimation(this, R.anim.in_anim));
        lac.setDelay(0.5f);
        lac.setOrder(LayoutAnimationController.ORDER_RANDOM);
        recyclerView.setLayoutAnimation(lac);

        TweenRecyclerAdapter adapter = new TweenRecyclerAdapter(list);
        recyclerView.setAdapter(adapter);
    }

    public static void actionStart(AppCompatActivity activity){
        Intent intent = new Intent(activity, TweenActivity.class);
        activity.startActivity(intent);
    }
}
