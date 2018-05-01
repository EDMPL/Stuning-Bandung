package com.android.stunningbdg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Review(View view) {
        Intent intent = new Intent(MainActivity.this, ReviewActivity.class);
        startActivity(intent);
    }

    public void Explore(View view) {
        Intent intent = new Intent(MainActivity.this, ExploreActivity.class);
        startActivity(intent);
    }
}
