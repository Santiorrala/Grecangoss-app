package com.example.grecangoss_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.Handler;

public class Policarbonato_page extends AppCompatActivity {
    private ViewPager viewPager;
    private int[]imagenes = {R.drawable.poli1, R.drawable.poli2,R.drawable.poli3, R.drawable.poli4,R.drawable.poli5, R.drawable.poli6,R.drawable.poli7, R.drawable.poli8,R.drawable.poli9, R.drawable.poli10,R.drawable.poli11, R.drawable.poli12, R.drawable.poli13, R.drawable.poli4,R.drawable.poli15};
    private int posicionActual = 0;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_policarbonato_page);

        viewPager = findViewById(R.id.viewPagerPoli);
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