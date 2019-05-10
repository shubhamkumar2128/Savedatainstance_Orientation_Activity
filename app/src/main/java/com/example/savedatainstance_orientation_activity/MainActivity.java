package com.example.savedatainstance_orientation_activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements One.comm {

    FragmentManager fragmentManager;
    Second second;
    One one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        fragmentManager = getSupportFragmentManager();
        second = (Second) fragmentManager.findFragmentByTag("fragtwo");
        one = (One) fragmentManager.findFragmentByTag("fragone");
        if (second == null && one == null) {
            second = new Second();
            one = new One();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.container_one, one, "fragone");
            fragmentTransaction.add(R.id.container_two, second, "fragtwo");
            fragmentTransaction.commit();
        }


        Log.w("msg", "OnCreate()");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        if (savedInstanceState == null) {

        } else {

        }

        Log.w("msg", "onRestoreInstanceState()");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.w("msg", "OnStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.w("msg", "OnResume()");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.w("msg", "OnRestart()");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w("msg", "OnStop()");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w("msg", "OnPause()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w("msg", "OnDestroy()");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);


        Log.w("msg", "onSaveInstanceState()");
    }


    @Override
    public void data(int count) {

        second.add(count);

    }
}
