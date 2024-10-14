package com.mysoft.tp2traductor;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import com.mysoft.tp2traductor.databinding.ActivitySegundaBinding;

public class SegundaActivity extends AppCompatActivity {

    private ActivitySegundaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySegundaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        String palabraEspañol = getIntent().getStringExtra("palabraEspañol");


        String palabraIngles = traducirPalabra(palabraEspañol);


        binding.etTraduccion.setText(palabraIngles);


        int imagenId = seleccionarImagen(palabraEspañol);
        binding.ivImagen.setImageResource(imagenId);


        binding.btVolver.setOnClickListener(v -> {
            Intent intent = new Intent(SegundaActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }

    private String traducirPalabra(String palabraEspañol) {
        switch (palabraEspañol.toLowerCase()) {
            case "gato":
                return "Cat";
            case "perro":
                return "Dog";
            case "casa":
                return "House";
            case "conejo":
                return "Rabbit";
            case "manzana":
                return "Apple";
            default:
                return "No disponible";
        }
    }

    private int seleccionarImagen(String palabraEspañol) {
        switch (palabraEspañol.toLowerCase()) {
            case "gato":
                return R.drawable.gatito;
            case "conejo":
                return R.drawable.conejito;
            case "perro":
                return R.drawable.dog;
            case "casa":
                return R.drawable.casa;
            case "manzana":
                return R.drawable.manzana;
            default:
                return R.drawable.nada1;
        }
    }
}
