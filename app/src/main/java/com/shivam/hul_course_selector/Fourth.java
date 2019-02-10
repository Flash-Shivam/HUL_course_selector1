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

import org.w3c.dom.Text;

public class Fourth extends Activity {


    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fourth);

        Intent activitthat = getIntent();

        String p = activitthat.getExtras().getString("callA");

        TextView v = (TextView) findViewById(R.id.tr);

        db = openOrCreateDatabase("My Database", MODE_PRIVATE, null);

        db.execSQL("Create table if not exists Mytable (a String,b String);");


         String a = "", b = "", c = "", d = "";

        int e = 0;

        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '@') {
                e = 1;
            }

            if (p.charAt(i) == '%') {
                e = 2;
            }

            if (p.charAt(i) == '#') {
                e = 3;
            }

            if (e == 0) {
                a = a + p.charAt(i);
            } else if (e == 1) {
                if (p.charAt(i) != '@')
                    b = b + p.charAt(i);
            } else if (e == 2) {
                if (p.charAt(i) != '%')
                    c = c + p.charAt(i);
            } else if (e == 3) {
                if (p.charAt(i) != '#')
                    d = d + p.charAt(i);
            }
        }
            final String aa = a,bb=b;
        Button f = (Button) findViewById(R.id.but2);
        Button g = (Button) findViewById(R.id.but);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sr();
            }
        });

        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Wr(aa,bb);
            }
        });

    }

    public void Wr(String a,String b){

        db.execSQL("Insert into MyTable values (" + a + "," + b + ");");
    }

    public void Sr(){
        Cursor cq;
        String temp;
        String Data = "";

        cq = db.rawQuery("Select * from MyTable;", null);

        cq.moveToFirst();

        for (int i = 0; cq.moveToPosition(i); i++) {
            temp = cq.getString(0);
            Data = Data + temp;
            temp = cq.getString(1);
            Data = Data + temp;
        }
        TextView qw = (TextView) findViewById(R.id.tr);
        qw.setText(Data);
    }

}

