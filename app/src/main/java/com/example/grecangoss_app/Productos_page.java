package com.example.grecangoss_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;


import androidx.appcompat.app.AppCompatActivity;

public class Productos_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos_page);

        ImageView acrilicoImage= findViewById(R.id.acrilicoImage);
        ImageView fibra_vidrioImage = findViewById(R.id.fibra_vidrioImage);
        ImageView policarbonatoImage = findViewById(R.id.policarImage);
        ImageView resinaImage = findViewById(R.id.resinaImage);
        ImageView techometaImage = findViewById(R.id.techometaImage);
        ImageView techotermoImage = findViewById(R.id.techotermoImage);
        ImageView tejaImage = findViewById(R.id.tejaImage);

       acrilicoImage.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view){
               acrilico_page();
           }
       });
       fibra_vidrioImage.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               fibra_vidrioPage();
           }
       });
       policarbonatoImage.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               policarbonatoPage();
           }
       });
       resinaImage.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               resinaPage();
           }
       });
       techometaImage.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               techometaPage();
           }
       });
       techotermoImage.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               techotermoPage();
           }
       });
       tejaImage.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               tejaPage();
           }
       });
    }
    public void acrilico_page(){
        Intent acrilicoPage = new Intent(this, Acrilico_page.class);
        startActivity(acrilicoPage);
    }
    public void fibra_vidrioPage(){
        Intent fibra_vidrioPage = new Intent(this, FibraVidrio_page.class);
        startActivity(fibra_vidrioPage);
    }
    public void policarbonatoPage(){
        Intent policarbonatoPage = new Intent(this, Policarbonato_page.class);
        startActivity(policarbonatoPage);
    }
    public void resinaPage(){
        Intent resinaPage = new Intent(this, Resina_page.class);
        startActivity(resinaPage);

    }
    public void techometaPage(){
        Intent techoMetaPage = new Intent(this, TechoMeta_page.class);
        startActivity(techoMetaPage);

    }
    public void techotermoPage(){
        Intent techotermoPage = new Intent(this, TechoTermo_page.class);
        startActivity(techotermoPage);

    }
    public void tejaPage(){
        Intent tejaPage = new Intent(this, Teja_page.class);
        startActivity(tejaPage);

    }

}