package com.example.android.johor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.HttpAuthHandler;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class HistoricalActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_info);

        ArrayList<city_info> city_info= new ArrayList<>();

        city_info.add(new city_info("Tiong Hua Chinese Heritage Museum","The first, second and third floors display the lives of Chinese immigrants in Johor in 17th century while the fourth floor devotes to Dr. Sun Yat Sen, the founder and the first president of the Republic of China.","Tuesday to Sunday: 9:00am – 5:00pm\n" +
                "Entrance fee: RM6 per adult & RM3 per child","42, Jalan Ibrahim, Johor Bahru, Johor, Malaysia.",R.drawable.tiong_museum));
        city_info.add(new city_info("The Red House Johor Bahru","Later while the street was nominated as a heritage street, the facade was repainted in bright red and white and served as a prominent heritage building along the street." +
                "\n" +
                "Due to the eye-catching furnishing, it eventually turned into the landmark of the area and hosted many cultural events.","Email: heritage_museumjb@jb-tionghua.org.my","No.56, Jalan Tan Hiok Nee, Johor Bahru, Johor, Malaysia.\n" +
                " +607 – 224 9633",R.drawable.the_red_house));
        city_info.add(new city_info("Sri Raja Mariamman Temple Johor Bahru","The Hindu temple pays homage to the goddess Mariamman, the deity of fertility and rain and she was believed to cure disease and illness of her believers.","Daily: 6:00am – 5:00pm\n" +
                "Entrance Fee: Free","Between Jalan Trus & Jalan Ungku Puan, 8000 Johor Bahru, Johor, Malaysia",R.drawable.sri_raja));
        city_info.add(new city_info("Johor Bahru Old Chinese Temple","The temple holds an annual event, Chingay (Parade of Deities) that lasts for 4 days. Parading with the deities around the Town Centre of JB on the third night is the climax and highlight of this parade. The event has successfully attracted over 300k people in the past few years.","Daily: 7:00am – 5:00pm\n" +
                "Entrance Fee: Free","Lot 653, Jalan Trus, 80000 Johor Bahru, Johor, Malaysia.",R.drawable.old_chinese_temple));
        city_info.add(new city_info("Masjid India Johor Bahru @ India Muslim Mosque","Featuring a silver and blue dome with 2 minarets aside, the mosque comes with white walls with blue-tinted glass, offering a modern ambiance and convenient.\nUp until now, the history of the mosque is still a mystery. We only found out that the mosque was constructed by the local Indian Muslims. Or maybe you can ask the Indian Muslims around for more information.","","Jalan Duke, 80000 Johor Bahru, Johor, Malaysia",R.drawable.india_muslim_mosque));

        CityAdapter cityAdapter=new CityAdapter(getApplication(),city_info,R.color.colorsHistorical);

        ListView listView=(ListView)findViewById(R.id.ListView);
        listView.setAdapter(cityAdapter);

        JSONObject jsonObject=new JSONObject("sda");
        JSONArray jsonArray=jsonObject.getJSONArray("candies");
        JSONObject jsonObject2=jsonArray.getJSONObject(0);
        jsonObject2.getString("name");
        jsonObject2.getInt("sad");
        protected Void doInBackground(Void... arg0) {

            HttpAuthHandler httpAuthHandler=new HttpAuthHandler();
            httpAuthHandler.makeServiceCall()
    }




}
