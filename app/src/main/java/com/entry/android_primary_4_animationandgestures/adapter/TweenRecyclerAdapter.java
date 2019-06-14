package com.entry.android_primary_4_animationandgestures.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.entry.android_primary_4_animationandgestures.R;

import java.util.ArrayList;
import java.util.List;

public class TweenRecyclerAdapter extends RecyclerView.Adapter<TweenRecyclerAdapter.ViewHoulder> {

    private List<String> mList = new ArrayList<>();

    class ViewHoulder extends RecyclerView.ViewHolder {

        TextView name;

        public ViewHoulder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.text);
        }

    }

    public TweenRecyclerAdapter(List<String> list){
        mList = list;
    }

    @NonNull
    @Override
    public ViewHoulder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list, viewGroup, false);
        return new ViewHoulder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoulder viewHoulder, int i) {
        viewHoulder.name.setText(mList.get(i));
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

}
