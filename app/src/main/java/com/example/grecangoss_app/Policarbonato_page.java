package com.example.grecangoss_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class Policarbonato_page extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_policarbonato_page);

        ImageView capuchon_poli = findViewById(R.id.capuchon_poli);
        ImageView conjunto_poli = findViewById(R.id.conjunto_poli);
        ImageView cintaventi_poli = findViewById(R.id.cintaventi_poli);
        ImageView pernoauto_poli = findViewById(R.id.pernoauto_poli);
        ImageView perfilU_poli = findViewById(R.id.perfilU_poli);
        ImageView techomaster_poli = findViewById(R.id.techomaster_poli);
        ImageView techo_tras_poli = findViewById(R.id.techo_tras_poli);
        ImageView duratecho_poli = findViewById(R.id.duratecho_poli);
        ImageView alveolar_poli = findViewById(R.id.alveolar_poli);
        ImageView compacto_poli = findViewById(R.id.compacto_poli);
        ImageView pernoplano_poli = findViewById(R.id.pernoplano_poli);
        ImageView tubosilicon_poli = findViewById(R.id.tubosilicon_poli);
        ImageView cintaaluminio_poli = findViewById(R.id.cintaaluminio_poli);

        capuchon_poli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.name_capuchon_policarbonato),getString(R.string.descripcion_capuchon_policarbonato),"drawable/grecangoss_capuchon_poli",getString(R.string.caracteristica_capuchon_policarbonato),getString(R.string.variacion_capuchon_policarbonato),getString(R.string.etiquetas_capuchon_policarbonato));

                Intent intent = new Intent(Policarbonato_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });

        conjunto_poli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.name_conjunto_capuchon_perno_autoperforante),getString(R.string.descripcion_conjunto_capuchon_perno_autoperforante),"drawable/grecangoss_conjunto_poli",getString(R.string.caracteristicas_destacadas_conjunto_capuchon_perno_autoperforante),getString(R.string.variacion_conjunto_poli),getString(R.string.etiquetas_conjunto_capuchon_perno_autoperforante));

                Intent intent = new Intent(Policarbonato_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });

        cintaventi_poli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.name_cinta_ventilacion),getString(R.string.descripcion_cinta_ventilacion),"drawable/grecangoss_cinta_venti_poli",getString(R.string.caracteristica_cinta_ventilacion),getString(R.string.variaciones_cinta_ventilacion),getString(R.string.etiquetas_cinta_ventilacion));

                Intent intent = new Intent(Policarbonato_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });

        pernoauto_poli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.name_perno_autoperforante),getString(R.string.descripcion_perno_autoperforante),"drawable/grecangoss_pernoauto_poli",getString(R.string.caracteristica_perno_autoperforante),getString(R.string.variaciones_perno_autoperforante),getString(R.string.etiquetas_perno_autoperforante));

                Intent intent = new Intent(Policarbonato_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });

        perfilU_poli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.name_perfil_aluminio_u),getString(R.string.descripcion_perfil_aluminio_u),"drawable/grecangoss_perfil_u_poli",getString(R.string.caracteristica_perfil_aluminio_u),getString(R.string.variaciones_perfil_aluminio_u),getString(R.string.etiquetas_perfil_aluminio_u));

                Intent intent = new Intent(Policarbonato_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });

        techomaster_poli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.name_techo_master1000_poli),getString(R.string.descripcion_techo_master1000_poli),"drawable/grecangoss_techomaster1000_poli",getString(R.string.caracteristica_techo_master1000_poli),getString(R.string.variacion_techo_master1000_poli),getString(R.string.etiqueta_techo_master1000_poli));

                Intent intent = new Intent(Policarbonato_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });

        techo_tras_poli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.name_techo_tras_poli),getString(R.string.descripcion_techo_tras_poli),"drawable/grecangoss_techo_tras_poli",getString(R.string.caracteristica_techo_tras_poli),getString(R.string.variacion_techo_tras_poli),getString(R.string.etiqueta_techo_tras_poli));

                Intent intent = new Intent(Policarbonato_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });

        alveolar_poli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.name_alveolar_poli),getString(R.string.descripcion_alveolar_poli),"drawable/grecangoss_alveolar_poli",getString(R.string.caracteristica_alveolar_poli),getString(R.string.variacion_alveolar_poli),getString(R.string.etiqueta_alveolar_poli));

                Intent intent = new Intent(Policarbonato_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });
        duratecho_poli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.name_techo_traslucido_policarbonato_duratecho_trapezoidal),getString(R.string.descripcion_techo_traslucido_policarbonato_duratecho_trapezoidal),"drawable/grecangoss_duratecho_poli",getString(R.string.caracteristicas_techo_traslucido_policarbonato_duratecho_trapezoidal),getString(R.string.variaciones_techo_traslucido_policarbonato_duratecho_trapezoidal),getString(R.string.etiquetas_techo_traslucido_policarbonato_duratecho_trapezoidal));

                Intent intent = new Intent(Policarbonato_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });

        compacto_poli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.name_compacto_poli),getString(R.string.descripcion_compacto_poli),"drawable/grecangoss_compacto_poli",getString(R.string.caracteristica_compacto_poli),getString(R.string.variacion_compacto_poli),getString(R.string.etiqueta_compacto_poli));

                Intent intent = new Intent(Policarbonato_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });

        pernoplano_poli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.name_perno_plano_1x10),getString(R.string.descripcion_perno_plano_1x10),"drawable/grecangoss_pernoplano_poli",getString(R.string.caracteristicas_perno_plano_1x10),getString(R.string.variaciones_perno_plano_1x10),getString(R.string.etiquetas_perno_plano_1x10));

                Intent intent = new Intent(Policarbonato_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });

        tubosilicon_poli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.name_tubo_silicon_policarbonato),getString(R.string.descripcion_tubo_silicon_policarbonato),"drawable/grecangoss_tubosilicon_poli",getString(R.string.caracteristica_tubo_silicon_policarbonato),getString(R.string.variacion_tubo_silicon_policarbonato),getString(R.string.etiquetas_tubo_silicon_policarbonato));

                Intent intent = new Intent(Policarbonato_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });

        cintaaluminio_poli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.name_cinta_aluminio_policarbonato),getString(R.string.descripcion_cinta_aluminio_policarbonato),"drawable/grecangoss_cintaaluminio_poli",getString(R.string.caracteristicas_cinta_aluminio_policarbonato),getString(R.string.variaciones_cinta_aluminio_policarbonato),getString(R.string.etiquetas_cinta_aluminio_policarbonato));

                Intent intent = new Intent(Policarbonato_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });
    }
}