package com.glumes.sample.imageitem;

import com.glumes.databindingadapter.BindingViewHolder;
import com.glumes.sample.databinding.ImageLayoutBinding;

/**
 * @author glumes
 */

public class ImageViewHolder extends BindingViewHolder<ImageModel, ImageLayoutBinding> {


    public ImageViewHolder(ImageLayoutBinding binding) {
        super(binding);
    }

    @Override
    protected void onBind(ImageModel data, int position) {
        mBinding.setViewmodel(data);
        mBinding.executePendingBindings();
    }
}
