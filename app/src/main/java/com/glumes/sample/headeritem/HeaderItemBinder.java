package com.glumes.sample.headeritem;

import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.glumes.databindingadapter.ViewHolderBinder;
import com.glumes.sample.R;
import com.glumes.sample.databinding.HeaderLayoutBinding;

/**
 * @author glumes
 */

public class HeaderItemBinder extends ViewHolderBinder<HeaderModel, HeaderViewHolder> {


    @Override
    public HeaderViewHolder createViewHolder(LayoutInflater inflater, ViewGroup parent) {
        HeaderLayoutBinding mBinding = DataBindingUtil.inflate(inflater, R.layout.header_layout, parent, false);
        return new HeaderViewHolder(mBinding);
    }

    @Override
    public void onBindViewHolder(HeaderViewHolder holder, HeaderModel data) {
        holder.onBind(data);
    }
}
