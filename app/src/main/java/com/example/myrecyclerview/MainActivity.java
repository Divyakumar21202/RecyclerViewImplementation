package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<ContactModel> arrayList =new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView;
        recyclerView=findViewById(R.id.recycler_view);

        arrayList.add(new ContactModel("DivyaKumar Patel","Im Android Developer",R.drawable.img_1));
        arrayList.add(new ContactModel("DivyaKumar Patel","Im Android Developer",R.drawable.img_1));
        arrayList.add(new ContactModel("DivyaKumar Patel","Im Android Developer",R.drawable.img_1));
        arrayList.add(new ContactModel("DivyaKumar Patel","Im Android Developer",R.drawable.img_1));
        arrayList.add(new ContactModel("DivyaKumar Patel","Im Android Developer",R.drawable.img_1));
        arrayList.add(new ContactModel("DivyaKumar Patel","Im Android Developer",R.drawable.img_1));
        arrayList.add(new ContactModel("DivyaKumar Patel","Im Android Developer",R.drawable.img_1));
        arrayList.add(new ContactModel("DivyaKumar Patel","Im Android Developer",R.drawable.img_1));
        arrayList.add(new ContactModel("DivyaKumar Patel","Im Android Developer",R.drawable.img_1));
        arrayList.add(new ContactModel("DivyaKumar Patel","Im Android Developer",R.drawable.img_1));
        arrayList.add(new ContactModel("DivyaKumar Patel","Im Android Developer",R.drawable.img_1));
        arrayList.add(new ContactModel("DivyaKumar Patel","Im Android Developer",R.drawable.img_1));
        arrayList.add(new ContactModel("DivyaKumar Patel","Im Android Developer",R.drawable.img_1));
        arrayList.add(new ContactModel("DivyaKumar Patel","Im Android Developer",R.drawable.img_1));
        arrayList.add(new ContactModel("DivyaKumar Patel","Im Android Developer",R.drawable.img_1));
        arrayList.add(new ContactModel("DivyaKumar Patel","Im Android Developer",R.drawable.img_1));
        arrayList.add(new ContactModel("DivyaKumar Patel","Im Android Developer",R.drawable.img_1));
        arrayList.add(new ContactModel("DivyaKumar Patel","Im Android Developer",R.drawable.img_1));
        arrayList.add(new ContactModel("DivyaKumar Patel","Im Android Developer",R.drawable.img_1));
        arrayList.add(new ContactModel("DivyaKumar Patel","Im Android Developer",R.drawable.img_1));
        arrayList.add(new ContactModel("DivyaKumar Patel","Im Android Developer",R.drawable.img_1));
        arrayList.add(new ContactModel("DivyaKumar Patel","Im Android Developer",R.drawable.img_1));
        arrayList.add(new ContactModel("DivyaKumar Patel","Im Android Developer",R.drawable.img_1));
        arrayList.add(new ContactModel("DivyaKumar Patel","Im Android Developer",R.drawable.img_1));
        arrayList.add(new ContactModel("DivyaKumar Patel","Im Android Developer",R.drawable.img_1));
        arrayList.add(new ContactModel("DivyaKumar Patel","Im Android Developer",R.drawable.img_1));
        arrayList.add(new ContactModel("DivyaKumar Patel","Im Android Developer",R.drawable.img_1));
        arrayList.add(new ContactModel("DivyaKumar Patel","Im Android Developer",R.drawable.img_1));

        RecyclerContactAdapter adapter =new RecyclerContactAdapter(this,arrayList);
        recyclerView.setAdapter(adapter);


    }
}