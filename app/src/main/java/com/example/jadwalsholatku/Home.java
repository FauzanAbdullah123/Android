package com.example.jadwalsholatku;

import android.content.ClipData;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import android.content.Intent;
import android.widget.ImageButton;
import android.view.View;

public class Home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);


        ImageButton jadwal = (ImageButton) findViewById(R.id.imageButton9);
        jadwal.setOnClickListener(new View.OnClickListener() {
        public void onClick(View a) {
                Intent myIntent = new
                Intent(a.getContext(), jadwalsholat.class);
                startActivityForResult(myIntent, 0);
        }});

        ImageButton kompas = (ImageButton) findViewById(R.id.imageButton10);
        kompas.setOnClickListener(new View.OnClickListener() {
        public void onClick(View b) {
            Intent myIntent = new
                    Intent(b.getContext(), kompas.class);
            startActivityForResult(myIntent, 0);
        }});

        ImageButton lokasi = (ImageButton) findViewById(R.id.imageButton11);
        lokasi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View b) {
                Intent myIntent = new
                        Intent(b.getContext(), lokasi.class);
                startActivityForResult(myIntent, 0);
            }});
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.jadwal) {
            Intent intentku= new Intent(Home.this,jadwalsholat.class);
            startActivity(intentku);
        } else if (id == R.id.kiblat) {
            Intent intentku= new Intent(Home.this,kompas.class);
            startActivity(intentku);

        } else if (id == R.id.tentang) {
            Intent intentku= new Intent(Home.this,tentang.class);
            startActivity(intentku);

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
