package com.wong.demo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.MyViewHolder> {
    private List<String> list = new ArrayList<>();
    public RVAdapter(List<String> list){
        this.list.addAll(list);
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.num_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.mTVAwbno.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView mTVAwbno;
        public MyViewHolder(View itemView) {
            super(itemView);
            mTVAwbno = (TextView)itemView.findViewById(R.id.tv_num);
        }
    }
}

