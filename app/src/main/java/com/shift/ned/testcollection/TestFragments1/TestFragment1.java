package com.shift.ned.testcollection.TestFragments1;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shift.ned.testcollection.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TestFragment1 extends Fragment {


    public TestFragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_test_fragment1, container, false);
    }

}
