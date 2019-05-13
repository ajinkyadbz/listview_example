package com.example.gallery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    ListView lists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String names[] = {"apples", "oranges", "pineapple", "watermelon", "strawberry"};
        ArrayList array_list = new ArrayList(Arrays.asList(names));
        ArrayAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, array_list);
        lists = (ListView) findViewById(R.id.names_list);
        lists.setAdapter(adapter);
        lists.setScrollContainer(true); //enable scrolling.
    }
}
