package com.example.upam.hilos;

import android.util.Log;

/**
 * Created by upam on 04/02/16.
 */
public class Liebre_Runnable implements Runnable {
    @Override
    public void run() {
        int i=0;
        String tag="msn";

        Log.d(tag, "inicia hilo Libre");
        while(i<5)
        {
            try {
                Thread.sleep(2000);
                Log.d(tag,"Liebre....");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
        Log.d(tag,"Fin de Hilo Liebre");

    }
}
