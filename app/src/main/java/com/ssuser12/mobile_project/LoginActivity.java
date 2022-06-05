package com.ssuser12.mobile_project;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends MainActivity{
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       btn1=findViewById(R.id.btn1);
       Intent intent=new Intent(getApplicationContext(),PassActivity.class);
       startActivity(intent);


    }
}
