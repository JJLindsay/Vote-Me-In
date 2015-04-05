package com.gamingpc.votemein.votemein;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * author: JJ Lindsay
 * version: 1.0
 * Course: ITEC 4550 Spring 2015
 * Written: 4/5/2015
 *
 * This class represents a ...
 *
 * Purpose: Allows the manipulation of a ...
 */
public class Splash extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
    }

    @Override
    public void startActivity(Intent intent)
    {
        super.startActivity(intent);
    }
}
