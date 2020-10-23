package com.example.shlominaveproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class YourTasks_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_tasks_);
    }

    public void EditTask(View view) {
        Intent i=new Intent(this,EditTask_Activity.class);
        startActivity(i);
    }
    public void HandInTask(View view) {
        Intent i=new Intent(this,SubmitTask_Activity.class);
        startActivity(i);
    }
// public void Homepage(View view) {
    //    Intent i=new Intent(this,MainActivity.class);
    //      startActivity(i);
    // }פעולת מעבר לדף הבית
}