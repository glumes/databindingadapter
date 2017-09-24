package com.glumes.sample.utils;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by glumes on 2017/9/9.
 */

public class BindingUtil {

    @BindingAdapter("imageUrl")
    public static void loadImage(ImageView view, String url) {

        Glide.with(view.getContext())
                .load(url)
                .into(view);
    }
}
