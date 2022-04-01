package com.example.semana9_agenda_grupo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    DB db; public Cursor c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void registrar_amigos(View v){
        Intent iagregar = new Intent(MainActivity.this, Agregar_amigos.class);
        startActivity(iagregar);
    }

}