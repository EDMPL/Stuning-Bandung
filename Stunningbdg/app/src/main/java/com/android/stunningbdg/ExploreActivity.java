package com.android.stunningbdg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ExploreActivity extends AppCompatActivity {

    private ListView list_view;
    private AdapterWisata adapterWisata;
    String [] values = new String [] {
            "Dusun Bambu", "Situ Patenggang", "Kawah Putih",
            "Gedung sate", "Polban", "Rumah Aul", "Rumah Haya", "Rumah Jeremi",
            "JTK", "Pendopo", "p2t", "Pujasera", "LH", "Direktorat"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        list_view=(ListView) findViewById(R.id.simple_list);
        adapterWisata = new AdapterWisata(ExploreActivity.this, R.layout.wisata_list);
        list_view.setAdapter(adapterWisata);
        int j=1;
        for (int i = 0; i<values.length;i++) {
            Wisata wisata = new Wisata();
            wisata.setReview(String.valueOf(1551-i) + " Reviews");
            wisata.setRank("#" + (j+i));
            wisata.setNama("Wisata " + values [i]);
            adapterWisata.add(wisata);
        }
        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                //Toast.makeText(ExploreActivity.this, "Saya Pilih " + adapterWisata.getItem(arg2).getNama().toString(),
                        //Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ExploreActivity.this, DetailWisataActivity.class);
                startActivity(intent);
            }
        });
    }
}
