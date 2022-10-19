package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mainRCVAX;
    private CategoryAdapter categoryAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainRCVAX = (RecyclerView) findViewById(R.id.mainRCV);
        categoryAdapter = new CategoryAdapter(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        mainRCVAX.setLayoutManager(linearLayoutManager);
        categoryAdapter.setData(getListCategory());
        mainRCVAX.setAdapter(categoryAdapter);
    }
    private List<Category> getListCategory(){
        List<Category> categoryList = new ArrayList<>();
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(R.drawable.vominhloi,"Book "+1));
        bookList.add(new Book(R.drawable.vominhloi,"Book "+2));
        bookList.add(new Book(R.drawable.vominhloi,"Book "+3));
        bookList.add(new Book(R.drawable.vominhloi,"Book "+4));

        bookList.add(new Book(R.drawable.vominhloi,"Book "+1));
        bookList.add(new Book(R.drawable.vominhloi,"Book "+2));
        bookList.add(new Book(R.drawable.vominhloi,"Book "+3));

        categoryList.add(new Category("Category", bookList));
        categoryList.add(new Category("Category", bookList));
        categoryList.add(new Category("Category", bookList));
        categoryList.add(new Category("Category", bookList));
        categoryList.add(new Category("Category", bookList));
        return categoryList;
    }
}