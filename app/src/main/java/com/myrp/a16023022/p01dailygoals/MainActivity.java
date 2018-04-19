package com.myrp.a16023022.p01dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDone = (Button) findViewById(R.id.button);
        btnDone.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                RadioGroup radioG = (RadioGroup) findViewById(R.id.radioGroup1);
                RadioGroup radioG2 = (RadioGroup) findViewById(R.id.radioGroup2);
                RadioGroup radioG3 = (RadioGroup) findViewById(R.id.radioGroup3);

                int selectedButtonId = radioG.getCheckedRadioButtonId();
                int selectedButtonId2 = radioG2.getCheckedRadioButtonId();
                int selectedButtonId3 = radioG3.getCheckedRadioButtonId();

                RadioButton radioB = (RadioButton)findViewById(selectedButtonId);
                RadioButton radioB2 = (RadioButton)findViewById(selectedButtonId2);
                RadioButton radioB3 = (RadioButton)findViewById(selectedButtonId3);

                TextView textViewQuest = (TextView) findViewById(R.id.textView);
                TextView textViewQuest2 = (TextView) findViewById(R.id.textView2);
                TextView textViewQuest3 = (TextView) findViewById(R.id.textView3);

                EditText etName = (EditText) findViewById(R.id.editText);

                String[] info = {textViewQuest.getText().toString(), radioB.getText().toString(), textViewQuest2.getText().toString(), radioB.getText().toString(), textViewQuest3.getText().toString(), radioB3.getText().toString(), etName.getText().toString() };

                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                //Pass the String array holding the name & age to new activity
                i.putExtra("info", info);
                //Start the new activity
                startActivity(i);
            }
        });
    }
}
