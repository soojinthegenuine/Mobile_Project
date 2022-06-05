package com.ssuser12.mobile_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PassActivity extends MainActivity {
    Button btn1;
    EditText edt1,edt2,edt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass);
        edt1=findViewById(R.id.edt1);
        edt2=findViewById(R.id.edt2);
        edt3=findViewById(R.id.edt3);
        btn1=findViewById(R.id.btn1);

     btn1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
                 if(edt2.getText().toString().equals(edt3.getText().toString())) {
                     Intent intent = new Intent(getApplicationContext(), RealActivity.class);
                     startActivity(intent);
                 }
            }
         });
          }
    }

