package com.example.shlominaveproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {
    private EditText username;
    private EditText email;
    private EditText pass;
    EditText code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);
        username = findViewById(R.id.tvusername);
        email = findViewById(R.id.tvemail);
        pass = findViewById(R.id.editTextTextPassword);
        code = findViewById(R.id.etcode);


    }
    public void infobtn(View v)
    {
        Toast.makeText(this,"Enter the code given to you, if this does not concern you leave this field empty",Toast.LENGTH_LONG).show();
    }
    public void LoginToast(View v) {
        if (username.getText().length() == 0 || email.getText().length() == 0 || pass.getText().length() < 8)
            Toast.makeText(this, "enter values to all areas,password must have at least 8 chars", Toast.LENGTH_SHORT).show();
        else {
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


public void reset(View v)
{
    username.setText("");
    email.setText("");
    pass.setText("");
}



    // public void Homepage(View view) {
    //    Intent i=new Intent(this,MainActivity.class);
    //      startActivity(i);
    // }פעולת מעבר לדף הבית
}