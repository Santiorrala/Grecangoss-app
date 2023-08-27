package com.example.grecangoss_app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class MainActivity extends AppCompatActivity {
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

}