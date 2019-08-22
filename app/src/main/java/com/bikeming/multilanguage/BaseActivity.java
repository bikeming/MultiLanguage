package com.bikeming.multilanguage;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.bikeming.multilanguage.utils.LanguageUtil;
import com.bikeming.multilanguage.utils.SpUtil;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * @ClassName: com.bikeming.multilanguage
 * @Description:
 * @author: fjm
 * @date: 2019/8/22 9:44
 * @Version:1.0
 */
public abstract class BaseActivity extends AppCompatActivity {

    private Unbinder mBind;

    protected abstract int getLayoutResId();

    protected abstract void init();

    @Override
    protected void attachBaseContext(Context newBase) {
        String language = SpUtil.getString(Constant.KEY_LANGUAGE);
        Log.d("Language---get", language+"===");
        super.attachBaseContext(LanguageUtil.attachBaseContext(newBase, language));
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());
        mBind = ButterKnife.bind(this);
        init();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mBind.unbind();
    }
}
