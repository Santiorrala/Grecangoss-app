package com.example.grecangoss_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class Teja_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teja_page);

        ImageView tejaroma_pvc = findViewById(R.id.tejaroma_pvc);
        ImageView techotras_ondapequena_pvc = findViewById(R.id.techotras_ondapequena_pvc);
        ImageView techo_termo_pvc = findViewById(R.id.techo_termo_pvc);
        ImageView techo_tras_roma_pvc = findViewById(R.id.techo_tras_roma_pvc);


        tejaroma_pvc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.nombre_teja_roma_colonial),getString(R.string.descripcion_teja_roma_colonial),"drawable/grecangoss_tejaroma_pvc",getString(R.string.caracteristicas_teja_roma_colonial),getString(R.string.variaciones_teja_roma_colonial),getString(R.string.etiquetas_teja_roma_colonial));

                Intent intent = new Intent(Teja_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });

        techotras_ondapequena_pvc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.nombre_techo_traslucida_pvc_onda_pequena),getString(R.string.descripcion_techo_traslucida_pvc_onda_pequena),"drawable/grecangoss_techotras_ondapequena_pvc",getString(R.string.caracteristicas_techo_traslucida_pvc_onda_pequena),getString(R.string.variaciones_techo_traslucida_pvc_onda_pequena),getString(R.string.etiquetas_techo_traslucida_pvc_onda_pequena));

                Intent intent = new Intent(Teja_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });

        techo_termo_pvc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.nombre_techo_termoacustico_permatec),getString(R.string.descripcion_techo_termoacustico_permatec),"drawable/grecangoss_techo_termo_pvc",getString(R.string.caracteristicas_techo_termoacustico_permatec),getString(R.string.variaciones_techo_termoacustico_permatec),getString(R.string.etiquetas_techo_termoacustico_permatec));

                Intent intent = new Intent(Teja_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });

        techo_tras_roma_pvc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.nombre_techo_traslucido_roma_colonial),getString(R.string.descripcion_techo_traslucido_roma_colonial),"drawable/grecangoss_techotras_romacolo_pvc",getString(R.string.caracteristicas_techo_traslucido_roma_colonial),getString(R.string.variaciones_techo_traslucido_roma_colonial),getString(R.string.etiquetas_techo_traslucido_roma_colonial));

                Intent intent = new Intent(Teja_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });

    }
}