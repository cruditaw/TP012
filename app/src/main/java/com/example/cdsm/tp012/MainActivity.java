package com.example.cdsm.tp012;

import android.app.Fragment;
import android.content.res.Configuration;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment fragAnimx = (Fragment)getFragmentManager().findFragmentById(R.id.fAnim1);

        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Fragment fragDescx = (Fragment)getFragmentManager().findFragmentById(R.id.fDesc1);
        }
    }

}
