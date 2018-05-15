package com.example.asterisk.intentexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity{
    TextView tv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirdlayout);
        tv=findViewById(R.id.text);
        String sentData=getIntent().getExtras().getString("mykey");
        tv.setText("Data is "+sentData);
    }
}
