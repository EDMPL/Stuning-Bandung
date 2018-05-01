package com.android.stunningbdg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DetailWisataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_wisata);
    }

    public void Description(View view) {
        Intent intent = new Intent(DetailWisataActivity.this, DescriptionActivity.class);
        startActivity(intent);
    }

    public void ShowReview(View view) {
        Intent intent = new Intent(DetailWisataActivity.this, ShowReviewActivity.class);
        startActivity(intent);
    }

    public void Photos(View view) {
        Intent intent;
        intent = new Intent(DetailWisataActivity.this, PhotosActivity.class);
        startActivity(intent);
    }
}
