package com.shivam.hul_course_selector;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.Float;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> Course = new ArrayList<String>();
         //   "HUL212-Micro","HUL213-Macro","HUL232-Modern_Fiction","HUL239-Indian_Fiction",

    String we="";
    String ab;
    String cd;
    String pq;
    String zz;
    RadioGroup rg ;
    RadioButton rb ;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         rg  =  findViewById(R.id.Radio_group);

        Course.add("HUL212-Micro");
        Course.add("HUL213-Macro");
        Course.add("HUL232-Modern_Fiction");
        Course.add("HUL239-Indian_Fiction");

        Button z = findViewById(R.id.gn);
        Button as = (Button) findViewById(R.id.xd);
        as.setOnClickListener(new View.OnClickListener() {
            @Override

          /*  AutoCompleteTextView eq = (AutoCompleteTextView) findViewById(R.id.Auto);
            ArrayList<String> Courses = new ArrayList<String>();*/



            public void onClick(View v) {

                AutoCompleteTextView eq = (AutoCompleteTextView) findViewById(R.id.Auto);
                Course.add(we);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(getBaseContext() ,android.R.layout.simple_list_item_1 ,Course);
                eq.setAdapter(adapter);
                we ="added";


            }


        });


        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AutoCompleteTextView ed = findViewById(R.id.Auto);
                TextView x = findViewById(R.id.cn);
                String q= ed.getText().toString();


                 if(q.equals("HUL212-Micro"))
                {
                    x.setText("Microeconomics");
                }
                else  if(q.equals("HUL213-Macro"))
                {
                    x.setText("Macroeconomics");
                }
                else if(q.equals("HUL232-Modern_Fiction"))
                {
                    x.setText("Modern Indian fiction in Translation");
                }
                else if(q.equals("HUL239-Indian_Fiction"))
                {
                    x.setText("Indian fiction in English");
                }
                else if(we.equals("added")) {
                     x.setText(q);
                 }




            }
        });

        AutoCompleteTextView ed = findViewById(R.id.Auto);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1 ,Course   );
        ed.setAdapter(adapter);

    }

    public void checkButton(View v)
    {
        int radioId = rg.getCheckedRadioButtonId();

        rb = findViewById(radioId);

        Toast.makeText(this, "Selected Button: " + rb.getText(), Toast.LENGTH_SHORT).show();
    }



    public void Fetch_Result(View view) {

        AutoCompleteTextView ed = findViewById(R.id.Auto);
        String u= ed.getText().toString();
        EditText Cg = (EditText) findViewById(R.id.editText2);

        if(we.equals("added"))
        {
            double qi = Double.valueOf(zz);
            double ey = Double.valueOf(Cg.getText().toString());

            if (Double.compare(ey, qi) < 0) {
                Toast.makeText(this, "Not Likely to get this course due CG<" + Double.toString(qi), Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "Click on Course Details", Toast.LENGTH_LONG).show();
            }


        }
        else {
            if (!isEmpty(Cg)) {


                String f = Cg.getText().toString();
                int j = 0, k = 0;
                for (int i = 0; i < f.length(); i++) {
                    if (f.charAt(i) >= 48 && f.charAt(i) <= 57) {
                        j++;
                    }
                    if ((f.charAt(i) == 46)) {
                        k++;
                    }
                }
                if ((j == f.length() && k == 0) || (j == f.length() - 1 && k == 1)) {
                    float q = Float.valueOf(f);
                    if (u.equals("HUL212-Micro")) {
                        double y = 7.5;

                        if (Double.compare(q, y) < 0) {
                            Toast.makeText(this, "Not Likely to get this course due CG<" + Double.toString(y), Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(this, "Click on Course Details", Toast.LENGTH_LONG).show();
                        }
                    } else if (u.equals("HUL213-Macro")) {
                        double y = 7.5;

                        if (Double.compare(q, y) < 0) {
                            Toast.makeText(this, "Not Likely to get this course due CG<" + Double.toString(y), Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(this, "Click on Course Details", Toast.LENGTH_LONG).show();
                        }
                    } else if (u.equals("HUL232-Modern_Fiction")) {
                        double y = 8;

                        if (Double.compare(q, y) < 0) {
                            Toast.makeText(this, "Not Likely to get this course due CG<" + Double.toString(y), Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(this, "Click on Course Details", Toast.LENGTH_LONG).show();
                        }
                    } else if (u.equals("HUL239-Indian_Fiction")) {
                        double y = 0;

                        if (Double.compare(q, y) < 0) {
                            Toast.makeText(this, "Not Likely to get this course due CG<" + Double.toString(y), Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(this, "Click on Course Details", Toast.LENGTH_LONG).show();
                        }
                    }


                } else {
                    Toast.makeText(this, "Enter Valid CG", Toast.LENGTH_LONG).show();
                }

            } else {
                Toast.makeText(this, "Enter Valid CG", Toast.LENGTH_SHORT).show();
            }
        }

    }

    protected boolean isEmpty(EditText e)
    {
        return e.getText().toString().trim().length()==0;
    }

    public void switchp(View view) {

        Intent changescreen = new Intent(this,SecondScreen.class);



        AutoCompleteTextView ed = findViewById(R.id.Auto);
        String q= ed.getText().toString();
        RadioButton rb;
        RadioGroup rg;
        rg =  findViewById(R.id.Radio_group);
        int radioId = rg.getCheckedRadioButtonId();
        rb = findViewById(radioId);
        String p = rb.getText().toString();
        if(we.equals("added")) {
            changescreen.putExtra("callAc", "1"+q + "@" + p + "%" + ab + "#" + cd + "$" + pq);
        }
        else{
            changescreen.putExtra("callAc", "2"+q + " " + p);
        }

        startActivity(changescreen);
    }


    public void feedit(View view) {

        // Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();

        Intent chanescreen = new Intent(this,ThirdScreen.class);

        chanescreen.putExtra("callAct","j");

        final int result = 1;

        startActivityForResult(chanescreen,result);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        String sentback = data.getStringExtra("Course Details");

        String x = sentback;

        String a="",b="",c="",d="",f="";
        int e=0;

        for(int i=0;i<x.length();i++)
        {
            if(x.charAt(i)=='@'||x.charAt(i)=='%'||x.charAt(i)=='#'||x.charAt(i)=='$')
            {
                e++;
            }


            if(e==0)
            {

                a = a +  x.charAt(i);
            }
            else if(e==1)
            {

                if(x.charAt(i)!='@')
                b = b +  x.charAt(i);
            }
            else if(e==2)
            {
                if(x.charAt(i)!='%')
                c = c +  x.charAt(i);
            }
            else if(e==3)
            {
                if(x.charAt(i)!='#')
                d = d +  x.charAt(i);
            }
            else if(e==4)
            {
                if(x.charAt(i)!='$')
                f = f +  x.charAt(i);
            }

        }

        we = a;
        ab = b;
        cd  = c;
        pq = d;
        zz = f;


    }
}
