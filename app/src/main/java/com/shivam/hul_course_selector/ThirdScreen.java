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

import java.util.Random;

public class ThirdScreen extends Activity {

    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.third);

        Intent activitthat = getIntent();

        String prevacg = activitthat.getExtras().getString("callAct");

        TextView v = (TextView) findViewById(R.id.ter1);

        db = openOrCreateDatabase("My Database", MODE_PRIVATE, null);

        db.execSQL("Create table if not exists Mytable (Roll int,Marks int);");

        Button tr = (Button) findViewById(R.id.Register);

        tr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Wr();
            }
        });

        Button f = (Button) findViewById(R.id.View) ;
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Sr();

            }
        });

    }


    public void Wr(){

        int roll,marks;
        Random r = new Random();
        roll=r.nextInt(40);
        marks=r.nextInt(100);
        db.execSQL("Insert into MyTable values (" + Integer.toString(roll) + ", " + Integer.toString(marks) + ");");

    }

    public void Cha(View view) {

        Intent chanescreen = new Intent(this,Fourth.class);

        EditText r = (EditText) findViewById(R.id.yar);
        EditText s = (EditText) findViewById(R.id.yar2);
        EditText t = (EditText) findViewById(R.id.yar3);
        EditText v = (EditText) findViewById(R.id.yar4);
        chanescreen.putExtra("callA",r.getText().toString()+" "+s.getText().toString()+" "+t.getText().toString()+" "+v.getText().toString());

        startActivity(chanescreen);
    }


    public void Sr(){
        Cursor cq;
        int temp;
        String Data = "";

        cq = db.rawQuery("Select * from MyTable;", null);

        cq.moveToFirst();

        for (int i = 0; cq.moveToPosition(i); i++) {
            temp = cq.getInt(0);
            Data = Data + Integer.toString(temp);
            temp = cq.getInt(1);
            Data = Data + Integer.toString(temp);
        }
        TextView qw = (TextView) findViewById(R.id.feedback);
        qw.setText(Data);
    }
}