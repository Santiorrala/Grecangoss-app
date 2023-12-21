package com.example.grecangoss_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class producto_detalle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto_detalle);

        Intent intent = getIntent();
        if (intent != null) {
            Product producto = (Product) intent.getSerializableExtra("PRODUCT");

            // Mostrar la información del producto en la ventana
            if (producto != null) {
                ImageView productImageView = findViewById(R.id.productImageView);
                TextView productNameTextView = findViewById(R.id.productNameTextView);
                TextView productDescriptionTextView = findViewById(R.id.productDescriptionTextView);
                TextView productCarateristicaTextview = findViewById(R.id.productCaracteristicaTextView);
                TextView productVariacionTextview = findViewById(R.id.productVariacionTextView);
                TextView productEtiquetaTextview = findViewById(R.id.productEtiquetaTextView);

                // Configurar la imagen del producto
                int imageResourceId = getResourceId(producto.getImageResourceId(), "drawable", getPackageName());

                productImageView.setImageResource(imageResourceId);

                // Mostrar la información del producto
                productNameTextView.setText(producto.getName());
                productDescriptionTextView.setText(producto.getDescripcion());
                productCarateristicaTextview.setText(producto.getCaracteristica());
                productVariacionTextview.setText(producto.getVariacion());
                productEtiquetaTextview.setText(producto.getEtiqueta());
            }

        }
    }
    private int getResourceId(String resourceName, String resourceType, String packageName) {
        Resources resources = getResources();
        return resources.getIdentifier(resourceName, resourceType, packageName);
    }
}