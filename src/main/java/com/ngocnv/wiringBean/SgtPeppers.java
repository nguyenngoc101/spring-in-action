package com.ngocnv.wiringBean;

import org.springframework.stereotype.Component;

/**
 * Created by framgia on 25/10/2016.
 */

@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Title";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " +title+ " by " +artist);
    }
}
