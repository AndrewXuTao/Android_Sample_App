package com.example.tssh.sample_001;

import java.util.Date;

public class helloDate {
    String times;
    Date date = null;
    public helloDate() {
        super();
        date = new Date();
        times = date.toString();
    }

    public Date getDate() {
        return date;
    }
    public String gettime(){
        times = date.toString();
        return times;
    }
}
