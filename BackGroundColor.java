package ru.gb.jtwo.lone.online.circles;

import java.awt.*;
public class BackGroundColor extends Sprite {
    Color color = new Color (//задаем определение цвета случайным образом
            (int)(Math.random() * 255),
            (int)(Math.random() * 255),
            (int)(Math.random() * 255)
    );//задаем определение цвета случайным образом);
    BackGroundColor(){
        halfHeight = 600;//высота
        halfWidth = 800;//ширина
    }


    @Override
    void render(GameCanvas canvas, Graphics g) {//метод отрисовки
        g.setColor(color);
        g.fillRect(0,0, (int) getWidth(), (int) getHeight());
    }



}
