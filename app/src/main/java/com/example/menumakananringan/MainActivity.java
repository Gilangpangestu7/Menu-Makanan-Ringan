package com.example.menumakananringan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recKuliner;
    private ArrayList<Kuliner> listKuliner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recKuliner = findViewById(R.id.rec_kuliner);
        initData();

        recKuliner.setAdapter(new KulinerAdapter(listKuliner));
        recKuliner.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData(){
        this.listKuliner = new ArrayList<>();
        listKuliner.add(new Kuliner("Kue Pancong",
                "10.000",
                "Kue panco cocok di hidangkan di pagi sebagai cemilan atau sarapan, enak bangettt.",
                R.drawable.kuepancong));

        listKuliner.add(new Kuliner("Kue Balok Imara",
                "20.000",
                "Kue ini cocok bagi pecinta manis-manis dan coklat karena rasanya yang sangat lezat.",
                R.drawable.kuebalokimara));

        listKuliner.add(new Kuliner("Kembang goyang",
                "30.000",
                "Makanan khas Betawi yang rasanya renyah dan gurih",
                R.drawable.kembanggoyang));

        listKuliner.add(new Kuliner("Risol",
                "3.000",
                "Makanan cocok disajikan pada saat acara karena rasanya yang mengenyangkan.",
                R.drawable.risol));
    }
}