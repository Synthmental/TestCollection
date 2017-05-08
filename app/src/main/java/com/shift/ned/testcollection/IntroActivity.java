package com.shift.ned.testcollection;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.widget.ScrollView;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;


public class IntroActivity extends AppIntro {

    @Override
    public void setFadeAnimation() {
        super.setFadeAnimation();
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        Toast.makeText(this, "Skip Button Pressed",Toast.LENGTH_LONG).show();
        Intent intentScrollActivity = new Intent(this, ScrollViewActivity.class);
        startActivity(intentScrollActivity);
    }

    @Override
    public void onDonePressed() {
        super.onDonePressed();

        Intent intentScrollActivity = new Intent(this, ScrollViewActivity.class);
        startActivity(intentScrollActivity);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set Vibrate
        setVibrate(true);
        setVibrateIntensity(30);

        //Change Bar Color
        setBarColor(Color.parseColor("#7200ca"));
        setSeparatorColor(Color.parseColor("#38006b"));


        //Slider 1
        addSlide(AppIntroFragment.newInstance("First", "This is First Slide",
                R.drawable.facebook,
                ContextCompat.getColor(getApplicationContext(), R.color.colorSlider)));
        //Slider 1
        addSlide(AppIntroFragment.newInstance("Second", "This is Second Slide",
                R.drawable.fashion,
                ContextCompat.getColor(getApplicationContext(), R.color.colorSlider)));
        //Slider 1
        addSlide(AppIntroFragment.newInstance("Third", "This is Third Slide",
                R.drawable.rela,
                ContextCompat.getColor(getApplicationContext(), R.color.colorSlider)));



    }
}
