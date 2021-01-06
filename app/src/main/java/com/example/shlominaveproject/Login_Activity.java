package com.example.shlominaveproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {
 private  EditText username;
 private  EditText email;
 private EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);
        username=findViewById(R.id.tvusername);
         email=findViewById(R.id.tvemail);
        pass=findViewById(R.id.editTextTextPassword);


    }
    public void LoginToast(View v){
        if(username.getText().length()==0 || email.getText().length()==0 || pass.getText().length()==0)
            Toast.makeText(this,"enter values to all areas",Toast.LENGTH_SHORT).show();
        else
        Toast.makeText(this,"username:"+String.valueOf(username.getText())+",email:"+String.valueOf(email.getText()),Toast.LENGTH_SHORT).show();
}
public void reset(View v)
{
    username.setText(""); ggggg
    email.setText("");
    pass.setText("");
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