package cheng.elite.chengutils.activity;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BaseActivity extends AppCompatActivity {

    public Context context;
    //若MainAty继承于baseActivity，那么TAG就为MainAty
    protected String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.context = this;
    }
    //可以用来定义回调的接口规范
    public interface Callback {
        void onStateChanged(Object object);
    }
}
