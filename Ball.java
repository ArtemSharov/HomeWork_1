package ru.gb.jtwo.lone.online.circles;

import java.awt.*;

public class Ball extends Sprite { //создаем класс Ball и наследуем его от Sprite
    private final Color color = new Color (//задаем определение цвета случайным образом
            (int)(Math.random() * 255),
            (int)(Math.random() * 255),
            (int)(Math.random() * 255)
    );
    private float vX = (float)(100f + (Math.random() * 200f));//Определяем скорость по координате Х
    private float vY = (float)(100f + (Math.random() * 200f));// Определяем скорость по координате У

    Ball() {//Создаем конструктор Ball и определяем в нем размер
        halfHeight = 20 + (float)(Math.random() * 50f);//высота
        halfWidth = halfHeight;//ширина
    }

    @Override
    void update(GameCanvas canvas, float deltaTime) {//метод update который задает новые координаты объекту и проверяет выход за границы окна
        x += vX * deltaTime;
        y += vY * deltaTime;
        if (getLeft() < canvas.getLeft()) {
            setLeft(canvas.getLeft());
            vX = -vX;
        }
        if (getRight() > canvas.getRight()) {
            setRight(canvas.getRight());
            vX = -vX;
        }
        if (getTop() < canvas.getTop()) {
            setTop(canvas.getTop());
            vY = -vY;
        }
        if (getBottom() > canvas.getBottom()) {
            setBottom(canvas.getBottom());
            vY = -vY;
        }
    }

    @Override
    void render(GameCanvas canvas, Graphics g) {//метод отрисовки
        g.setColor(color);//получаем цвет
        g.fillOval((int) getLeft(), (int) getTop(),//получаем размер и координаты
                (int) getWidth(), (int) getHeight());
    }
}
