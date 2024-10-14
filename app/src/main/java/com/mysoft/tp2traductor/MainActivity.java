package com.mysoft.tp2traductor;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.mysoft.tp2traductor.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btTraducir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String palabraEspañol = binding.etPalabra.getText().toString();
                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
                intent.putExtra("palabraEspañol", palabraEspañol);
                startActivity(intent);
            }
        });
    }
}