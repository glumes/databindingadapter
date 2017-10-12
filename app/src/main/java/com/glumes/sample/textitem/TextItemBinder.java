package com.glumes.sample.textitem;

import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.glumes.databindingadapter.ViewHolderBinder;
import com.glumes.sample.R;
import com.glumes.sample.databinding.TextLayoutBinding;

/**
 * @author glumes
 */

public class TextItemBinder extends ViewHolderBinder<TextModel, TextViewHolder> {


    @Override
    public TextViewHolder createViewHolder(LayoutInflater inflater, ViewGroup parent) {
        TextLayoutBinding binding = DataBindingUtil.inflate(inflater, R.layout.text_layout, parent, false);
        return new TextViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(TextViewHolder holder, TextModel data, int position) {
        holder.onBind(data, position);
    }

}
