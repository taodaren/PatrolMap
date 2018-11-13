package cn.bobi.patrolmap.view.fragment;

import cn.bobi.patrolmap.R;
import cn.bobi.patrolmap.view.base.BaseFragment;

/**
 * 地图状态
 */

public class TabMapFragment extends BaseFragment {

    public static TabMapFragment newInstance() {
        return new TabMapFragment();
    }

    @Override
    protected int getFragmentLayout() {
        return R.layout.fragment_map;
    }

}
