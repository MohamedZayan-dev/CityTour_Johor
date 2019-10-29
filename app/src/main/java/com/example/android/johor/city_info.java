package com.example.android.johor;

public class city_info {
private int mImage;
private String minfo;
private String mspeciality;
private String mTitle;
private String maddress;

public city_info(String title,String info,String speciality,String address, int image){
    mImage=image;
    minfo=info;
    mspeciality=speciality;
    mTitle=title;
    maddress=address;
}

public int getImage(){
    return mImage;
}
public String getInfo(){
    return minfo;
}
public String getSpeciality(){
    return mspeciality;
}
public String getTitle(){
    return mTitle;
}
public String getAddress(){
    return maddress;
}

}
