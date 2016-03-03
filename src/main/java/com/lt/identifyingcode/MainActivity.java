package com.lt.identifyingcode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ValidationCode mValicationCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mValicationCode = (ValidationCode) findViewById(R.id.validationCode);
        mValicationCode.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this,mValicationCode.getCodeString(),0).show();
    }
}
