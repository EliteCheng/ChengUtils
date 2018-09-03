package cheng.elite.chengutils.fragment.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cheng.elite.chengutils.R;
import cheng.elite.chengutils.view.MyButton;
import cheng.elite.chengutils.fragment.BaseFragment;

/**
 * Created by TC on 2018/8/8.
 */
public class ScorollButtonFragment extends BaseFragment {
    private MyButton mBtn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_scoroll_button, container, false);
        initView(view);
        initData();
        return view;
    }

    private void initView(View v) {
        mBtn = (MyButton) v.findViewById(R.id.ScorollToBtn);
        mBtn.setOnClickListener((view) -> {
//                ObjectAnimator.ofFloat(mBtn, "translationX", 0, 300).setDuration(3000).start();
//                ObjectAnimator.ofFloat(mBtn, "translationY", 0, 300).setDuration(3000).start();
        });
    }

    private void initData() {

    }
}
