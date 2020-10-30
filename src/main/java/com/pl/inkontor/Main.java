package com.pl.inkontor;

import com.pl.inkontor.logic.ConverterJson;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        ConverterJson converterJson = new ConverterJson();
        String pathIn = "dane.txt";
        String pathOut = "dane.json";

        converterJson.begin(pathIn, pathOut);

    }
}
