package org.example.HomeWork6.hw1.modul;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Notebook {
    private String Название;
    private Integer ОЗУ;
    private Integer ОбъемЖД;
    private String ОперационнаяСистема;
    private String Цвет;

}
