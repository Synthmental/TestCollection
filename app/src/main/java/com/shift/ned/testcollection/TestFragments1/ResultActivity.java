package com.shift.ned.testcollection.TestFragments1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.shift.ned.testcollection.R;

import java.util.Random;

public class ResultActivity extends AppCompatActivity {

    private String[] TextList = { "Text1", "Text2", "Text3", "1", "2", "5", "afsadfds", "dqwdqwd"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);




        TextView yourTextView = (TextView)findViewById(R.id.textViewRandom);
        Random random = new Random();
        String randomText = TextList[random.nextInt(TextList.length)];
        yourTextView.setText(randomText);
    }
}
