package com.example.all_view_demo;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    String list[] = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Elevan","Twelve","Thirteen"};
    String listname[]={"Surat","Mumbai","Ahemdabad","Vadodra","Rajkort","Jaipur","Udaipur","Rajsathan"};
        ListView listview;
//    GridView gridView;
//    Spinner spinner;
//    AutoCompleteTextView actv;
    ArrayAdapter adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview=findViewById(R.id.listview);
//        gridView=findViewById(R.id.gridview);
//        spinner=findViewById(R.id.spinner);
//        actv=findViewById(R.id.actv);
        adapter= new ArrayAdapter(MainActivity.this,R.layout.item_file,R.id.item_file_text1,list);
        listview.setAdapter(adapter);
    }
}