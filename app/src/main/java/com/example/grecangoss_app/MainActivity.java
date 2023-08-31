package com.example.grecangoss_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class MainActivity extends AppCompatActivity {
    private Button btn_principalPage;
    private ViewPager viewPager;
    private int[] imagenes = {R.drawable.imagen1, R.drawable.imagen2, R.drawable.imagen3};
    private int posicionActual = 0;

    private Handler handler = new Handler();
    private Runnable cambioAutomatico = new Runnable() {
        public void run() {
            posicionActual++;
            if (posicionActual >= imagenes.length) {
                posicionActual = 0;
            }
            viewPager.setCurrentItem(posicionActual, true);
            handler.postDelayed(this, 3000); // Cambiar cada 3 segundos
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_principalPage = findViewById(R.id.btn_principalPage);

        btn_principalPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                principal_page();
            }
        });

        viewPager = findViewById(R.id.view_pager);
        ImagePagerAdapter adapter = new ImagePagerAdapter(this, imagenes);
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {}

            @Override
            public void onPageSelected(int position) {
                posicionActual = position;
            }

            @Override
            public void onPageScrollStateChanged(int state) {}
        });

        handler.postDelayed(cambioAutomatico, 3000); // Iniciar cambio automático
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacks(cambioAutomatico); // Detener el cambio automático al cerrar la actividad
    }
    public void principal_page(){
        Intent principal_page = new Intent(MainActivity.this , com.example.grecangoss_app.principal_page.class);
        startActivity(principal_page);
    }


}