package com.example.lutfillahmafazi.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class chooseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
    }
    // jika membuat onClik di dalam xml dan menemukan garis merah maka harus membuat nya terlebih dahulu di dalam java
    public void DzikirPagi(View view) {
        // membuat method didalam func
        // dan untuk menjelaskan tentang bahwa kita ingin memasukan intent pindah ke dalam Activity baru
        Intent pindah = new Intent(this, DzikirPagiActivity.class);
        startActivity(pindah);
    }

    public void DzikirPetang(View view) {
    Intent pindah = new Intent(this, DzikirPetangActivity.class);
    startActivity(pindah);
    }
}
