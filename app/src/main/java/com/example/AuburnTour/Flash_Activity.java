package com.example.AuburnTour;
import java.lang.InterruptedException;

import android.content.Intent;
import android.os.Bundle;

public class Flash_Activity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //waiting time to run main application
        try {
            Thread.sleep(4000);

        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        startActivity(new Intent(this,MainActivity.class));
        finish();

    }
}