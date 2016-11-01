package com.ngocnv.wiringBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by framgia on 25/10/2016.
 */

@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc disc;

    @Autowired
    public CDPlayer(CompactDisc disc) {
        this.disc = disc;
    }

    public void play() {
        disc.play();
    }
}
