package com.example.arrayadaptor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String tasks[]= {"India : +91", "Afghanistan: +94", "Pakistan: +92", "Turkey : +90"};
        list=(ListView) findViewById(R.id.lstViewTasks);
        ArrayAdapter adaptor= new ArrayAdapter<String>(this,R.layout.todolist,tasks);
        list.setAdapter(adaptor);
    }
}