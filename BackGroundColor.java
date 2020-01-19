package ru.gb.jtwo.lone.online.circles;

import java.awt.*;
public class BackGroundColor {
    private Color color = new Color (//задаем определение цвета случайным образом
            (int)(Math.random() * 255),
            (int)(Math.random() * 255),
            (int)(Math.random() * 255)
    );

    public Color getColor() {
           return color;
    }


}
