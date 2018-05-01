package com.android.stunningbdg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ShowReviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_review);
    }

    public void WriteReview(View view) {
        Intent intent = new Intent(ShowReviewActivity.this, ReviewActivity.class);
        startActivity(intent);
    }
}
