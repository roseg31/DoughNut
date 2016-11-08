package com.example.dn;

import android.support.v7.app.ActionBarActivity;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View;
import android.content.Intent;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
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
}
