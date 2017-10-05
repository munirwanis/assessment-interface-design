package com.example.victordias.atdesginjohn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Curso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curso);
    }

    public void voltar (View v){
        Intent i = new Intent();
        i.setClass(Curso.this, MainActivity.class);
        startActivity(i);
        finish();
    }
}
