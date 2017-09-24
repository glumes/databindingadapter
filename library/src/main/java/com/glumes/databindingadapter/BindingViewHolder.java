package com.glumes.databindingadapter;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;


public abstract class BindingViewHolder<T, D extends ViewDataBinding> extends RecyclerView.ViewHolder {

    protected D mBinding;

    public BindingViewHolder(D binding) {
        super(binding.getRoot());
        this.mBinding = binding;
    }

    protected abstract void onBind(T data);

    protected void onBind(T data, Object payload) {
        onBind(data);
    }

    public D getBinding() {
        return mBinding;
    }
}
