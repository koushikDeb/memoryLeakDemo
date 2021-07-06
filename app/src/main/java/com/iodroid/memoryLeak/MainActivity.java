package com.iodroid.memoryLeak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    String imageurl ="https://www.rd.com/wp-content/uploads/2021/03/GettyImages-1133605325-scaled-e1617227898456.jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void downloadIt(View view) {
        GetDemoAsync.getInstance(this).startDownload(imageurl);
    }

    public void nextPage(View view) {
        startActivity(new Intent(this,SecondActivity.class));
    }

    //Download Should stop if activity is closed or backPressed
}