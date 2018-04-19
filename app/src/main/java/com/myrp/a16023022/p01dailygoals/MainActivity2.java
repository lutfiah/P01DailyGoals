package com.myrp.a16023022.p01dailygoals;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();
        String[] info = i.getStringArrayExtra("info");
        TextView tv1 = (TextView) findViewById(R.id.textView3);
        tv1.setText(info[0] + " : " + info[1] + "\n" + info[2] + " : " + info[3] + "\n" + info[4] + " : " + info[5] + "\n" + "Reflection : " + info[6] );
    }
}
