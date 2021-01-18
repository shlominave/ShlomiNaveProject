package com.example.shlominaveproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    private EditText username;
    private EditText email;
    private EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        username=findViewById(R.id.tvusername);
        email=findViewById(R.id.tvemail);
        pass=findViewById(R.id.editTextTextPassword);
    }
    public void RegisterToast(View v){
        if(username.getText().length()==0 || email.getText().length()==0 || pass.getText().length()==0)
            Toast.makeText(this,"enter values to all areas",Toast.LENGTH_SHORT).show();
        else
        if(shtrudelcountandplace(email.getText().toString())==-1)
            Toast.makeText(this,"@ cannot be at the beginning of your email",Toast.LENGTH_SHORT).show();
        else
        if(shtrudelcountandplace(email.getText().toString())!=1)
            Toast.makeText(this,"@ must appear excatly once",Toast.LENGTH_SHORT).show();


    }
    public int shtrudelcountandplace(String st) {

        if (st.indexOf('@') == 0)
            return -1;
        else if (st.lastIndexOf('@') != st.indexOf('@'))
            return 0;
        else return 1;
    }
}