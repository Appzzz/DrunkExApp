package com.example.drunkexapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Program extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.program, menu);
        int a = 0;
        return true;
    }
    
}
