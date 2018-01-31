package com.example.cdsm.tp012;

import android.app.Fragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DescActivity extends AppCompatActivity {

    private int imageResource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc);
        Fragment fragDesc = (Fragment)getFragmentManager().findFragmentById(R.id.fDesc1);
    }
}
