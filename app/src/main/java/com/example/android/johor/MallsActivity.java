package com.example.android.johor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MallsActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_info);

        ArrayList<city_info> city_info= new ArrayList<>();

        city_info.add(new city_info("Midvalley Southkey","Located five minutes from Woodlands, The Mall, Midvalley Southkey features hundreds of stores, including familiar names like SOGO, Michael Kors and Coach.  Of course, there are also plenty of F&B options, from popular Malaysian brands like Lavender and HoMinSan, to family favourites such as Kenny Rogers.","Opening hours: Monday to Sunday (10am to 10pm)"," Jalan Bakar Batu, Southkey, 81100 Johor Bahru, Johor",R.drawable.midvalley_southkey));
        city_info.add(new city_info("R&F","There are many firsts-in-JB brands at R&F Mall, including Emperor Cinemas from Hong Kong, Oregin bubble tea from Taiwan and Kynchon fried chicken from Korea."," Monday to Sunday (10am to 10pm)","L2-086-A5, Mercu 1, Jalan Tanjung Puteri, 80300 Johor Bahru, Malaysia",R.drawable.r_f));
        city_info.add(new city_info("Johor Premium Outlets"," As its name suggests, you will have a hard time choosing what to buy from a wide range of global brands such as Akemi Uchi, Adidas, Beauty Scents, Poney Outlet, Swatch, Vincci, Sembonia and others.","Monday to Sunday (10am to 10pm)"," Jalan Premium Outlets Indahpura, 81000 Kulai, Johor, Malaysia",R.drawable.premium_outlets));
        city_info.add(new city_info("Paradigm ","Paradigm Mall is Johor Bahru’s LARGEST shopping centre! Paradigm Mall JB spans more than 2 million square feet and features the largest movie theatre in the state operated by Golden Screen Cinemas. With seven floors and over 500 outlets offering the best entertainment, fashion and delicacies; no matter what you’re looking for, you’re sure to find it.","Monday to Sunday (10am to 10pm)"," Paradigm Mall Johor Bahru, Jalan Skudai, 81200 Johor Bahru, Johor, Malaysia",R.drawable.paradigm));
        city_info.add(new city_info("Angsana ","Angsana Johor Bahru Mall is one of the most popular shopping hubs in the state of Johor. With more than 238 retail outlets with local and international brands and a wide range of goods to choose from, you can shop ‘til you drop.","Monday to Sunday (10am to 10pm)","Level 3, Angsana JB Mall, Jalan Tampoi, 81200 Johor Bahru, Johor, Malaysia",R.drawable.angsanajpg));

        CityAdapter cityAdapter = new CityAdapter(getApplication(),city_info,R.color.colorMalls);

        ListView listView=(ListView)findViewById(R.id.ListView);
        listView.setAdapter(cityAdapter);
    }
}
