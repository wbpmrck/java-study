package com.springaction.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt title";
    public void play() {
        System.out.println("Playing:"+title);
    }
}
