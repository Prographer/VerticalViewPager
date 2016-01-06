package untv.lab.uclls.com.lockscreen.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import untv.lab.uclls.com.lockscreen.fragment.HorizonScreenFragment;
import untv.lab.uclls.com.lockscreen.fragment.ScreenFragment;


public class HorizonScreenAdapter extends FragmentStatePagerAdapter {

    public HorizonScreenAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return HorizonScreenFragment.create(position);
    }

    @Override
    public int getCount() {
        return 3;
    }
}
