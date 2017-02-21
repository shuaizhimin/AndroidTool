package com.handsome.android.client;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.handsome.android.sdk.design.adapter.BaseRecyclerAdapter;


/**
 * 作者: shuaizhimin
 * 描述:
 * 日期: 2017-02-20
 * 时间: 16:52
 * 版本:
 */
public class MainAdapter extends BaseRecyclerAdapter<LaunchInfo, MainAdapter.ViewHolder> {
    public MainAdapter(Context context) {
        super(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.main_items, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        LaunchInfo info = getItem(position);
        holder.img.setImageResource(info.resId);
        holder.text.setText(info.name);
        holder.linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mOnItemClickListener != null) {
                    mOnItemClickListener.onItemClick(v, position);
                }
            }
        });
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView img;
        public TextView text;
        public LinearLayout linear;

        public ViewHolder(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.img);
            text = (TextView) itemView.findViewById(R.id.text);
            linear = (LinearLayout) itemView.findViewById(R.id.linear);
        }
    }
}
