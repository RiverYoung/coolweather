package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by River_young on 2017/2/18.
 */

public class County extends DataSupport{
    private int id;
    private String countyName;
    private int weatherId;
    private int countyId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public int getCountyId() {
        return countyId;
    }

    public void setCountyId(int countyId) {
        this.countyId = countyId;
    }
}
