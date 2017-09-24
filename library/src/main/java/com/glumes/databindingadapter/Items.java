package com.glumes.databindingadapter;

import android.databinding.ObservableArrayList;


public class Items extends ObservableArrayList<Object> {


    DataBindingAdapter mAdapter;

    public Items() {
        super();
    }

    public void setAdapter(DataBindingAdapter adapter) {
        mAdapter = adapter;
    }

    public void addFirst(Object obj) {
        set(0, obj);
    }

    public void addLast(Object obj) {
        int length = size();
        add(length, obj);
    }

    public void setEmpty(Object obj) {
        clear();
        add(obj);
    }

    public void notifyItemRangeChanged(int positionStart, int itemCount, Object payload) {
        mAdapter.notifyItemRangeChanged(positionStart, itemCount, payload);
    }

    public void notifyItemChanged(int position, Object payload) {
        mAdapter.notifyItemChanged(position, payload);
    }

}
