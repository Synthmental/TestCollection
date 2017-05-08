package com.shift.ned.testcollection;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.github.pedrovgs.DraggablePanel;
import com.shift.ned.testcollection.TestFragments.FragmentFirst;
import com.shift.ned.testcollection.TestFragments.FragmentSecond;

public class ScrollViewActivity extends AppCompatActivity {

    ImageView imageView1;
    ImageView imageView2;
    DraggablePanel draggablePanel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);

        draggablePanel = (DraggablePanel)findViewById(R.id.draggable_panel);
        draggablePanel.setFragmentManager(getSupportFragmentManager());
        draggablePanel.setTopFragment(new FragmentFirst());
        draggablePanel.setBottomFragment(new FragmentSecond());
        draggablePanel.setTopViewHeight(500);
        draggablePanel.initializeView();

        imageView1 = (ImageView) findViewById(R.id.scrollImage1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            draggablePanel.maximize();
            }
        });

        imageView2 = (ImageView) findViewById(R.id.scrollImage2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                draggablePanel.maximize();
            }
        });



    }

}
