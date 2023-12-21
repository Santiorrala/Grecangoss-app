package com.example.grecangoss_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Acrilico_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acrilico_page);

        ImageView domo_acrilico = findViewById(R.id.domo_acrilico);
        ImageView lamina_acrilico = findViewById(R.id.lamina_acrilico);

        domo_acrilico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear un objeto Product con la información del producto
                Product selectedProduct = new Product(getString(R.string.nombre_domo_acrilico), getString(R.string.descripcion_domo_acrilico), "drawable/grecangoss_domos_acrilicos", getString(R.string.caracteristica_domo_acrilico), getString(R.string.variacion_domo_acrilico), getString(R.string.etiqueta_domo_acrilico));

                // Iniciar la actividad ProductDetailActivity y pasar el producto
                Intent intent = new Intent(Acrilico_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT", selectedProduct);
                startActivity(intent);
            }
        });

        lamina_acrilico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Product selecproduct = new Product(getString(R.string.name_lamina_acrilico),getString(R.string.descripcion_lamina_acrilico),"drawable/grecangoss_laminas_acrilicos",getString(R.string.carateristica_lamina_acrilico),getString(R.string.variacion_lamina_acrilico),getString(R.string.etiqueta_lamina_acrilico));

                Intent intent = new Intent(Acrilico_page.this, producto_detalle.class);
                intent.putExtra("PRODUCT",selecproduct );
                startActivity(intent);
            }
        });



    }

}