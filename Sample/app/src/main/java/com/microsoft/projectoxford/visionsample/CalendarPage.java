package com.example.dn;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
//import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.VectorEnabledTintResources;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;
import android.view.*;
import android.content.Intent;
import java.util.Calendar;

public class CalendarPage extends ActionBarActivity {
    //Button btn = null;
    int year_x,month_x,day_x;
    static final int DIALOG_ID = 0;
    String x = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);//_page);
        //showDialogOnButtonClick();
    }

    //@Override
    public void onClick(View v){
        showDialog(DIALOG_ID);
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        if (id == DIALOG_ID) {
            return new DatePickerDialog(this, dpickerListner, year_x, month_x, day_x);
        } else {
            return null;
        }
    }

    private DatePickerDialog.OnDateSetListener dpickerListner = new DatePickerDialog.OnDateSetListener(){
        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth){

            year_x = year;
            month_x = monthOfYear;
            day_x = dayOfMonth;
            Toast.makeText(CalendarPage.this,year_x + "/" + month_x + " / " + day_x, Toast.LENGTH_LONG).show();
            x = Toast.makeText(CalendarPage.this,year_x + "/" + month_x + " / " + day_x, Toast.LENGTH_LONG).toString();
            goData();
        }
    };

    public void goData(){
        Intent intent = new Intent(this, RealDataPg.class);
        intent.putExtra("date", x);
        startActivity(intent);
    }
}
