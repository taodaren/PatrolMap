package cn.bobi.patrolmap.view.fragment;

import cn.bobi.patrolmap.R;
import cn.bobi.patrolmap.view.base.BaseFragment;

/**
 * 已选位置
 */

public class TabSelectFragment extends BaseFragment {

    public static TabSelectFragment newInstance() {
        return new TabSelectFragment();
    }

    @Override
    protected int getFragmentLayout() {
        return R.layout.fragment_select;
    }

}
