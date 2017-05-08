package com.shift.ned.testcollection;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.q42.android.scrollingimageview.ScrollingImageView;
import com.shift.ned.testcollection.TestFragments.FragmentFirst;
import com.shift.ned.testcollection.TestFragments.FragmentSecond;
import com.shift.ned.testcollection.TestFragments1.ResultActivity;
import com.shift.ned.testcollection.TestFragments1.ResultsFrgment;
import com.shift.ned.testcollection.TestFragments1.TestFragment1;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button;

    FragmentFirst frag1;
    FragmentSecond frag2;
    TestFragment1  testFrag1;
    FragmentTransaction fragmentTransaction;
    Button buttonText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frag1 = new FragmentFirst();
        frag2 = new FragmentSecond();
        testFrag1 = new TestFragment1();


        Intent intent = new Intent(this, IntroActivity.class);
        startActivity(intent);


    }

    @Override
    public void onClick(View v) {
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        switch (v.getId()){
            case R.id.buttonText1:
                fragmentTransaction.replace(R.id.fragmLayout, frag2);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
        }


    }
}
