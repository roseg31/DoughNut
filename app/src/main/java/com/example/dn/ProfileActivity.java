package com.example.dn;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class ProfileActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile2);

    }

    public void goAwards(View view){
        Intent intent = new Intent(this, RewardsPage.class);
        startActivity(intent);
    }
}
