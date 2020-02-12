package com.chintalapatinithya.firstapp.lab02;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button submitButton;
    EditText responseText;
    TextView displayText;
    TextView arrayText;
    Button arrayButton;
    int i = 0;
    String[] array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        array = getResources().getStringArray(R.array.array);
        submitButton=findViewById(R.id.clickButton);
        responseText=findViewById(R.id.response2EditText);
        displayText=findViewById(R.id.displayText);
        arrayText = findViewById(R.id.arrayText);
        arrayButton = findViewById(R.id.arrayButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.i("testButton","Heyy!");
                //Log.i("testButton","Heyy! "+responseText.getText().toString());
                displayText.setText("Hi " + responseText.getText().toString());
            }
        });



        arrayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.i("testButton","Heyy!");
                //Log.i("testButton","Heyy! "+responseText.getText().toString());
                arrayText.setText(array[i%3]);
                i++;
            }
        });


    }
}
