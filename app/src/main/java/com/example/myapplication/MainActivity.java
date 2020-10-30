package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ProductAdapter productAdapter;
    private ArrayList<ProductEntity> productEntities;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);

        productEntities = new ArrayList<>();
        productEntities.add(new ProductEntity("Giắc chuyển",3,1000
                ,2000,R.drawable.giacchuyen,20));
        productEntities.add(new ProductEntity("Day cuon",3,1000
                ,2000,R.drawable.giacchuyen,20));
        productEntities.add(new ProductEntity("Day cuon",3,1000
                ,2000,R.drawable.giacchuyen,20));
        productEntities.add(new ProductEntity("Day cuon",3,1000
                ,2000,R.drawable.giacchuyen,20));
        productEntities.add(new ProductEntity("Day cuon",3,1000
                ,2000,R.drawable.giacchuyen,20));
        productAdapter = new ProductAdapter(this,productEntities);
        recyclerView.setAdapter(productAdapter);


        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    }
}