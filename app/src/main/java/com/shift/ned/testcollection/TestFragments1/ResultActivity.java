package com.shift.ned.testcollection.TestFragments1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.shift.ned.testcollection.R;

import java.util.Random;

public class ResultActivity extends AppCompatActivity {

    Button buttonShare;

    private String[] TextList = { "Text1", "Text2", "Text3", "1", "2", "5", "afsadfds", "dqwdqwd"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView yourTextView = (TextView)findViewById(R.id.textViewRandom);
        Random random = new Random();
        final String randomText = TextList[random.nextInt(TextList.length)];
        yourTextView.setText(randomText);

        buttonShare = (Button) findViewById(R.id.shareButton);
        buttonShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,"Я набрал " + randomText + " В тестах 10 ");  //Text to share
                startActivity(Intent.createChooser(intent, "Dialog title text"));
            }
        });
    }
}
