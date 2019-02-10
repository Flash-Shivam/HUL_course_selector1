package com.shivam.hul_course_selector;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Fourth extends Activity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fourth);

        Intent activitthat = getIntent();

        String p = activitthat.getExtras().getString("callA");

        TextView v = (TextView) findViewById(R.id.tr);

        Button f = (Button) findViewById(R.id.but2);
        Button g = (Button) findViewById(R.id.but);

        v.setText(p);


    }





}

