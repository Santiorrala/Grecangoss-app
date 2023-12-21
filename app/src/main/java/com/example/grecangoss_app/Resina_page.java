package com.example.grecangoss_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class Resina_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resina_page);

        ImageView teja_grande_resina = findViewById(R.id.teja_grande_resina);
        ImageView teja_pequenaa_resina = findViewById(R.id.teja_pequena_resina);
        ImageView cumbrero_principal_resina = findViewById(R.id.cumbrero_principal_resina);
        ImageView union3vias_resina = findViewById(R.id.union3vias_resina);
        ImageView cubrero_lateral_resina = findViewById(R.id.cubrero_lateral_resina);
        ImageView cubrero_izquierdo_resina = findViewById(R.id.cubrero_izquierdo_resina);
        ImageView terminal_frontal_resina = findViewById(R.id.terminal_frontal_resina);


        teja_grande_resina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.name_teja_espanola_resina_pvc_onda_grande),getString(R.string.descripcion_teja_espanola_resina_pvc_onda_grande),"drawable/grecangoss_teja_espanola_grande_resina",getString(R.string.beneficios_caracteristicas_teja_espanola_resina_pvc_onda_grande),getString(R.string.variacion_capuchon_policarbonato),getString(R.string.etiquetas_teja_espanola_resina_pvc_onda_grande));

                Intent intent = new Intent(Resina_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });

        teja_pequenaa_resina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.name_teja_espanola_resina_pvc_onda_pequena),getString(R.string.descripcion_teja_espanola_resina_pvc_onda_pequena),"drawable/grecangoss_tejaespanola_pequena_resina",getString(R.string.caracteristica_teja_espanola_resina_pvc_onda_pequena),getString(R.string.variacion_capuchon_policarbonato),getString(R.string.etiquetas_teja_espanola_resina_pvc_onda_pequena));

                Intent intent = new Intent(Resina_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });

        cumbrero_principal_resina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.name_cumbrero_principal_2_aguas_teja_resina_sintetica),getString(R.string.descripcion_cumbrero_principal_2_aguas_teja_resina_sintetica),"drawable/grecangoss_cumbreroprincipal_2agua_resina",getString(R.string.caracteristica_cumbrero_principal_2_aguas_teja_resina_sintetica),getString(R.string.variacion_capuchon_policarbonato),getString(R.string.etiquetas_cumbrero_principal_2_aguas_teja_resina_sintetica));

                Intent intent = new Intent(Resina_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });

        union3vias_resina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.name_union_3_vias_teja_resina_sintetica),getString(R.string.descripcion_union_3_vias_teja_resina_sintetica),"drawable/grecangoss_union3vias_resina",getString(R.string.caracteristica_union_3_vias_teja_resina_sintetica),getString(R.string.variaciones_union_3_vias_teja_resina_sintetica),getString(R.string.etiquetas_union_3_vias_teja_resina_sintetica));

                Intent intent = new Intent(Resina_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });

        cubrero_lateral_resina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.name_cumbrero_lateral_teja_resina_sintetica),getString(R.string.descripcion_cumbrero_lateral_teja_resina_sintetica),"drawable/grecangoss_cubrerolateral_resina",getString(R.string.caracteristica_cumbrero_lateral_teja_resina_sintetica),getString(R.string.variaciones_cumbrero_lateral_teja_resina_sintetica),getString(R.string.etiquetas_cumbrero_lateral_teja_resina_sintetica));

                Intent intent = new Intent(Resina_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });

        cubrero_izquierdo_resina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.name_cumbrero_lateral_izquierdo_derecho_teja_resina_sintetica),getString(R.string.descripcion_cumbrero_lateral_izquierdo_derecho_teja_resina_sintetica),"drawable/grecangoss_cubrero_izquierdo_resina",getString(R.string.caracteristica_cumbrero_lateral_izquierdo_derecho_teja_resina_sintetica),getString(R.string.variaciones_cumbrero_lateral_izquierdo_derecho_teja_resina_sintetica),getString(R.string.etiquetas_cumbrero_lateral_izquierdo_derecho_teja_resina_sintetica));

                Intent intent = new Intent(Resina_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });

        terminal_frontal_resina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.name_terminal_frontal_remate_teja_resina_sintetica),getString(R.string.descripcion_terminal_frontal_remate_teja_resina_sintetica),"drawable/grecangoss_terminalfrontal_resina",getString(R.string.caracteristica_terminal_frontal_remate_teja_resina_sintetica),getString(R.string.variaciones_terminal_frontal_remate_teja_resina_sintetica),getString(R.string.etiquetas_terminal_frontal_remate_teja_resina_sintetica));

                Intent intent = new Intent(Resina_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });
    }
}