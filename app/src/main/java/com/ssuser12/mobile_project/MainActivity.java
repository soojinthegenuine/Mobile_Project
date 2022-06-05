package com.ssuser12.mobile_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView tw1,tw2;
    EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.login);
        tw1 = findViewById(R.id.Id);
        tw2 = findViewById(R.id.Pw);
        et1 = findViewById(R.id.RealId);
        et2 = findViewById(R.id.realPw);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((et1.getText().toString().equals("Soojin")) &&
                        (et2.getText().toString().equals("1234"))) {
                    et1.setText("일치");
                    Intent intent= new Intent(getApplicationContext(),RealActivity.class);
                    startActivity(intent);

                } else {
                    Toast.makeText(MainActivity.this, "아이디와 비밀번호가 다릅니다. ",
                            Toast.LENGTH_LONG).show();
                   Intent intent=new Intent(getApplicationContext(),LoginActivity.class);
                   startActivity(intent);
                }
            }

        });

    }

}

