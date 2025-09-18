package cn.xfywz.tv.ui.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import cn.xfywz.tv.R;
import cn.xfywz.tv.bean.MovieSort;

import java.util.ArrayList;

/**
 * @author pj567
 * @date :2020/12/21
 * @description:
 */
public class SortAdapter extends BaseQuickAdapter<MovieSort.SortData, BaseViewHolder> {
    public SortAdapter() {
        super(R.layout.item_home_sort, new ArrayList<>());
    }

    @Override
    protected void convert(BaseViewHolder helper, MovieSort.SortData item) {
        helper.setText(R.id.tvTitle, item.name);
    }
}