package com.ssuser12.mobile_project;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Detail_1Activity extends MainActivity{
    TextView tv1;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_detail1);
            tv1=findViewById(R.id.tv1);
            Intent intent= getIntent();
            String text= intent.getExtras().getString("detail");
            tv1.setText(text);
        }
}
