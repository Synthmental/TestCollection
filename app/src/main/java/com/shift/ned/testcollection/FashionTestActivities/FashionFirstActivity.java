package com.shift.ned.testcollection.FashionTestActivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.shift.ned.testcollection.R;

public class FashionFirstActivity extends AppCompatActivity {

    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fashion_first);

        button1 =(Button)findViewById(R.id.buttonFashion1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), FashionSecondActivity.class);
                startActivity(intent);
            }
        });

    }
}
