package com.example.android.johor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.list_view_info);

        ArrayList<city_info> city_info= new ArrayList<>();

        city_info.add(new city_info("fatfish ","Sea food\nCertificate of Excellence2019 Winner.\nAt Fatfish you make a number of choices to customize your own meal. ","Chinese, Asian",
                "97 Jalan Beringin, Taman Melodies, Johor Bahru 80250 Malaysia\n+60 7-330 9420",R.drawable.faftish));
        city_info.add(new city_info("Tosca ","Hilton restaurant: elegant place with excellent Italian cuisine. Possibility of a daily menu at a great price. ","Italian, Pizza, European, Vegetarian Friendly ",
                "12 Jalan Ngee Heng, Johor Bahru 80000 Malaysia\n+60 7-268 6970",R.drawable.tosca));
        city_info.add(new city_info("Wadi Hana Elarabi ","This Egyptian style restaurant served all the top Arabian dishes that you can think of. Among those would be Makhlouba and Mandi rice...simply stunning.  ","Mediterranean, Barbecue, Middle Eastern, Egyptian, Arabic",
                "No 1 Jalan Pembangunan Taman Desa Rahmat, Johor Bahru 81200 Malaysia\n+60 17-737 7352",R.drawable.wadi_al_hana));
        city_info.add(new city_info("Cafe BLD ","Certificate of Excellence2016 - 2019 Winner\nThis all-day dining restaurant's casual and creative menu serves up international cuisine with a local touch, open for breakfast, lunch and dinner in Johor Bahru ","Local cuisine, Asian, Malaysian, International, Halal, Vegetarian Friendly",
                "\n" +
                        "No. 2 Jalan Permas 11 Bandar Baru Permas Jaya, Johor Bahru 81750 Malaysia\n6073813322",R.drawable.cafe_bld));
        city_info.add(new city_info("Chez Papa ","Certificate of Excellence2015 - 2019 Winner\nEstablished in 1999. Traditional French Regional Cuisine. Cheerful and comfortable Bistro decor. Considered Fine Dinning by some customers.","French, European, Wine Bar, Vegetarian Friendly, Vegan Options",
                "\n" +
                        "38 & 40 Jalan Jaya Taman Maju Jaya, Johor Bahru 80400 Malaysia\n+60 6073334988",R.drawable.chez_papa));
        city_info.add(new city_info("Spice Grill ","Vegetarian Friendly, Vegan Options, Halal, Gluten Free Options\nThere is nice nan bread and there is a wide variety of different Indian foods as well as a fusion menu for people who don't have to have Indian. ","Local cuisine, Indian, Vegetarian Friendly, Vegan Options, Halal",
                "\n" +
                        "Lot 1B 4b, Ground Floor of Little Red Cube Club, Johor Bahru 81300 Malaysia\n+60 7-509 6644",R.drawable.spice_grill));
       city_info.add(new city_info("Makan Kitchen ","Certificate of Excellence2016 - 2019 Winner\nAn eclectic mix of famous local cuisine prepared in a live, interactive kitchen, showcasing the diversity of many native favorites from all over the country.","Asian, Malaysian, Indian ",
                "\n" +
                        "12 Jalan Ngee Heng, Johor Bahru 80000 Malaysia\n+60 7-268 6868",R.drawable.makan_kitchen));

        CityAdapter adapter= new CityAdapter(getApplication(),city_info,R.color.colorRestaurants);

        ListView listView=(ListView)findViewById(R.id.ListView);
        listView.setAdapter(adapter);

    }
}
