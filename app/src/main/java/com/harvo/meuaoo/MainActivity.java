package com.harvo.meuaoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onAlterarTexto(View view){

        TextView texto = findViewById(R.id.textoExibicao);
        texto.setText("Karol indiukov");
    }
    public void onSortearNumero(View view){
        TextView texto = findViewById(R.id.textoResultado);
        int x = new Random().nextInt(11);

        texto.setText("Número: "+x);
    }

}