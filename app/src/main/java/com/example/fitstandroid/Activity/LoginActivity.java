package com.example.fitstandroid.Activity;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.fitstandroid.Bean.Test;
import com.example.fitstandroid.Network.NET_request;
import com.example.fitstandroid.Network.NetWork_Config;
import com.example.fitstandroid.R;
import com.example.fitstandroid.Tools.StartActivity;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;

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
        setContentView(R.layout.activity_login);
        context=this;
        username = findViewById(R.id.phone);
        password = findViewById(R.id.apc);
        login = findViewById(R.id.login);
        login.setOnClickListener(this);
        startActivity = new StartActivity();
        NET_request.request(NET_request.getNET_request().setServiceConfig().getuser(), new NET_request.Back() {
            @Override
            public void onResponse(String json) {

            }
        });
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.login:
                try {
                    login();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case R.id.sign:
                startActivity.startactivity(context,SignActivity.class);
        }
    }

    public void login() throws IOException {


    }



}