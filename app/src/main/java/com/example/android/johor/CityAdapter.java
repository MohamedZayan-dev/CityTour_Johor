package com.example.android.johor;

import android.support.v4.content.ContextCompat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CityAdapter extends ArrayAdapter<city_info> {

    private int mInfoColor;

    public CityAdapter(Context context,ArrayList<city_info> city_info, int InfoColor){

        super(context, 0, city_info);

        mInfoColor=InfoColor;
    }

    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {

        View ListInfo=convertView;
        if(ListInfo==null){
            ListInfo=LayoutInflater.from(getContext()).inflate(R.layout.info,parent,false);
        }
    city_info currentInfo=getItem(position);

        ImageView image=(ImageView)ListInfo.findViewById(R.id.image);

        image.setImageResource(currentInfo.getImage());
        image.setVisibility(View.VISIBLE);

        TextView title=(TextView)ListInfo.findViewById(R.id.title);
        title.setText(currentInfo.getTitle());

        TextView info=(TextView)ListInfo.findViewById(R.id.info);

        info.setText(currentInfo.getInfo());

        TextView speciality=(TextView)ListInfo.findViewById(R.id.speciality);
        speciality.setText(currentInfo.getSpeciality());

        TextView address=(TextView) ListInfo.findViewById(R.id.address);
        address.setText(currentInfo.getAddress());

        View InfoContainer =ListInfo.findViewById(R.id.InfoContainer);

        int color=ContextCompat.getColor(getContext(),mInfoColor);
        InfoContainer.setBackgroundColor(color);

        return ListInfo;
    }
}
