package com.example.grecangoss_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.Handler;

public class TechoTermo_page extends AppCompatActivity {
    private ViewPager viewPager;
    private int[]imagenes = {R.drawable.termo1, R.drawable.termo2};
    private int posicionActual = 0;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_techo_termo_page);

        viewPager = findViewById(R.id.viewPagerTechoTermo);
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
    }
}