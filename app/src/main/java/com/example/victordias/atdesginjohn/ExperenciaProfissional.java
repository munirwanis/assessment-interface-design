package com.example.victordias.atdesginjohn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ExperenciaProfissional extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experencia_profissional);
    }

    public void voltar (View v){
        Intent i = new Intent();
        i.setClass(ExperenciaProfissional.this, MainActivity.class);
        startActivity(i);
        finish();
    }
}
