package com.glumes.sample.imageitem;

import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.glumes.databindingadapter.ViewHolderBinder;
import com.glumes.sample.R;
import com.glumes.sample.databinding.ImageLayoutBinding;

/**
 * @author glumes
 */

public class ImageItemBinder extends ViewHolderBinder<ImageModel, ImageViewHolder> {


    @Override
    public ImageViewHolder createViewHolder(LayoutInflater inflater, ViewGroup parent) {
        ImageLayoutBinding mBinding = DataBindingUtil.inflate(inflater, R.layout.image_layout, parent, false);
        return new ImageViewHolder(mBinding);
    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, ImageModel data, int position) {
        holder.onBind(data, position);
    }
}
