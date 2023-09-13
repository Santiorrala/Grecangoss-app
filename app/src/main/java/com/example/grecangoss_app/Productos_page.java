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

       acrilicoImage.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view){
               acrilico_page();
               
           }
       });
    }
    public void acrilico_page(){
        Intent acrilicoPage = new Intent(this, Acrilico_page.class);
        startActivity(acrilicoPage);
    }
}