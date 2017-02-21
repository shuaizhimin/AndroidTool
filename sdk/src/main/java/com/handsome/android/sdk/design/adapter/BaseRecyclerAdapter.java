package com.handsome.android.sdk.design.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

import java.util.List;

/**
 * 作者: shuaizhimin
 * 描述:
 * 日期: 2017-02-20
 * 时间: 16:48
 * 版本:
 */
public abstract class BaseRecyclerAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH>{
    protected List<T> list;
    protected LayoutInflater inflater;
    protected Context mContext;
    protected OnItemClickListener mOnItemClickListener;
    protected OnItemLongClickListener mOnItemLongClickListener;

    public BaseRecyclerAdapter(Context context) {
        this(context, null);
    }

    public BaseRecyclerAdapter(Context context, List<T> data) {
        list = data;
        inflater = LayoutInflater.from(context);
        this.mContext=context;
    }

    public List<T> getData() {
        return list;
    }

    /**
     * 设置数据
     *
     * @param data
     */
    public void setData(List<T> data) {
        list = data;
        notifyDataSetChanged();
    }

    public void appendData(List<T> data) {
        if (list == null) {
            list = data;
        } else {
            if(data==null) return;
            list.addAll(data);
        }
        notifyDataSetChanged();
    }

    public void clear() {
        if(list!=null) list.clear();
        notifyDataSetChanged();
    }

    public T getItem(int position) {
        return list.get(position);
    }


    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }



    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }

    public interface OnItemLongClickListener {
        void onItemLongClick(View view, int position);
    }

    public void setOnItemLongClickListener(OnItemLongClickListener listener) {
        this.mOnItemLongClickListener = listener;
    }
}
