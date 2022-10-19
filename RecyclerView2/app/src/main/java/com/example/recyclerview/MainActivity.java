package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private CategoryAdapter categoryAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView =(RecyclerView) findViewById(R.id.rcv_category);
        categoryAdapter= new CategoryAdapter(MainActivity.this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        categoryAdapter.setData(getListcategory());
        recyclerView.setAdapter(categoryAdapter);
    }


    private List<Category> getListcategory(){
        List<Category> listCategory = new ArrayList<>();
        List<Game>  gameArrayList = new ArrayList<>();
        gameArrayList.add(new Game("Game dua xe 1",R.drawable.avt,"Game ban sung"));
        gameArrayList.add(new Game("Game dua xe 2",R.drawable.avtt,"Game ban sung"));
        gameArrayList.add(new Game("Game dua xe S3",R.drawable.avttt,"Game da bong"));
        gameArrayList.add(new Game("Game dua xe 4",R.drawable.avtttt,"Game chien thuat"));
        gameArrayList.add(new Game("Game dua xe 1",R.drawable.avt,"Game phieu luu"));
        gameArrayList.add(new Game("Game dua xe 2",R.drawable.avtt,"Game ban sung"));
        gameArrayList.add(new Game("Game dua xe 3",R.drawable.avttt,"Game ban sung"));
        gameArrayList.add(new Game("Game dua xe 4",R.drawable.avtttt,"Game kham pha"));
        gameArrayList.add(new Game("Game dua xe 1",R.drawable.avt,"Game phieu luu"));
        gameArrayList.add(new Game("Game dua xe 2",R.drawable.avtt,"Game ban sung"));
        gameArrayList.add(new Game("Game dua xe 3",R.drawable.avttt,"Game ban sung"));
        gameArrayList.add(new Game("Game dua xe 4",R.drawable.avtttt,"Game da bong"));
        gameArrayList.add(new Game("Game dua xe 1",R.drawable.avt,"Game chien thuat"));
        gameArrayList.add(new Game("Game dua xe 2",R.drawable.avtt,"Game phieu luu"));
        gameArrayList.add(new Game("Game dua xe 3",R.drawable.avttt,"Game ban sung"));
        listCategory.add(new Category("Game hay",gameArrayList));
        listCategory.add(new Category("Game hay",gameArrayList));
        listCategory.add(new Category("Game hay",gameArrayList));
        listCategory.add(new Category("Game hay",gameArrayList));
        listCategory.add(new Category("Game hay",gameArrayList));
        listCategory.add(new Category("Game hay",gameArrayList));
        listCategory.add(new Category("Game hay",gameArrayList));
        listCategory.add(new Category("Game hay",gameArrayList));
        listCategory.add(new Category("Game hay",gameArrayList));
        return listCategory;
    }
    }
