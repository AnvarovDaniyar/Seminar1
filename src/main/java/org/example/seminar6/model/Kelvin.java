package org.example.seminar6.model;

public class Kelvin implements Converter{
    @Override
    public Double convert(Double inputvalue) {
        return inputvalue + 273.15;
    }
}
