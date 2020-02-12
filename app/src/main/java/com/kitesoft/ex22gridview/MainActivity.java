package com.kitesoft.ex22gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayAdapter adapter;

    ArrayList<String> datas= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datas.add("aaa");
        datas.add("bbb");
        datas.add("ccc");
        datas.add("ddd");
        datas.add("eee");
        datas.add("fff");
        datas.add("ggg");

        gridView= findViewById(R.id.gridview);

        //위에서 만든 대량의 데이터[ArrayList] 요소 개수만큼  이를 보여줄 View(여기서는 String이므로 TextView)를 자동으로 만들어 주는 Adapter객체 생성
        // * 2번째 파라미터 [android.R.layout.simple_list_item_1] : ArrayList의 요소 1개(String)을 보여주기 위한 TextView가 작성된 layout 문서지정 (안드로이드에 이미 제작되어 있는 xml문서 이용)
        adapter= new ArrayAdapter(this, android.R.layout.simple_list_item_1, datas);
        gridView.setAdapter(adapter);

        //GridView의 아이템(항목)클릭 반응하기
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //선택된 항목의 위치에 해당하는 data값 토스트로 보여주기
                Toast.makeText(MainActivity.this, datas.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
