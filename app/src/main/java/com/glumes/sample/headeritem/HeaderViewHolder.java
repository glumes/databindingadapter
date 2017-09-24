package com.glumes.sample.headeritem;

import com.glumes.databindingadapter.BindingViewHolder;
import com.glumes.sample.databinding.HeaderLayoutBinding;


/**
 * @author glumes
 */

public class HeaderViewHolder extends BindingViewHolder<HeaderModel, HeaderLayoutBinding> {

    public HeaderViewHolder(HeaderLayoutBinding binding) {
        super(binding);
    }

    @Override
    protected void onBind(HeaderModel data) {
        mBinding.setViewmodel(data);

    }
}
