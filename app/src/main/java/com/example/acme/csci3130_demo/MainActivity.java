package com.example.acme.csci3130_demo;

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

    public void clickResponse(View v){
        EditText edit =(EditText) findViewById(R.id.editText);
        TextView fd=findViewById(R.id.field);
        fd.setText(edit.getText().toString());
    }
}
