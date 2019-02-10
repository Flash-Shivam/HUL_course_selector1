package com.shivam.hul_course_selector;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.third);

        Intent activitthat = getIntent();

        String prevacg = activitthat.getExtras().getString("callAct");

        TextView v = (TextView) findViewById(R.id.ter1);

    }


    public void Cha(View view) {

        Intent chanescreen = new Intent(this,Fourth.class);

        EditText r = (EditText) findViewById(R.id.yar);
        EditText s = (EditText) findViewById(R.id.yar2);
        EditText t = (EditText) findViewById(R.id.yar3);
        EditText v = (EditText) findViewById(R.id.yar4);
        chanescreen.putExtra("callA",r+"@"+s+"%"+t+"#"+v);

        startActivity(chanescreen);
    }
}