package com.example.tylerprince.austinbardeals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final String TAG = getClass().getSimpleName();
    static final String SAVED_STRING = "SAVED_STRING";
    String lastVisited;

    private Button allBarsButtonLocal;
    private Button filterButtonLocal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        allBarsButtonLocal = (Button)findViewById(R.id.allbars_button);
        allBarsButtonLocal.setOnClickListener(this);

        filterButtonLocal = (Button)findViewById(R.id.filter_button);
        filterButtonLocal.setOnClickListener(this);

        System.out.println("TEST Print from Main");
        
        this.lastVisited = "onCreate()";
        Log.d(TAG, "Last Visited callback method  was " + this.lastVisited);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(SAVED_STRING, "I came from onSaveInstanceState()");
        this.lastVisited = "onSaveInstanceState()";
        Log.d(TAG, "Last Visited callback method  was " + this.lastVisited);
        //test
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String savedString = savedInstanceState.getString(SAVED_STRING);
        Log.d(TAG, "Saved String = " + savedString);
        this.lastVisited = "onRestoreInstanceState()";
        Log.d(TAG, "Last Visited callback method  was " + this.lastVisited);
        Log.d(TAG, "Survived screen rotation!");
    }

    @Override
    protected void onStart(){
        super.onStart();

        this.lastVisited = "onStart()";
        Log.d(TAG, "Last Visited callback method  was " + this.lastVisited);
    }

    @Override
    protected void onResume(){
        super.onResume();
        this.lastVisited = "onResume()";
        Log.d(TAG, "Last Visited callback method  was " + this.lastVisited);
    }

    @Override
    protected void onPause(){
        super.onPause();
        this.lastVisited = "onPause()";
        Log.d(TAG, "Last Visited callback method  was " + this.lastVisited);
    }

    @Override
    protected void onStop(){
        super.onStop();
        this.lastVisited = "onStop()";
        Log.d(TAG, "Last Visited callback method  was " + this.lastVisited);
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        this.lastVisited = "onDestroy()";
        Log.d(TAG, "Last Visited callback method  was " + this.lastVisited);
    }

    public void onClick(View view){
        switch(view.getId()){
            case R.id.allbars_button:
                Log.d(TAG, "Starting the All Bars Activity");
                startActivity(new Intent(this, AllBarsActivity.class));
                break;

            case R.id.filter_button:
                Log.d(TAG, "Starting the Filter Activity");
                startActivity(new Intent(this, FilterActivity.class));
                break;

            default:
                break;
        }
    }
}
