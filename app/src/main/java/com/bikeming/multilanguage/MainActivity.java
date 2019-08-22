package com.bikeming.multilanguage;

import android.content.Intent;
import android.widget.Button;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * @ClassName: com.bikeming.multilanguage
 * @Description:
 * @author: fjm
 * @date: 2019/8/21 15:17
 * @Version:1.0
 */
public class MainActivity extends BaseActivity {
    @BindView(R.id.bt_change)
    Button mBtChange;

    @Override
    protected int getLayoutResId() {
        return R.layout.layout_main;
    }

    @Override
    protected void init() {

    }

    @OnClick(R.id.bt_change)
    public void onViewClicked() {
        startActivityForResult(new Intent(MainActivity.this, LanguageChooseActivity.class), 2);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            recreate();
        }
    }
}
