package com.example.fitstandroid.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.fitstandroid.R;
import com.example.fitstandroid.Tools.StartActivity;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText username;
    private EditText password;
    private Button login;
    private Context context;
    private StartActivity startActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.err.println("create");
        setContentView(R.layout.activity_main);
        context=this;
        username = findViewById(R.id.phone);
        password = findViewById(R.id.apc);
        login = findViewById(R.id.login);
        login.setOnClickListener(this);
        startActivity = new StartActivity();
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.login:
                login();break;
            case R.id.sign:
                startActivity.startactivity(context,SignActivity.class);
        }
    }
    public void login(){
        System.out.println(username.getText());
        System.out.println(password.getText());
    }



}