package cn.xfywz.tv.ui.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import cn.xfywz.tv.R;

import java.util.ArrayList;

public class PinyinAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    public PinyinAdapter() {
        super(R.layout.item_search_word_hot, new ArrayList<>());
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        helper.setText(R.id.tvSearchWord, item);
    }
}