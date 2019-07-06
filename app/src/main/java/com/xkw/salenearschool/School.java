package com.xkw.salenearschool;

public class School {

    private double lat;
    private double lon;
    private int type;
    private String title;

    public School(double lat,double lon,int type,String title){
        this.lat = lat;
        this.lon = lon;
        this.type = type;
        this.title = title;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
