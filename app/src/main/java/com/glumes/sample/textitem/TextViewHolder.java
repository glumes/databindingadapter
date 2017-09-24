package com.glumes.sample.textitem;


import android.view.View;

import com.glumes.databindingadapter.BindingViewHolder;
import com.glumes.sample.databinding.TextLayoutBinding;

/**
 * @author glumes
 */

public class TextViewHolder extends BindingViewHolder<TextModel, TextLayoutBinding> {

    public TextViewHolder(TextLayoutBinding binding) {
        super(binding);
    }

    @Override
    protected void onBind(TextModel data) {
        mBinding.setViewmodel(data);
        mBinding.executePendingBindings();
        mBinding.container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}
