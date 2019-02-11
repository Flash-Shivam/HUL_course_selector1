package com.shivam.hul_course_selector;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondScreen extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second);

        Intent activitythat = getIntent();
        int c=0;
        String h ="",w="";
        String prevac = activitythat.getExtras().getString("callAc");

        if(prevac.charAt(0)=='2'){


        for(int i=1;i<prevac.length();i++)
        {

            if(prevac.charAt(i)==' ')
            {
                c=1;
            }

            if(c==0)
            {
                h = h + prevac.charAt(i);
            }
            else
            {
                w = w + prevac.charAt(i);
            }
        }

        TextView x = findViewById(R.id.ter);
        TextView y = findViewById(R.id.ter2);
        TextView z = findViewById(R.id.ter3);
        TextView a = findViewById(R.id.ter4);
        TextView b = findViewById(R.id.ter5);
        x.setText(h);
        if(h.equals("HUL212-Micro"))
        {
            String t = "Micro  versus  macroeconomics.  Theory  of  consumer  behavior  and  demand.  Consumer  preferences.  Indifference  curve.  Consumer  equilibrium. Demand function. Income and substitution effects. The Slutsky equation. Market demand. Elasticities. Average and marginal revenue. Revealed preference theory of firm. Production functions. Law of variable proportions. Laws of return to scale. Isoquants. Input substitution. Equilibrium of the firm. Expansion path. Cost function. Theory  of  costs.  Short  Run  and  Long  run  costs.  Shape  of  LAC.  Economies and diseconomies of scale. Market equilibrium under perfect competition. Equilibrium under alternative forms of market. Monopoly: pure  and  discriminating.  Monopolistic  competition.  Oligopoly.";
            z.setText("Course Details: "+t);
        }
        else if(h.equals("HUL213-Macro"))
        {
            String t = "Major economic problems. National income accounting. Expenditure and income approaches to GNP. Measuring inflation and unemployment. Determination  of  the  equilibrium  level  of  income.  Consumption  function.  Investment  demand.  Aggregate  demand  and  equilibrium  output. The multiplier process. Government sector. Fiscal policy. Tax receipts  and  Transfer  payments.  Foreign  spending.  Money,  interest  and income. Functions of money. Definition of money. Reserve Bank of India and Commercial Banks. Creation of money. The instruments of monetary control. The demand for money. Investment expenditure and rate of interest. The IS curve. Money market and the LM curve. Liquidity trap. The IS-LM model. Derivation of the aggregate demand curve. Monetary and fiscal polices. Keynesian versus monetarist views. The aggregate supply function: Keynesian and classical. Inflation and unemployment. Stagflation. The Phillips curve. The long-run Phillips curve. Inflation expectations. The rational expectations.";
            z.setText("Course Details: "+t);
        }
        else if(h.equals("HUL232-Modern_Fiction"))
        {
            String t = "Students would be introduced to the conditions, beginning in 19th century colonial rule in India, which led to the emergent Indian middle-class intelligentsia to experiment with European forms of literature but striving for an alternative expression. Indian languages became the medium through which writers sought to address issues of identity, tradition, modernity, gender, the rural and the urban, the private and the public. The course will study the various experiments in narration, language, characterization and style undertaken by authors to shape these themes.";
            z.setText("Course Details: "+t);
        }
        else if(h.equals("HUL239-Indian_Fiction"))
        {
            String t = "The course involves a detailed study of 3-4 texts corresponding to the distinct phases of literary activity in the genre: the early period of the 1940s and 50s in which writers like Mulk Raj Anand, Raja Rao and R.K. Narayan made their presence felt, before Salman Rushdie, and more quietly, Amitav Ghosh and Vikram Seth, erupted into the scene in the 1980s, spawning a generation of writers attaining international acclaim - Arundhati Roy, Aravind Adiga, Kiran Desai, and many others. Some of the questions that will be addressed are: Who constitutes the main audience for this writing, and (how) does the writing cater to it? How does one position the expatriate Indian writer both residing and publishing abroad? How does English become an Indian language? Is there a thematic congruence in the novels that fall under this category, and does it differ from the thematic concerns of novels written in other Indian languages? Students will be encouraged to read a novel in at least one other Indian language in order to allow them to pose these questions in a more pointed manner.";
            z.setText("Course Details: "+t);
        }

        if(w.equals(" Based on Professor Grading"))
        {
            b.setText("Prof Grading:Very Good");
            if(h.equals("HUL212-Micro"))
            {
                String s = "Saptarshi Mukherjee";
                y.setText(s);
                a.setText("WorkLoad: Fighter");
            }
            else if(h.equals("HUL213-Macro"))
            {
                String s = "Sourabh Bikas Paul";
                y.setText(s);
                a.setText("WorkLoad: Fighter");
            }
            else if(h.equals("HUL232-Modern_Fiction"))
            {
                String s = "Simona Sawhney";
                y.setText(s);
                a.setText("WorkLoad: chill");
            }
            else if(h.equals("HUL239-Indian_Fiction"))
            {
                String s = "Angelia Multani";
                y.setText(s);
                a.setText("WorkLoad: chill");
            }

        }
        else {

            a.setText("WorkLoad : chill");
            if (h.equals("HUL212-Micro")) {
                String s = "Saptarshi Mukherjee";
                y.setText(s);
                b.setText("Prof Grading: Good");
            } else if (h.equals("HUL213-Macro")) {
                String s = "V.Upadhyay";
                y.setText(s);
                b.setText("Prof Grading: Good");
            } else if (h.equals("HUL232-Modern_Fiction")) {
                String s = "Simona Sawhney";
                y.setText(s);
                b.setText("Prof Grading: Good");
            } else if (h.equals("HUL239-Indian_Fiction")) {
                String s = "Angelia Multani";
                y.setText(s);
                b.setText("Prof Grading: Good");
            }

        }


        }
        else{

            String x = prevac;
            String a="",b="",cc="",d="",f="";
            int e=0;

            for(int i=1;i<x.length();i++)
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
                        cc = cc +  x.charAt(i);
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

            TextView xx = findViewById(R.id.ter);
            TextView yy = findViewById(R.id.ter6);
            yy.setText(a+ "."+b+"."+cc+"."+d+"."+f);
            xx.setText(a);

            if(b.equals("Based on Professor Grading"))
            {
                TextView y = findViewById(R.id.ter2);

                if(d.equals("Bad"))
                {
                    y.setText("Such a Course Does Not Exist");
                }
                else{

                    TextView aa = findViewById(R.id.ter4);
                    TextView bb = findViewById(R.id.ter5);
                    y.setText("Course Teacher :"+cc);

                    aa.setText("Work Load: "+f);
                    bb.setText("Prof Grading :"+d);
                }
            }
            else{
                TextView y = findViewById(R.id.ter2);
                if(f.equals("chill"))
                {
                    TextView aa = findViewById(R.id.ter4);
                    TextView bb = findViewById(R.id.ter5);
                    y.setText("Course Teacher :"+cc);

                    aa.setText("Work Load: "+f);
                    bb.setText("Prof Grading :"+d);
                }
                else{
                    y.setText("Such a Course Does Not Exist");
                }

            }







        }


    }
}
