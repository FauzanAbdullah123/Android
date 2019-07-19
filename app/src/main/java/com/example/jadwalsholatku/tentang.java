package com.example.jadwalsholatku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class tentang extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);

        ImageButton instagram = (ImageButton) findViewById(R.id.imageButton1);
        instagram.setOnClickListener(new View.OnClickListener() {
            public void onClick(View a) {
                Intent myIntent = new
                        Intent(a.getContext(), instagram.class);
                startActivityForResult(myIntent, 0);
            }});
        ImageButton youtube = (ImageButton) findViewById(R.id.imageButton2);
        youtube.setOnClickListener(new View.OnClickListener() {
            public void onClick(View a) {
                Intent myIntent = new
                        Intent(a.getContext(), youtube.class);
                startActivityForResult(myIntent, 0);
            }});
        ImageButton facebook = (ImageButton) findViewById(R.id.imageButton3);
        facebook.setOnClickListener(new View.OnClickListener() {
            public void onClick(View a) {
                Intent myIntent = new
                        Intent(a.getContext(), facebook.class);
                startActivityForResult(myIntent, 0);
            }});

    }

}
