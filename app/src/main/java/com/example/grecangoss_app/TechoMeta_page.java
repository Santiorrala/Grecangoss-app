package com.example.grecangoss_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.Handler;

public class TechoMeta_page extends AppCompatActivity {
    private ViewPager viewPager;
    private int[]imagenes = {R.drawable.meta1, R.drawable.meta2,R.drawable.meta3, R.drawable.meta4, R.drawable.meta5 };
    private int posicionActual = 0;
    private Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_techo_meta_page);

        viewPager = findViewById(R.id.viewPagerTechoMeta);
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