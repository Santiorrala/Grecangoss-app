package com.example.grecangoss_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class FibraVidrio_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibra_vidrio_page);

        ImageView parasol_fibra = findViewById(R.id.parasol_fibra);
        ImageView masetero_fibra = findViewById(R.id.masetero_fibra);
        ImageView piscina_fibra = findViewById(R.id.piscina_fibra);
        ImageView bote_fibra = findViewById(R.id.bote_fibra);
        ImageView silla_fibra = findViewById(R.id.silla_fibra);
        ImageView tacho_fibra = findViewById(R.id.tacho_fibra);
        ImageView tapa_fibra = findViewById(R.id.tapa_fibra);
        ImageView tobogan_fibra = findViewById(R.id.tobogan_fibra);


        parasol_fibra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.name_parasol_fibra),getString(R.string.descripcion_parasol_fibra),"drawable/grecangoss_parasol_fibra",getString(R.string.carateristicas_parasol_fibra),getString(R.string.variacion_parasol_fibra),getString(R.string.etiqueta_parasol_fibra));

                Intent intent = new Intent(FibraVidrio_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });

        masetero_fibra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.name_masetero_fibra), getString(R.string.descripcion_masetero_fibra),"drawable/grecangoss_macetero_fibra", getString(R.string.caractesriticas_masetero_fibra),getString(R.string.variacion_masetero_fibra),getString(R.string.etiqueta_masetero_fibra));

                Intent intent = new Intent(FibraVidrio_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });

        piscina_fibra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.name_piscina_fibra),getString(R.string.descripcion_piscina_fibra),"drawable/grecangoss_psicina_fibra",getString(R.string.caracteristica_piscina_fibra),getString(R.string.variacion_piscina_fibra),getString(R.string.etiqueta_piscina_fibra));

                Intent intent = new Intent(FibraVidrio_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });

        bote_fibra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.name_bote_fribra),getString(R.string.descripcion_bote_fribra),"drawable/grecangoss_bote_fibra",getString(R.string.caracteristica_bote_fribra),getString(R.string.variacion_bote_fribra),getString(R.string.etiqueta_bote_fribra));

                Intent intent = new Intent(FibraVidrio_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });

        silla_fibra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.name_silla_fibra),getString(R.string.descripcion_silla_fibra),"drawable/grecangoss_silla_fibra",getString(R.string.caracteristicas_silla_fibra),getString(R.string.variacion_silla_fibra),getString(R.string.etiqueta_silla_fibra));

                Intent intent = new Intent(FibraVidrio_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });

        tacho_fibra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.name_tacho_basura_fibra),getString(R.string.descripcion_tacho_basura_fibra),"drawable/grecangoss_tacho_fibra",getString(R.string.caracteristica_tacho_basura_fibra),getString(R.string.variacion_tacho_basura_fibra),getString(R.string.etiqueta_tacho_basura_fibra));

                Intent intent = new Intent(FibraVidrio_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });

        tapa_fibra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.name_tapa_tacho_fibra),getString(R.string.descripcion_tapa_tacho_fibra),"drawable/grecangoss_tapa_fibra",getString(R.string.caracteristica_tapa_tacho_fibra),getString(R.string.variacion_tapa_tacho_fibra),getString(R.string.etiqueta_tapa_tacho_fibra));

                Intent intent = new Intent(FibraVidrio_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });

        tobogan_fibra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.name_tobogan_fibra),getString(R.string.descripcion_tobogan_fibra),"drawable/grecangoss_tobogan_fibra",getString(R.string.caracteristica_tobogan_fibra),getString(R.string.variacion_tobogan_fibra),getString(R.string.etiqueta_tobogan_fibra));

                Intent intent = new Intent(FibraVidrio_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });
    }
}