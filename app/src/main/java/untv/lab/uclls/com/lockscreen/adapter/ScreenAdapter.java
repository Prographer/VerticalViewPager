package untv.lab.uclls.com.lockscreen.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import untv.lab.uclls.com.lockscreen.fragment.ScreenFragment;

/**
 * Created by Prograper on 2016-01-06.
 */
public class ScreenAdapter extends FragmentStatePagerAdapter {

    public ScreenAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return ScreenFragment.create(position);
    }

    @Override
    public int getCount() {
        return 5;
    }
}
