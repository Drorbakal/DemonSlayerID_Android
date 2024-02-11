package com.example.demonslayerid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<DataModel> dataset;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private CustomeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataset = new ArrayList<>();
        recyclerView = findViewById(R.id.resview);
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        for(int i = 0 ; i<MyData.drawable_arr.length; i++){
            dataset.add(new DataModel(
                    MyData.name_arr[i],
                    MyData.version_arr[i],MyData.drawable_arr[i]
            ));
        }
        adapter = new CustomeAdapter(dataset);
        recyclerView.setAdapter(adapter);
    }
}