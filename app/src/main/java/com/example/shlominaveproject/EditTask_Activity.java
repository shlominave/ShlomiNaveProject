package com.example.shlominaveproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EditTask_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_task_);
    }
    public void SetTaskSettings(View view) {
        Intent i=new Intent(this,TaskSettings_Activity.class);
        startActivity(i);
    }
    // public void Homepage(View view) {
    //    Intent i=new Intent(this,MainActivity.class);
    //      startActivity(i);
    // }פעולת מעבר לדף הבית
}