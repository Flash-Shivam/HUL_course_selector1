package com.shivam.hul_course_selector;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.third);

        Intent activitthat = getIntent();

        String prevacg = activitthat.getExtras().getString("callAct");

        TextView v = (TextView) findViewById(R.id.ter1);
        v.setText(prevacg);
    }



}