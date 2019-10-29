package com.example.android.johor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView restaurants=(ImageView)findViewById(R.id.Restaurants);
        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent RestaurantsIntent= new Intent(MainActivity.this,RestaurantsActivity.class);

                startActivity(RestaurantsIntent);
            }
        });

        ImageView Malls=(ImageView)findViewById(R.id.Malls);
        Malls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MallsIntent= new Intent(MainActivity.this,MallsActivity.class);

                startActivity(MallsIntent);
            }
        });

        ImageView Historical=(ImageView)findViewById(R.id.Historical);
        Historical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent HistoricalIntent= new Intent(MainActivity.this,HistoricalActivity.class);

                startActivity(HistoricalIntent);
            }
        });

        ImageView Others=(ImageView)findViewById(R.id.Others);
        Others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent OthersIntent= new Intent(MainActivity.this,OthersActivity.class);

                startActivity(OthersIntent);
            }
        });

    }
}
