package com.pl.inkontor.logic;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class ConverterJson {

    private String sku = "\"sku\":";
    private String productName = "\"productName\":";
    private String ean = "\"ean\": null";
    private String numberOfPackages = "\"numberOfPackages\":";
    private String totalSizeAssembledInCm = "\"totalSizeAssembledInCm\":";
    private String boxes = "\"boxes\":";

    private String grossWidthCm = "\"grossWidthCm\":";
    private String grossDepthCm = "\"grossDepthCm\":";
    private String grossHeightCm = "\"grossHeightCm\":";
    private String nettoWeightKg = "\"nettoWeightKg\":";
    private String tareWeightKg = "\"tareWeightKg\":";
    private String totalSizesBoxCm = "\"totalSizesBoxCm\":";
    private String volumeM3 = "\"volumeM3\":";
    private String grossWeightKg = "\"grossWeightKg\":";

    private StringBuilder stringBuilder = new StringBuilder();
    private StringBuilder stringBuilder2 = new StringBuilder();

    public void begin(String pathIn, String pathOut) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(pathIn));
        BufferedWriter bw = new BufferedWriter(new FileWriter(pathOut));
        List<String> elements;
        String str;

        while ((str = br.readLine()) != null) {
            String s = str.replaceAll("\"", "");
            elements = Arrays.asList(s.split(","));

            processData(elements);
        }
        bw.append(stringBuilder.toString());
        bw.close();
    }

    int i = 11;

    public void processData(List<String> elements) throws IOException {
        if (!elements.get(i).equals("-")) {
            stringBuilder.append("{\n");

            stringBuilder.append(sku);
            stringBuilder.append("\"")
                    .append(elements.get(0))
                    .append("\",\n");
            stringBuilder.append(productName)
                    .append("\"")
                    .append(elements.get(1))
                    .append("\",\n");
            stringBuilder.append(ean)
                    .append(",\n");
            stringBuilder.append(numberOfPackages)
                    .append(elements.get(10))
                    .append(",\n");
            stringBuilder.append(totalSizeAssembledInCm)
                    .append("\"")
                    .append(elements.get(16))
                    .append("\",\n");
            if (!elements.get(i).equals("-")) {
                stringBuilder.append(boxes).append("[\n");
                stringBuilder.append(getBoxes(elements.get(i), elements.get(i + 1), elements.get(i + 2), elements.get(i + 3), elements.get(i + 4)));
            }
            stringBuilder.append("},\n");
        }

    }

    public String getBoxes(String id1, String id2, String id3, String id4, String id5) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("danePaczek.txt"));
        List<String> elements;
        String str;
        stringBuilder2 = new StringBuilder();
        while ((str = br.readLine()) != null) {
            elements = Arrays.asList(str.split(","));

            if (elements.get(0).equals(id1)) {
                stringBuilder2.append("{\n")
                        .append(sku).append("\"").append(elements.get(0)).append("\",\n")
                        .append(productName).append("\"").append(elements.get(1)).append("\",\n")
                        .append(ean).append(",\n")
                        .append(grossWidthCm).append(elements.get(2)).append(",\n")
                        .append(grossDepthCm).append(elements.get(3)).append(",\n")
                        .append(grossHeightCm).append(elements.get(4)).append(",\n")
                        .append(nettoWeightKg).append(elements.get(5)).append(",\n")
                        .append(tareWeightKg).append(elements.get(6)).append(",\n")
                        .append(totalSizesBoxCm).append("\"").append(elements.get(7)).append("\"").append(",\n")
                        .append(volumeM3).append(elements.get(8)).append(",\n")
                        .append(grossWeightKg).append(elements.get(9)).append("\n}");
            }
            if (elements.get(0).equals(id2)) {
                stringBuilder2.append(",\n{\n")
                        .append(sku).append("\"").append(elements.get(0)).append("\",\n")
                        .append(productName).append("\"").append(elements.get(1)).append("\",\n")
                        .append(ean).append(",\n")
                        .append(grossWidthCm).append(elements.get(2)).append(",\n")
                        .append(grossDepthCm).append(elements.get(3)).append(",\n")
                        .append(grossHeightCm).append(elements.get(4)).append(",\n")
                        .append(nettoWeightKg).append(elements.get(5)).append(",\n")
                        .append(tareWeightKg).append(elements.get(6)).append(",\n")
                        .append(totalSizesBoxCm).append("\"").append(elements.get(7)).append("\"").append(",\n")
                        .append(volumeM3).append(elements.get(8)).append(",\n")
                        .append(grossWeightKg).append(elements.get(9)).append("\n}");
            }
            if (elements.get(0).equals(id3)) {
                stringBuilder2.append(",\n{\n")
                        .append(sku).append("\"").append(elements.get(0)).append("\",\n")
                        .append(productName).append("\"").append(elements.get(1)).append("\",\n")
                        .append(ean).append(",\n")
                        .append(grossWidthCm).append(elements.get(2)).append(",\n")
                        .append(grossDepthCm).append(elements.get(3)).append(",\n")
                        .append(grossHeightCm).append(elements.get(4)).append(",\n")
                        .append(nettoWeightKg).append(elements.get(5)).append(",\n")
                        .append(tareWeightKg).append(elements.get(6)).append(",\n")
                        .append(totalSizesBoxCm).append("\"").append(elements.get(7)).append("\"").append(",\n")
                        .append(volumeM3).append(elements.get(8)).append(",\n")
                        .append(grossWeightKg).append(elements.get(9)).append("\n}");
            }
            if (elements.get(0).equals(id4)) {
                stringBuilder2.append(",\n{\n")
                        .append(sku).append("\"").append(elements.get(0)).append("\",\n")
                        .append(productName).append("\"").append(elements.get(1)).append("\",\n")
                        .append(ean).append(",\n")
                        .append(grossWidthCm).append(elements.get(2)).append(",\n")
                        .append(grossDepthCm).append(elements.get(3)).append(",\n")
                        .append(grossHeightCm).append(elements.get(4)).append(",\n")
                        .append(nettoWeightKg).append(elements.get(5)).append(",\n")
                        .append(tareWeightKg).append(elements.get(6)).append(",\n")
                        .append(totalSizesBoxCm).append("\"").append(elements.get(7)).append("\"").append(",\n")
                        .append(volumeM3).append(elements.get(8)).append(",\n")
                        .append(grossWeightKg).append(elements.get(9)).append("\n}");
            }
            if (elements.get(0).equals(id5)) {
                stringBuilder2.append(",\n{\n")
                        .append(sku).append("\"").append(elements.get(0)).append("\",\n")
                        .append(productName).append("\"").append(elements.get(1)).append("\",\n")
                        .append(ean).append(",\n")
                        .append(grossWidthCm).append(elements.get(2)).append(",\n")
                        .append(grossDepthCm).append(elements.get(3)).append(",\n")
                        .append(grossHeightCm).append(elements.get(4)).append(",\n")
                        .append(nettoWeightKg).append(elements.get(5)).append(",\n")
                        .append(tareWeightKg).append(elements.get(6)).append(",\n")
                        .append(totalSizesBoxCm).append("\"").append(elements.get(7)).append("\"").append(",\n")
                        .append(volumeM3).append(elements.get(8)).append(",\n")
                        .append(grossWeightKg).append(elements.get(9)).append("\n}");
            }
        }
        stringBuilder2.append("\n]");
        return stringBuilder2.toString();
    }

    public String template(String country, int x1, int x2, int x3, int x4, int x5, int x6) {

        return "\"CountryEN\": \"country\",\n" +
                "\"CountryPL\": \"" + country + "\",\n" +
                "\"Countrycode\": \"code\",\n" +
                "\"PCZT\": 2,\n" +
                "\"Weight\": [\n{\n" +

                "\"label\": \"5kg\",\n" +
                "\"price\": " + x1 + ",\n" +
                "\"lowerlimit\": 0,\n" +
                "\"upperlimit\": 5\n},{\n" +

                "\"label\": \"10kg\",\n" +
                "\"price\": " + x2 + ",\n" +
                "\"lowerlimit\": 5,\n" +
                "\"upperlimit\": 10\n},{\n" +

                "\"label\": \"15kg\",\n" +
                "\"price\": " + x3 + ",\n" +
                "\"lowerlimit\": 10,\n" +
                "\"upperlimit\": 15\n},{\n" +

                "\"label\": \"25kg\",\n" +
                "\"price\": " + x4 + ",\n" +
                "\"lowerlimit\": 15,\n" +
                "\"upperlimit\": 25\n},{\n" +

                "\"label\": \"30kg\",\n" +
                "\"price\": " + x5 + ",\n" +
                "\"lowerlimit\": 25,\n" +
                "\"upperlimit\": 30\n},{\n" +

                "\"label\": \"40kg\",\n" +
                "\"price\": " + x6 + ",\n" +
                "\"lowerlimit\": 30,\n" +
                "\"upperlimit\": 31.5\n}\n]\n},\n{\n";
    }
}


