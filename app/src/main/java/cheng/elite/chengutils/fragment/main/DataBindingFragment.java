package cheng.elite.chengutils.fragment.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import cheng.elite.chengutils.R;
import cheng.elite.chengutils.fragment.BaseFragment;

/**
 * Created by TC on 2018/8/8.
 */
public class DataBindingFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_data_binding, container, false);
        initView(view);
        initData();
        return view;
    }

    private void initView(View v) {

    }

    private void initData() {

    }
}
