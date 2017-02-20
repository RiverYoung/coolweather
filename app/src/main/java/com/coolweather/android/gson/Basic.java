package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by River_young on 2017/2/19.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
