package com.example.grecangoss_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.Handler;

public class FibraVidrio_page extends AppCompatActivity {
    private ViewPager viewPager;
    private int[]imagenes = {R.drawable.fibra1, R.drawable.fibra2,R.drawable.fibra3, R.drawable.fibra4, R.drawable.fibra5, R.drawable.fibra6, R.drawable.fibra7, R.drawable.fibra8, R.drawable.fibra9};
    private int posicionActual = 0;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibra_vidrio_page);

        viewPager = findViewById(R.id.viewPagerFibra);
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