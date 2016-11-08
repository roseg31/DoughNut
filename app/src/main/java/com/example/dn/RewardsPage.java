package com.example.dn;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.TextView;


public class RewardsPage extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rewards_page);
    }

    public void notEnough(View view){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        final TextView et = new TextView(this);
        et.setText("You don't have enough Donuts for that! Get some by saving money!");
        et.setTextSize(20);


        alertDialogBuilder.setView(et);


        alertDialogBuilder.setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
            }
        });


        AlertDialog alertDialog = alertDialogBuilder.create();

        alertDialog.show();
    }
}
