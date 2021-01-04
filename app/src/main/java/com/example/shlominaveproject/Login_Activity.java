package com.example.shlominaveproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {
EditText username;
EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);
        username=findViewById(R.id.tvusername);
         email=findViewById(R.id.tvemail);

    }
    public void LoginToast(View v){
         email.setText("hhhhpopklopp");
        if(username.getText()==null || email.getText()==null) {
           email.setText("HHHHIIOOO");
            Toast.makeText(this,"enter email and/or password", Toast.LENGTH_SHORT).show();
        }
        else
            Toast.makeText(this,"username:"+username.getText().toString()+",email:"+email.getText().toString(), Toast.LENGTH_SHORT);
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