package com.example.assignment_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Build;
import android.os.Handler;

import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;


public class SignUp extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        findViewById(R.id.btn_signup).setOnClickListener(new View.OnClickListener() { @Override

        public void onClick(View v) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(SignUp.this, "Authenticated Successfully", Toast.LENGTH_LONG).show();

                }
            },4000);
        }

        });}}


