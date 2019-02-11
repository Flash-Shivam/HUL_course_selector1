package com.shivam.hul_course_selector;

import android.content.Intent;
import android.os.Bundle;
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

public class MainActivity extends AppCompatActivity {

    private static final String[] Course = new String[]{
            "HUL212-Micro","HUL213-Macro","HUL232-Modern_Fiction","HUL239-Indian_Fiction",
    };

    RadioGroup rg ;
    RadioButton rb ;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         rg  =  findViewById(R.id.Radio_group);



        Button z = findViewById(R.id.gn);

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
        if(!isEmpty(Cg))
        {





                String f = Cg.getText().toString();
                int j = 0,k=0;
                for(int i=0;i<f.length();i++)
                {
                    if(f.charAt(i)>= 48&&f.charAt(i)<=57)
                    {
                        j++;
                    }
                    if((f.charAt(i)==46))
                    {
                        k++;
                    }
                }
                if((j==f.length()&&k==0)||(j==f.length()-1&&k==1)) {
                    float q = Float.valueOf(f);
                    if(u.equals("HUL212-Micro")){
                            double y = 7.5;

                        if (Double.compare(q, y) < 0) {
                            Toast.makeText(this, "Not Likely to get this course due CG<"+Double.toString(y), Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(this, "Click on Course Details", Toast.LENGTH_LONG).show();
                        }
                    }
                    else if(u.equals("HUL213-Macro")){
                        double y = 7.5;

                        if (Double.compare(q, y) < 0) {
                            Toast.makeText(this, "Not Likely to get this course due CG<"+Double.toString(y), Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(this, "Click on Course Details", Toast.LENGTH_LONG).show();
                        }
                    }
                    else if(u.equals("HUL232-Modern_Fiction")){
                        double y = 8;

                        if (Double.compare(q, y) < 0) {
                            Toast.makeText(this, "Not Likely to get this course due CG<"+Double.toString(y), Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(this, "Click on Course Details", Toast.LENGTH_LONG).show();
                        }
                    }
                    else if(u.equals("HUL239-Indian_Fiction")){
                        double y = 0;

                        if (Double.compare(q, y) < 0) {
                            Toast.makeText(this, "Not Likely to get this course due CG<"+Double.toString(y), Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(this, "Click on Course Details", Toast.LENGTH_LONG).show();
                        }
                    }


                }
                else{
                    Toast.makeText(this, "Enter Valid CG", Toast.LENGTH_LONG).show();
                }

        }
        else{
            Toast.makeText(this, "Enter Valid CG", Toast.LENGTH_SHORT).show();
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
        changescreen.putExtra("callAc",q+" "+p);

        startActivity(changescreen);
    }


    public void feedit(View view) {

        // Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();

        Intent chanescreen = new Intent(this,ThirdScreen.class);

        chanescreen.putExtra("callAct","j");



        startActivity(chanescreen);
    }
}
