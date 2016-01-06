package untv.lab.uclls.com.lockscreen.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import untv.lab.uclls.com.lockscreen.R;

/**
 * Created by Prograper on 2016-01-06.
 */
public class ScreenFragment extends Fragment {

    private int mPageNumber;

    public static ScreenFragment create(int pageNumber) {
        ScreenFragment fragment = new ScreenFragment();
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
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fm_screen, container, false);
        ((TextView) rootView.findViewById(R.id.txt_msg)).setText("Page Number: " + mPageNumber);
        return rootView;
    }
}
