package com.example.restoran;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.logo_layout);

        //splash_layout adalah nama file xml yang akan kita baut nanti

        Thread timer = new Thread() {

            @Override

            public void run() {

                long startTime = System.currentTimeMillis();

                long now = System.currentTimeMillis();

                if (now - startTime < 5000){

                    try {

                        sleep(5000 - (now - startTime));

                    } catch (InterruptedException iEx){

                    }

                }
                //startActivity(new Intent("com.histology.dictionary.START"));

                MainActivity.this.finish();

//Dibawah ini adalah skrip untuk menjalankan Activity yang lain setelah Activity SplashActivity

//startActivity(new Intent(SplashScreenAct.this.getApplicationContext(), AndroidDashboardDesignActivity.class));
                startActivity(new Intent(MainActivity.this.getApplicationContext(), Awal.class));
            }

        };

        timer.start();
}
    }