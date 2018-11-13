package cn.bobi.patrolmap.view.fragment;

import cn.bobi.patrolmap.R;
import cn.bobi.patrolmap.view.base.BaseFragment;

/**
 * 道路管理
 */

public class TabRoadFragment extends BaseFragment {

    public static TabRoadFragment newInstance() {
        return new TabRoadFragment();
    }

    @Override
    protected int getFragmentLayout() {
        return R.layout.fragment_road;
    }

}
