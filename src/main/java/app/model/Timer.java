package app.model;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Timer {

    public Time getTimer() {
        return new Time(new Date());
    }
}
