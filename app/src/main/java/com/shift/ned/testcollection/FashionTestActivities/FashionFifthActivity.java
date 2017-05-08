package com.shift.ned.testcollection.FashionTestActivities;

import android.app.Instrumentation;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.shift.ned.testcollection.R;
import com.shift.ned.testcollection.TestFragments1.ResultActivity;

public class FashionFifthActivity extends AppCompatActivity {

    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fashion_fifth);

        button1 =(Button)findViewById(R.id.buttonFashion9);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), ResultActivity.class);
                startActivity(intent);
            }
        });
    }
}
