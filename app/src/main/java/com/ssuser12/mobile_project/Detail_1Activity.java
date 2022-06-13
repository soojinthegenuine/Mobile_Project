package com.ssuser12.mobile_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Detail_1Activity extends MainActivity{
    TextView tv1;
    Button btn1;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_detail1);
            tv1 = findViewById(R.id.tv1);
            Intent intent = getIntent();
            String text = intent.getExtras().getString("detail");
            tv1.setText(text);
            btn1 = findViewById(R.id.btn1);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), MapActivity.class);
                    startActivity(intent);

                }
            });
        }
}
