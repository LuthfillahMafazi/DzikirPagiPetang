package com.example.lutfillahmafazi.dzikirpagipetang;

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


    public void btnKlik(View view) {
        Intent pindah = new Intent(this, chooseActivity.class);
        // untuk melakukan klik tombol star
        startActivity(pindah);
    }
}