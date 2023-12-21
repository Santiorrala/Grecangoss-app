package com.example.grecangoss_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class TechoMeta_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_techo_meta_page);

        ImageView supertecho_03_tm = findViewById(R.id.supertecho_03_tm);
        ImageView master1000_prepintado_tm = findViewById(R.id.master1000de40_prepintado_tm);
        ImageView zinc_tm = findViewById(R.id.zinc_tm);
        ImageView teja_toledo_tm = findViewById(R.id.teja_toledo_tm);

        supertecho_03_tm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.name_supertecho_030mm),getString(R.string.descripcion_supertecho_030mm),"drawable/grecangoss_supertecho03_tm",getString(R.string.caracteristicas_supertecho_030mm),getString(R.string.variaciones_supertecho_030mm),getString(R.string.etiquetas_supertecho_030mm));

                Intent intent = new Intent(TechoMeta_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });

        master1000_prepintado_tm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.name_master_1000_040mm_prepintado),getString(R.string.descripcion_master_1000_040mm_prepintado),"drawable/grecangoss_master1000de040_prepintado_tm",getString(R.string.beneficios_caracteristicas_master_1000_040mm_prepintado),getString(R.string.variaciones_supertecho_030mm),getString(R.string.etiquetas_master_1000_040mm_prepintado));

                Intent intent = new Intent(TechoMeta_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });

        zinc_tm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.nombre_cubierta_zinc),getString(R.string.descripcion_cubierta_zinc),"drawable/grecangoss_zinc_tm",getString(R.string.beneficios_caracteristicas_cubierta_zinc),getString(R.string.variaciones_cubierta_zinc),getString(R.string.etiquetas_cubierta_zinc));

                Intent intent = new Intent(TechoMeta_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });

        teja_toledo_tm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product productSelect = new Product(getString(R.string.nombre_teja_toledo),getString(R.string.descripcion_teja_toledo),"drawable/grecangoss_teja_toledo_tm",getString(R.string.beneficios_caracteristicas_teja_toledo),getString(R.string.variaciones_teja_toledo),getString(R.string.etiquetas_teja_toledo));

                Intent intent = new Intent(TechoMeta_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",productSelect);
                startActivity(intent);
            }
        });


    }
}