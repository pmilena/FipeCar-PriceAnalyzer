package com.milena.consultaFipe.service;

public class TransformaPlural {

    public String toPlural(String word) {
        if (word.endsWith("ro") || word.endsWith("to")) {
            word = word + "s";
        } else if (word.endsWith("ão")) {
            word = word.replace("ão", "oes");
        }else if (word.endsWith("ao")) {
            word = word.replace("ao", "oes");
        }
        return word;
    }
}
