package com.ssuser12.mobile_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class RealActivity extends MainActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real);
        final String[] mid={"스무디 원데이 클래스","콩닥콩닥 원데이 클래스","도자기 카페 줄","캘리그라피 원데이" +
                "클래스","마카롱 원데이 클래스"};
        ListView list= findViewById(R.id.listView);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.
                simple_list_item_1,mid);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),mid[i]+"를 선택하셨습니다.세부 페이지로" +
                        "이동합니다.",Toast.LENGTH_LONG).show();
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
              Intent intent= new Intent(RealActivity.this,Detail_1Activity.class);
              intent.putExtra("detail",mid[i]);
              startActivity(intent);
              finish();
          }
      });
            }
        });
    }
}
