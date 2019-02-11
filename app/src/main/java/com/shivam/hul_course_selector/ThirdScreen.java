package com.shivam.hul_course_selector;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class ThirdScreen extends Activity {

    final String ar [] = new String[]{"Good","Bad",};

    final String arr [] = new String[]{"chill","Fighter",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.third);

        Intent activitthat = getIntent();

        String prevacg = activitthat.getExtras().getString("callAct");

        TextView v = (TextView) findViewById(R.id.ter1);



        AutoCompleteTextView ed = findViewById(R.id.yar3);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1 ,ar   );
        ed.setAdapter(adapter);

        AutoCompleteTextView ea = findViewById(R.id.yar4);
        ArrayAdapter<String> adapterr = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1 ,arr   );
        ea.setAdapter(adapterr);

    }




    public void Cha(View view) {



        EditText r = (EditText) findViewById(R.id.yar);
        EditText s = (EditText) findViewById(R.id.yar2);
        EditText t = (EditText) findViewById(R.id.yar3);
        EditText v = (EditText) findViewById(R.id.yar4);
        EditText w = (EditText) findViewById(R.id.yar5);

        String send = r.getText().toString() + "@" + s.getText().toString() + "%" + t.getText().toString() + "#" + v.getText().toString() + "$" + w.getText().toString();

        Intent goingback = new Intent();

        goingback.putExtra("Course Details",send);

        setResult(RESULT_OK,goingback);

        finish();
    }



}