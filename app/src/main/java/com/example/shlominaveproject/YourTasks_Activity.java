package com.example.shlominaveproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class YourTasks_Activity extends AppCompatActivity {
    private ListView ListView;
    private ArrayList<Task> tasklist ;
    private TextView tv;

    private YourAdapter ad;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_tasks_);
        tv=findViewById(R.id.tvYourTasks);
        ListView=findViewById(R.id.mytaskslist);
//        ListView.setOnItemClickListener(YourTaskslistener);
        Dal dal=new Dal(this);
        tasklist =dal.getAllTasks();
        tv.append(":You have "+tasklist.size()+ " tasks left" );

        YourAdapter ad=new YourAdapter(this,R.layout.task_layout,tasklist);
        ListView.setAdapter(ad);

    }
//    private ListView.OnItemClickListener YourTaskslistener=new ListView.OnItemClickListener() {
//        @Override
//        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//            Intent i=new Intent();
//            i.putExtra("key1",tasklist.get(position).getDescription());
//            i.putExtra("key")
//        }
//    };

    public void Createnewtask(View view) {
        Intent i=new Intent(this,CreateTask_Activity.class);
        startActivity(i);
    }
    public void getdata()
    {






    }
// public void Homepage(View view) {
    //    Intent i=new Intent(this,MainActivity.class);
    //      startActivity(i);
    // }פעולת מעבר לדף הבית
}