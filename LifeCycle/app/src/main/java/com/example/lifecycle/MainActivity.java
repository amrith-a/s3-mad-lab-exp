package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "LifeCycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "OnCreate called", Toast.LENGTH_LONG).show();
        Log.d(TAG,"OnCreate called");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "OnResume Called", Toast.LENGTH_LONG).show();
        Log.d(TAG,"OnResume Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "OnStop Called", Toast.LENGTH_LONG).show();
        Log.d(TAG,"OnStop Called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "OnStart Called", Toast.LENGTH_LONG).show();
        Log.d(TAG,"OnStart Called");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "OnRestart Called", Toast.LENGTH_LONG).show();
        Log.d(TAG,"OnRestart called");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "OnPause Called", Toast.LENGTH_LONG).show();
        Log.d(TAG,"OnPause called");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "OnDestroy Called", Toast.LENGTH_LONG).show();
        Log.d(TAG,"OnDestroy called");

    }
}
