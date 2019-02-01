package com.example.pablo_mp4_part1;
//Author Pablo

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displaytext(View view) {
        TextView ot = (TextView) findViewById(R.id.output_text);
        EditText et = (EditText) findViewById(R.id.editText);

        //Get text
        String newt = et.getText().toString();

        //Send it back out!~
        ot.setText(newt);
    }
}
