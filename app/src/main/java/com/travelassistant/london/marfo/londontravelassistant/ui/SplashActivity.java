package com.travelassistant.london.marfo.londontravelassistant.ui;

import android.app.Application;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.travelassistant.london.marfo.londontravelassistant.R;
import com.travelassistant.london.marfo.londontravelassistant.ui.general.BaseSplashActivity;

/**
 * Created by martafoderaro on 07/05/2017.
 */

public class SplashActivity extends BaseSplashActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);
    }

    @Override
    protected void doStuffInBackground(Application app) {
        super.doStuffInBackground(app);
        // do nothing for now
    }

    @Override
    protected void startNextActivity() {

    }
}
