package org.example.seminar6.cw3;

import org.example.seminar6.model.Celsius;
import org.example.seminar6.model.Farenheit;
import org.example.seminar6.model.Kelvin;

/**
 * Напишите интерфейс Converter для конвертации из градусов по Цельсию в
 * Кельвины, Фаренгейты. У классов наследников необходимо переопределить метод интерфейса,
 * для валидного перевода величин. Метод для конвертации назовите "convertValue".
 */
public class ex3 {
    public static void main(String[] args) {
        Double tCelsius = 0.0;
        Double tFar = new Farenheit().convert(tCelsius);
        Double tKel = new Kelvin().convert(tCelsius);
        System.out.println(tFar);
        System.out.println(tKel);
    }
}
