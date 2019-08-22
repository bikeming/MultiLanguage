package com.bikeming.multilanguage;

import android.support.annotation.NonNull;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

/**
 * @ClassName: com.bikeming.multilanguage
 * @Description:
 * @author: fjm
 * @date: 2019/8/21 15:44
 * @Version:1.0
 */
public class MyAdapter extends BaseQuickAdapter<LanguageBean, BaseViewHolder> {
    public MyAdapter() {
        super(R.layout.layout_adapter_item);
    }

    @Override
    protected void convert(@NonNull BaseViewHolder helper, LanguageBean item) {
        helper.setText(R.id.tv_type, item.getRealName());
        helper.addOnClickListener(R.id.click_parent);

    }
}
