package com.glumes.sample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.glumes.databindingadapter.DataBindingAdapter;
import com.glumes.databindingadapter.Items;
import com.glumes.sample.databinding.ActivityMainBinding;
import com.glumes.sample.textitem.TextItemBinder;
import com.glumes.sample.textitem.TextModel;
import com.glumes.sample.utils.Constant;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mBinding.recyclerView.setHasFixedSize(true);
        mBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Items items = new Items();

        DataBindingAdapter mAdapter = new DataBindingAdapter();
        mAdapter.map(TextModel.class, new TextItemBinder()).setItems(items);

        mBinding.recyclerView.setAdapter(mAdapter);

        items.add(new TextModel("Headers", Constant.HEADER));
        items.add(new TextModel("Content", Constant.CONTENT));
        items.add(new TextModel("Footers", Constant.FOOTER));
        items.add(new TextModel("Payload", Constant.PAYLOAD));
        items.add(new TextModel("Refresh", Constant.REFRESH));
        items.add(new TextModel("MVVM", Constant.MVVM));


    }
}
