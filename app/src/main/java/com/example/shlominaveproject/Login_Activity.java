package com.example.shlominaveproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);
    }

    public void Create_A_Task(View view) {
        Intent i = new Intent(this, CreateTask_Activity.class);
        startActivity(i);
    }
    public void CheckEmployeeTasks(View view) {
        Intent i = new Intent(this, CheckEmployeeTasks_Activity.class);
        startActivity(i);
    }
    public void YourTasks(View view) {
        Intent i = new Intent(this, YourTasks_Activity.class);
        startActivity(i);
    }
    // public void Homepage(View view) {
    //    Intent i=new Intent(this,MainActivity.class);
    //      startActivity(i);
    // }פעולת מעבר לדף הבית
}