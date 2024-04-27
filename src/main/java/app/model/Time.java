package app.model;

import java.util.Date;

public class Time {
    private Date currentDate;
    public Time(Date currentDate) {
        this.currentDate = currentDate;
    }


    public Long getTime() {
        return currentDate.getTime();
    }
}
