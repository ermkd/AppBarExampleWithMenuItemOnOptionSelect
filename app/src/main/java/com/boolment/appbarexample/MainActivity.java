package com.boolment.appbarexample;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //toolbar handler is ready
        toolbar = findViewById(R.id.toolbar);

        //to make toolbar as default action bar then we have to call setSupportActionBar
        setSupportActionBar(toolbar);

        //to keep backbutton to appbar after placing this in mainfest file we have to define parent for each activity.

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.app_bar_menu,menu);

        return true;
    }

    //to handle click event on menu item selection

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.action_share:
                Toast.makeText(this,"Share Option Item Clicked...",Toast.LENGTH_SHORT).show();
                return true;


            case R.id.action_setting:
                Toast.makeText(this,"Seting Option Item Clicked...",Toast.LENGTH_SHORT).show();
                return true;

                default:
                    return super.onOptionsItemSelected(item);
        }


    }
}
