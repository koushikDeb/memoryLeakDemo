package com.iodroid.memoryLeak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    String imageurl ="https://wallpaperaccess.com/full/156340.jpg";
    String image2Url="https://images.unsplash.com/photo-1523302348819-ffd5c0521796?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=750&q=80";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }
    public void downloadIt(View view) {
        GetDemoAsync.getInstance(this).startDownload(imageurl);
        GetDemoAsync.getInstance(this).startDownload(image2Url);
    }

    //Download Should stop if activity is closed or backPressed
}