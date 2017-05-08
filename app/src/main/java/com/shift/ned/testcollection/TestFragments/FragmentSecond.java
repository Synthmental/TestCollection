package com.shift.ned.testcollection.TestFragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.shift.ned.testcollection.R;
//
//import static com.shift.ned.testcollection.R.id.imageView8;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSecond extends Fragment {




    public FragmentSecond() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_second, container, false);
        return view;


    }

}
