package com.shift.ned.testcollection.TestFragments;


import android.app.Instrumentation;
import android.content.Intent;
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
import android.widget.Toast;

import com.shift.ned.testcollection.IntroActivity;
import com.shift.ned.testcollection.R;
import com.shift.ned.testcollection.TestFragments1.ResultActivity;
import com.shift.ned.testcollection.TestFragments1.ResultsFrgment;
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

        Button button = (Button) view.findViewById(R.id.button8);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Skip Button Pressed",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getActivity(), ResultActivity.class);
                startActivity(intent);
            }
        });



        return view;


    }

}
