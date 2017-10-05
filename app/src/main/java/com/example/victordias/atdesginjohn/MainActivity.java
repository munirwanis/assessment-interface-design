package com.example.victordias.atdesginjohn;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.activity_informacao_pessoal) {
            activityInformacaoPessoal();
        } else if (id == R.id.activity_formacao) {
            activityFormacao();
        } else if (id == R.id.activity_experencia_profissional) {
            activityExperenciaProfissional();
        } else if (id == R.id.activity_curso) {
            activityCurso();
        } else if (id == R.id.activity_publicacao) {
            activityPublicacao();
        } else if (id == R.id.activity_cadastro) {
            activityCadastro();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    void activityInformacaoPessoal (){
        Intent i = new Intent();
        i.setClass(MainActivity.this, InformacaoPessoal.class);
        startActivity(i);
        finish();
    }

    void activityFormacao (){
        Intent i = new Intent();
        i.setClass(MainActivity.this, Formacao.class);
        startActivity(i);
        finish();
    }

    void activityExperenciaProfissional (){
        Intent i = new Intent();
        i.setClass(MainActivity.this, ExperenciaProfissional.class);
        startActivity(i);
        finish();
    }

    void activityCurso (){
        Intent i = new Intent();
        i.setClass(MainActivity.this, Curso.class);
        startActivity(i);
        finish();
    }

    void activityPublicacao (){
        Intent i = new Intent();
        i.setClass(MainActivity.this, Publicacao.class);
        startActivity(i);
        finish();
    }

    void activityCadastro (){
        Intent i = new Intent();
        i.setClass(MainActivity.this, Cadastro.class);
        startActivity(i);
        finish();
    }
}
