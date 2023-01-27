package org.example.intro;

import java.util.concurrent.TimeUnit;

public class Helper {
    public static void pause(Integer milliseconds) {
        try {
            TimeUnit.MILLISECONDS.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}