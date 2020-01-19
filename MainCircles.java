package ru.gb.jtwo.lone.online.circles;

import javax.swing.*;
import java.awt.*;

public class MainCircles extends JFrame { //объявляем класс MainCircles задаем границы
    private static final int POS_X = 400;
    private static final int POS_Y = 200;
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;

    Sprite[] sprites = new Sprite[10]; // создаем массив объектов класса Sprite, 10 шт




    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainCircles();
            } //Стартуем MainCircles
        });
    }

    private MainCircles() { // создаем метод MainCircles
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //Закрытие окна по крестику
        setBounds(POS_X, POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT); //Определяем границы
        initApplication(); // Запускаем метод initApplication
        GameCanvas canvas = new GameCanvas(this); //создаем новый объект класса GameCanvas
        add(canvas, BorderLayout.CENTER);//Добавляем канву в окно с выравниванием по центру
        setTitle("Circles"); //определчем заголовок
        setVisible(true); // Говорим чтоб было видимо
    }

    private void initApplication() { //Создаем метод initApplication, который заполняем массив объектами класса Ball
        for (int i = 0; i < sprites.length; i++) {
            sprites[i] = new BackGroundColor();
        }
        for (int i = 0; i < sprites.length; i++) {
            sprites[i] = new Ball();
        }


    }



    public void onDrawFrame(GameCanvas canvas, Graphics g, float deltaTime) {//Создаем метод onDrawFrame с параметрами, в которые передаем канву, графику и время
        update(canvas, deltaTime); // obnovlenie // S = v * t вызов метода
        render(canvas, g); // otrisovka вызов метода
    }

    private void update(GameCanvas canvas, float deltaTime) {//создание метода обновления
        for (int i = 0; i < sprites.length; i++) {
            sprites[i].update(canvas, deltaTime);
        }
    }

    private void render(GameCanvas canvas, Graphics g) {//создание метода отрисовка
        for (int i = 0; i < sprites.length; i++) {
            sprites[i].render(canvas, g);
        }
    }

}
