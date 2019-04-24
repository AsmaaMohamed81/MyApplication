package com.masaderk.masader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static com.masaderk.masader.R.id.listview;

public class Main2Activity extends AppCompatActivity {
    int first;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ListView listView = findViewById(listview);
        List ls=new ArrayList();
        List ls1 =new ArrayList();
        ls1.add("موسوعات");
        ls1.add("معاجم وقواميس");
        ls1.add("ببليوجرافيات");
        ls1.add("أدلة");
        ls1.add("كشافات");
        ls1.add("مستخلصات");
        ls1.add("مختصرات حقائق");
        ls1.add("كتب سنوية");
        ls1.add("المصادر الإلكترونية");
        List ls2= new ArrayList();
        ls2.add("موسوعات");
        ls2.add("قواميس و معاجم");
        ls2.add("ببليوجرافيات");
        ls2.add("أدلة");
        ls2.add("كشافات");
        ls2.add("مستخلصات");
        ls2.add("مختصرات حقائق");
        ls2.add("موجزات إرشادية");
        ls2.add("معاجم جغرافية");
        ls2.add("كتب سنوية");
        ls2.add("المصادر الإلكترونية");
        ls2.add("مرشد الى أدب الموضوع");
        List ls3= new ArrayList();
        ls3.add("موسوعات");
        ls3.add("قواميس و معاجم");
        ls3.add("ببليوجرافيات");
        ls3.add("أدلة");
        ls3.add("كشافات");
        ls3.add("مستخلصات");
        ls3.add("مختصرات حقائق");
        ls3.add("موجزات إرشادية");
        ls3.add("كتب تراجم");
        ls3.add("المصادر الإلكترونية");
        List ls4= new ArrayList();
        ls4.add("موسوعات");
        ls4.add("قواميس و معاجم");
        ls4.add("ببليوجرافيات");
        ls4.add("أدلة");
        ls4.add("كشافات");
        ls4.add("كتب سنوية");
        List ls5= new ArrayList();
        ls5.add("موسوعات");
        ls5.add("قواميس و معاجم");
        ls5.add("ببليوجرافيات");
        ls5.add("أدلة");
        ls5.add("كشافات");
        ls5.add("مستخلصات");
        ls5.add("مختصرات حقائق");
        ls5.add("كتب تراجم");
        ls5.add("كتب سنوية");
        ls5.add("المصادر الإلكترونية");
        List ls6= new ArrayList();
        ls6.add("موسوعات");
        ls6.add("قواميس و معاجم");
        ls6.add("ببليوجرافيات");
        ls6.add("أدلة");
        ls6.add("كشافات");
        ls6.add("مستخلصات");
        ls6.add("موجزات إرشادية");
        ls6.add("كتب تراجم");
        ls6.add("كتب سنوية");
        ls6.add("المصادر الإلكترونية");
        Intent reciever =getIntent();
        first= reciever.getIntExtra("position1",0);
        if(first==1)ls=ls1;
        else if(first==2)ls=ls2;
        else if(first==3)ls=ls3;
        else if(first==4)ls=ls4;
        else if(first==5)ls=ls5;
        else if(first==6)ls=ls6;
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,ls);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(listClick);
    }

    private AdapterView.OnItemClickListener listClick = new AdapterView.OnItemClickListener () {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
             int pos1=first;


            Intent intent = new Intent(Main2Activity.this,page2.class);
            intent.putExtra("position1",pos1);
            intent.putExtra("position2",position);
            startActivity(intent);
        }
    };

}
