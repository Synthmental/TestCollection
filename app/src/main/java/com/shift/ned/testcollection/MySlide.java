package com.shift.ned.testcollection;

import android.app.Fragment;
import android.graphics.Color;
import android.support.annotation.ColorInt;

import com.github.paolorotolo.appintro.ISlideBackgroundColorHolder;

/**
 * Created by Andrey on 07.05.2017.
 */

public class MySlide extends Fragment implements ISlideBackgroundColorHolder {
    @Override
    public int getDefaultBackgroundColor() {
        // Return the default background color of the slide.
        return Color.parseColor("#000000");
    }

    @Override
    public void setBackgroundColor(@ColorInt int backgroundColor) {
// Set the background color of the view within your slide to which the transition should be applied.


        }
    }
