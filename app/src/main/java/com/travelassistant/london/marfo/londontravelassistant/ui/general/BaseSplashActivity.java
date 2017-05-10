package com.travelassistant.london.marfo.londontravelassistant.ui.general;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;

/**
 * Created by martafoderaro on 07/05/2017.
 */

public abstract class BaseSplashActivity extends Activity {

    private static final double DEFAULT_SPLASH_DELAY_MS = 7 * 1000;

    protected int minDisplayMs = (int) DEFAULT_SPLASH_DELAY_MS;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final long start = System.currentTimeMillis();

        new Thread(new Runnable() {
            public void run() {

                final Application app = getApplication();
                doStuffInBackground(app);

                final long duration = System.currentTimeMillis() - start;
                if (duration < minDisplayMs) {
                    try {
                        Thread.sleep(minDisplayMs - duration);
                    } catch (InterruptedException e) {
                        Thread.interrupted();
                    }
                }
            }
        }).start();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startNextActivity();
            }
        }, minDisplayMs);
    }

    /**
     * Executes whatever operation which needs a separate thread to be completed (i.e. blocking UI thread ops)
     * @param app
     */
    protected void doStuffInBackground(Application app) {

    }

    /**
     * Automatically triggered once the stuff in background thread has finished
     */
    protected abstract void startNextActivity();

}
