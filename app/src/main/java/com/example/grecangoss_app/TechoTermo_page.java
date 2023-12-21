package com.example.grecangoss_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class TechoTermo_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_techo_termo_page);

        ImageView cubierta_madrilena_ta = findViewById(R.id.cubierta_madrilena_ta);
        ImageView cubierta_trapezoidal_ta = findViewById(R.id.cubierta_trapezoidal_ta);


        cubierta_madrilena_ta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.nombre_cubierta_termoacustica_madrilena),getString(R.string.descripcion_cubierta_termoacustica_madrilena),"drawable/grecangoss_cubierta_termomadri_ta",getString(R.string.caracteristicas_cubierta_termoacustica_madrilena),getString(R.string.variaciones_cubierta_termoacustica_madrilena),getString(R.string.etiquetas_cubierta_termoacustica_madrilena));

                Intent intent = new Intent(TechoTermo_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });

        cubierta_trapezoidal_ta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.nombre_cubierta_termoacustica_trapezoidal),getString(R.string.descripcion_cubierta_termoacustica_trapezoidal),"drawable/grecangoss_cubierta_termotrape_ta",getString(R.string.caracteristicas_cubierta_termoacustica_trapezoidal),getString(R.string.variaciones_cubierta_termoacustica_trapezoidal),getString(R.string.etiquetas_cubierta_termoacustica_trapezoidal));

                Intent intent = new Intent(TechoTermo_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });


    }
}