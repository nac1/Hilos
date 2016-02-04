package com.example.upam.hilos;

import android.util.Log;

/**
 * Created by upam on 04/02/16.
 */
public class Tortuga_Thread extends Thread {

    public void run()
    {
        int i=0;
        String tag="msn";

        Log.d(tag,"inicia hilo Tortuga");
        while(i<5)
        {
            try {
                Thread.sleep(5000);
                Log.d(tag,"Tortuga....");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
        Log.d(tag,"Fin de Hilo Tortuga");

    }


}
