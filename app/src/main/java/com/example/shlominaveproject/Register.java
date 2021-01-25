package com.example.shlominaveproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    private EditText username;
    private EditText email;
    private EditText pass;
    private EditText code;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        username=findViewById(R.id.tvusername);
        email=findViewById(R.id.tvemail);
        pass=findViewById(R.id.editTextTextPassword);
        code=findViewById(R.id.ETcode);
    }
    public void infobtn(View v)
    {
        Toast.makeText(this,"Enter the code given to you, if this does not concern you leave this field empty",Toast.LENGTH_LONG).show();
    }
    public void RegisterToast(View v){

        if(username.getText().length()==0 || email.getText().length()==0 || pass.getText().length()==0)
            Toast.makeText(this,"enter values to all areas",Toast.LENGTH_SHORT).show();
        else if (username.length()<4)
        {
            Toast.makeText(this,"your username is too short",Toast.LENGTH_SHORT).show();
        }
        else if (pass.length()<8)
        {
            Toast.makeText(this,"password must be at least 8 chars",Toast.LENGTH_SHORT).show();
        }
        else
        if(shtrudelcountandplace(email.getText().toString())==-1)
            Toast.makeText(this,"@ cannot be at the beginning (or end) of your email",Toast.LENGTH_SHORT).show();
        else
        if(shtrudelcountandplace(email.getText().toString())!=1)
            Toast.makeText(this,"@ must appear exactly once",Toast.LENGTH_SHORT).show();
        else

        {
            Toast.makeText(this, "Login complete! "+"username:" + String.valueOf(username.getText()) + ",email:" + String.valueOf(email.getText()) + ",password:" + String.valueOf(pass.getText()), Toast.LENGTH_SHORT).show();
            if (code.length() == 0) {
                Intent i = new Intent(this, CreateTask_Activity.class);
                startActivity(i);
            } else {
                Intent i = new Intent(this, CheckEmployeeTasks_Activity.class);
                startActivity(i);
            }
        }


    }
    public int shtrudelcountandplace(String st) {

        if (st.indexOf('@') ==0 || st.indexOf('@')==st.length()-1)
            return -1;
        else if (st.lastIndexOf('@') != st.indexOf('@') ||st.indexOf('@')==-1)
            return 0;
        else return 1;
    }


}