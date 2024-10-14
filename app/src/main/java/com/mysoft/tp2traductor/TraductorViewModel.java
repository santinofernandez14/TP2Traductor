package com.mysoft.tp2traductor;



import androidx.lifecycle.ViewModel;

public class TraductorViewModel extends ViewModel {

    public String traducirPalabra(String palabraEspañol) {
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

    public int seleccionarImagen(String palabraEspañol) {
        switch (palabraEspañol.toLowerCase()) {
            case "gato":
                return R.drawable.gatito;
            case "conejo":
                return R.drawable.conejito;
            case "perro":
                return R.drawable.dog;
            case "House":
                return R.drawable.casa;
            case "Apple":
                return R.drawable.manzana;
            default:
                return R.drawable.nada1;
        }
    }
}
