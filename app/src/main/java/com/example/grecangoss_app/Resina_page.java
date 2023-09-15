package com.example.grecangoss_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.Handler;

public class Resina_page extends AppCompatActivity {
    private ViewPager viewPager;
    private int[]imagenes = {R.drawable.resina1, R.drawable.resina2,R.drawable.resina3, R.drawable.resina4,R.drawable.resina5, R.drawable.resina6, R.drawable.resina7 };
    private int posicionActual = 0;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resina_page);

        viewPager = findViewById(R.id.viewPagerResina);
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