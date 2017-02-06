package com.example.luisangel.listview1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] paises = new String[]{"Francia","Alemania","Japon","Canada"};

        ArrayList <String> listaPaises = new ArrayList<String>(Arrays.asList(paises));

        Menu adapter = new Menu (this,android.R.layout.simple_list_item_1, listaPaises);

        final ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);

    }
}
