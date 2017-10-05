package com.example.victordias.atdesginjohn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InformacaoPessoal extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacao_pessoal);


    }

    public void voltar (View v){
        Intent i = new Intent();
        i.setClass(InformacaoPessoal.this, MainActivity.class);
        startActivity(i);
        finish();
    }
}
