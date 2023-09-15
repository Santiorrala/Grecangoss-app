package com.example.grecangoss_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.widget.Toolbar;

import androidx.viewpager.widget.ViewPager;

public class MainActivity extends AppCompatActivity {
    private Button btn_principalPage;
    private ViewPager viewPager;
    private int[] imagenes = {R.drawable.imagen1, R.drawable.imagen2, R.drawable.imagen3,R.drawable.imagen4, R.drawable.imagen5};
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

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.acerca_de) {
            acerca_de_page();
        }
        else if (id == R.id.contactanos) {
            contactanos_page();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacks(cambioAutomatico); // Detener el cambio automático al cerrar la actividad
    }
    public void principal_page(){
        Intent principal_page = new Intent(MainActivity.this , Productos_page.class);
        startActivity(principal_page);
    }
    public void acerca_de_page(){
        Intent acerca_de_page = new Intent(MainActivity.this, Acerca_de_page.class);
        startActivity(acerca_de_page);
    }
    public void contactanos_page(){
        Intent contactanos = new Intent(MainActivity.this, Contactanos_page.class);
        startActivity(contactanos);
    }


}