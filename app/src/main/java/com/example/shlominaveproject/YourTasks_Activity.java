package com.example.shlominaveproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class YourTasks_Activity extends AppCompatActivity {
    private ListView ListView;

    private ArrayList<Task> tasklist ;
    private YourAdapter ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_tasks_);
        ListView=findViewById(R.id.mytaskslist);
        tasklist =new ArrayList<Task>();
        getdata();
        YourAdapter adapter=new YourAdapter(this,R.layout.task_layout,tasklist);
        ListView.setAdapter(adapter);
    }

    public void EditTask(View view) {
        Intent i=new Intent(this,EditTask_Activity.class);
        startActivity(i);
    }
    public void Createnewtask(View view) {
        Intent i=new Intent(this,CreateTask_Activity.class);
        startActivity(i);
    }
    public void getdata()
    {

        Task t=new Task("implement the new intent methods","by next monday" ,1);
        tasklist.add(t);
        t=new Task("review task class parameters","by the end of next week" ,2);
        tasklist.add(t);
        t=new Task("finish create a task page","in a week" ,3);
        tasklist.add(t);




    }
// public void Homepage(View view) {
    //    Intent i=new Intent(this,MainActivity.class);
    //      startActivity(i);
    // }פעולת מעבר לדף הבית
}