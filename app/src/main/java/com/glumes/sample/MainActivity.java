package com.glumes.sample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;

import com.glumes.databindingadapter.DataBindingAdapter;
import com.glumes.databindingadapter.Items;
import com.glumes.sample.databinding.ActivityMainBinding;
import com.glumes.sample.imageitem.ImageItemBinder;
import com.glumes.sample.imageitem.ImageModel;
import com.glumes.sample.textitem.TextItemBinder;
import com.glumes.sample.textitem.TextModel;
import com.glumes.sample.utils.Constant;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mBinding;
    private Items mItems;
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mBinding.setClickHandler(this);

        mBinding.recyclerView.setHasFixedSize(true);
        mBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));

        mItems = new Items();

        DataBindingAdapter mAdapter = new DataBindingAdapter();
        mAdapter.map(TextModel.class, new TextItemBinder())
                .map(ImageModel.class, new ImageItemBinder())
                .setItems(mItems);

        mBinding.recyclerView.setAdapter(mAdapter);

        makeData();

    }

    private void makeData() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                mItems.add(new TextModel("Content num is " + i, Constant.CONTENT));
            } else {
                mItems.add(new ImageModel(R.drawable.databinding, "databinding num is " + i));
            }
        }
    }

    public void add() {
        mItems.add(new ImageModel(R.drawable.scene, "num is " + mItems.size()));
    }

    public void insert() {
        if (mItems.size() > 3) {
            mItems.add(mItems.size() - 3, new ImageModel(R.drawable.image, "insert"));
        }
    }

    public void delete() {
        if (!mItems.isEmpty()) {
            mItems.remove(mItems.size() - 1);
        }
    }

    public void clear() {
        mItems.clear();
    }
}
