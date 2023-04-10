package org.example.seminar6.model;

public class Farenheit implements Converter{
    @Override
    public Double convert(Double inputvalue) {
        return inputvalue * 9/5 + 32;
    }
}
