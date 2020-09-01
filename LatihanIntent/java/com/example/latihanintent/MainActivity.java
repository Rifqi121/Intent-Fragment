package com.example.latihanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button lili;
    Button luca;
    Button louis;
    Button leo;
    Button web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lili = (Button)findViewById(R.id.lili);
        lili.setOnClickListener(this);
        luca = (Button)findViewById(R.id.luca);
        luca.setOnClickListener(this);
        louis = (Button)findViewById(R.id.louis);
        louis.setOnClickListener(this);
        leo = (Button)findViewById(R.id.leo);
        leo.setOnClickListener(this);
        web = (Button)findViewById(R.id.web);
        web.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.lili:
                Intent lili = new Intent(MainActivity.this, LiliActivity.class);
                startActivity(lili);
                break;
            case R.id.luca:
                Intent luca = new Intent(MainActivity.this,LucaActivity.class);
                startActivity(luca);
                break;
            case R.id.louis:
                Intent louis = new Intent(MainActivity.this,LouisActivity.class);
                startActivity(louis);
                break;
            case R.id.leo:
                Intent leo = new Intent(MainActivity.this,LeoActivity.class);
                startActivity(leo);
                break;
            case R.id.web:
                Intent web = new Intent(Intent.ACTION_VIEW, Uri.parse("http://blackpinkupdate.com"));
                startActivity(web);
                break;
            default:
                break;
        }
    }
}
