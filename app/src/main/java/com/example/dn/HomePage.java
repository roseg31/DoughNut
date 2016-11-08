package com.example.dn;

import android.content.Intent;
import android.os.Bundle;
//import android.support.annotation.IdRes;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

//import android.support.v7.app.AppCompatActivity;

public class HomePage extends ActionBarActivity {

    public String foo = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Intent intent = getIntent();
        foo = null;
        if(intent != null){

            String sub = intent.getStringExtra("sub");
            if(sub != null) {
                foo = sub;
                double subtract = Double.parseDouble(sub);

                String current = (String) ((TextView) findViewById(R.id.textView2)).getText();
                String newCur = current.substring(13);
                double cur = Double.parseDouble(newCur);

                double newbud = cur - subtract;

                TextView tv = (TextView) findViewById(R.id.textView2);
                tv.setText("Budget Left: " + newbud);
            }
        }
        /*String sub = "0.0";
        //double subtract;

        String[] list = fileList();
        boolean empty = true;
        for(String x : list){
            System.out.println("String:" + x);
            if(x.equals("budgetChange")){
                System.out.println("WORKING HERE");
                try {
                    FileInputStream fis = openFileInput(x);
                    fis.read(x.getBytes());

                    int content= fis.read();
                    //while ((content = fis.read()) != -1) {
                        System.out.print("THE SAVED STRING IS: '" + (char) content + "'");
                        sub = (char) content + "";
                        System.out.println("HEY" + sub);
                   // }
                    fis.close();

                } catch (Exception e){
                    e.printStackTrace();
                }
                empty = false;
            }
        }
        if(!empty) {
           // System.out.println("THERE IS NO DATA SAVED");
            String current = (String)((TextView)findViewById(R.id.textView2)).getText();
            String newCur = current.substring(13);
            double cur = Double.parseDouble(newCur);

            double subtract = Double.parseDouble(sub) +  0.0;

            double newbud = cur - subtract;

            TextView tv = (TextView) findViewById(R.id.textView2);
            tv.setText("Budget Left: " + newbud);
        }

*/

    }


    public void goCalendar(View view){
        Intent intent = new Intent(this, CalendarPage.class);
        startActivity(intent);
    }

    public void goCam(View view){
        Intent intent = new Intent(this, ScrollingActivity.class);
        startActivity(intent);
    }

    public void goGal(View view){
        Intent intent = new Intent(this, DataPage.class);
        startActivity(intent);
    }

    public void goRewards(View view){
        Intent intent = new Intent(this, RewardsPage.class);
        startActivity(intent);
    }

    public void goProfile(View view){
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }
}
