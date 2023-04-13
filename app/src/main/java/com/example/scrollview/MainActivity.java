package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // meter sitio donde va el icono
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
    }
    //crear metodo para que nos de el mensaje, utilizar bucle switch, utilizar nombre "view" del metodo View
    public void Seleccion(View view){
        switch (view.getId()){
            case R.id.fresas:
                Toast.makeText(this, "Estas son fresas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.cerezas:
                Toast.makeText(this, "Estas son cerezas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.frambuesas:
                Toast.makeText(this, "Estas son frambuesas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.kiwi:
                Toast.makeText(this, "Estas son kiwis", Toast.LENGTH_SHORT).show();
                break;
            case R.id.manzana:
                Toast.makeText(this, "Estas son manzanas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mango:
                Toast.makeText(this, "Estas son mangos", Toast.LENGTH_SHORT).show();
                break;
            case R.id.melon:
                Toast.makeText(this, "Estas son melon", Toast.LENGTH_SHORT).show();
                break;
            case R.id.naranja:
                Toast.makeText(this, "Estas son naranjas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.pera:
                Toast.makeText(this, "Estas son peras", Toast.LENGTH_SHORT).show();
                break;
            case R.id.pina:
                Toast.makeText(this, "Estas son piñas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.platano:
                Toast.makeText(this, "Estas son platanos", Toast.LENGTH_SHORT).show();
                break;
            case R.id.sandia:
                Toast.makeText(this, "Estas son sandias", Toast.LENGTH_SHORT).show();
                break;
            case R.id.uvas:
                Toast.makeText(this, "Estas son uvas", Toast.LENGTH_SHORT).show();
                break;
            case R.id.zarzamora:
                Toast.makeText(this, "Estas son zarzamoras", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}