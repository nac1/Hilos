package com.example.upam.hilos;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Hilos_Tortuga_Liebre extends AppCompatActivity {//clase abstracta

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hilos__tortuga__liebre);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Tortuga_Thread Donatelo=new Tortuga_Thread();
        Donatelo.start();

        Thread Conejo=new Thread(new Liebre_Runnable());
        Conejo.start();


    }




    public void mensaje_t(View v){

        alumno a1=new alumno();
        a1.mensaje("Hola alumno =)");
    }


    public class alumno{ //clase interna

        public void mensaje(String message)
        {
            Toast.makeText(Hilos_Tortuga_Liebre.this,message,Toast.LENGTH_SHORT).show();
        }

    }

}




