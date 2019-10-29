package com.example.android.johor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class OthersActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_info);

        ArrayList<city_info> city_info= new ArrayList<>();

        city_info.add(new city_info("Puteri Fall (Gunung Ledang)","The Puteri Fall itself is more a cascade, about 60 meter tall. As the cascade is curved, it is not really possible to get a complete view of it. At the top of the cascade there is another small fall, with a nice swimming pool. The cemented walkway ends here, and the real climbing of the mountains starts.","","",R.drawable.puteri_waterfall));
        city_info.add(new city_info("Melor","The stream of Taka Melor waterfall has one attractive, single fall , and a pool that is really inviting for a swim. It is possible to climb to the top of the fall, but be careful, the rocks can be slippery. It is very serene, pristine and quiet on top.","","Taka Melor is located in Kampung Tenang,near the town of Labis in Segamat,Johor.To get here,follow the route N-S Highway",R.drawable.melor));
        city_info.add(new city_info("m tinggi fall","Along the route there are five checkpoints and Jeram Tinggi Fall is the first checkpoint. Jementah is located at the north east side of Gunung Ledang. Here is another less famous Gunung Ledang summit trail – Ulu Jementah trail. It takes the longest time and is the toughest trail to the summit.","","",R.drawable.m_tinggi));
        city_info.add(new city_info("gunung ledang","This is perhaps one of the most trekked mountains in Peninsular Malaysia. Gunung Ledang, which is also commonly known as Mount Ophir, can be accessed via two routes.\n" +
                "\n" +
                "The Sagil Path is the most commonly used path and is much longer than the Asahan route. The Asahan route is less known because it is less accessible as compared Sagil. A few trekkers have used the route up the Ophir Mountain.","","",R.drawable.gunung_ledang));
        city_info.add(new city_info("gunung arong","Gunung Arong Recreational Forest is a forest reserve located in the Mersing District in Johor.\n" +
                "\n" +
                "A stream runs through the entire length and breadth of the forest.\n" +
                "\n" +
                "The stream offers maximum enjoyment to many hikers and adventure seekers, whose cooling and refreshing effects are an unforgettable experience.","","",R.drawable.gunung_arong));
        CityAdapter cityAdapter = new CityAdapter(getApplication(),city_info,R.color.colorsOthers);

        ListView listView=(ListView)findViewById(R.id.ListView);
        listView.setAdapter(cityAdapter);
    }
}
