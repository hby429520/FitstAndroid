package com.example.fitstandroid.Tools;

import android.content.Context;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class StartActivity extends AppCompatActivity {
    public void startactivity(Context context,Class<?> cls){
        Intent intent = new Intent(context, cls);
        startActivity(intent);
    }
}
