package untv.lab.uclls.com.lockscreen.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import untv.lab.uclls.com.lockscreen.R;
import untv.lab.uclls.com.lockscreen.adapter.ScreenAdapter;
import untv.lab.uclls.com.lockscreen.widget.VerticalViewPager;

/**
 * Created by Prograper on 2016-01-06.
 */
public class HorizonScreenFragment extends Fragment {

    private int mPageNumber;

    public static HorizonScreenFragment create(int pageNumber) {
        HorizonScreenFragment fragment = new HorizonScreenFragment();
        Bundle args = new Bundle();
        args.putInt("page", pageNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPageNumber = getArguments().getInt("page");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (mPageNumber == 0) {
            ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.widget_vertical_viewpager, container, false);
            VerticalViewPager verticalViewPager = (VerticalViewPager) rootView.findViewById(R.id.pager);
            verticalViewPager.setAdapter(new ScreenAdapter(((AppCompatActivity) getActivity()).getSupportFragmentManager()));
            return rootView;
        } else {
            ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fm_transparent, container, false);
            return rootView;
        }
    }
}
