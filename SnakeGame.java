package GAMES;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class SnakeGame extends JPanel implements ActionListener {

    // константы для размера поля и размера ячейки
    private static final int WIDTH = 600;
    private static final int HEIGHT = 600;
    private static final int CELL_SIZE = 20;

    // задаём количество ячеек на поле
    private static final int ROWS = HEIGHT / CELL_SIZE;
    private static final int COLS = WIDTH / CELL_SIZE;

    // переменные для игры
    private boolean inGame = true; // флаг статуса игры (в игре/закончена)
    private Timer timer; // таймер для обновления экрана
    private int delay = 150; // скорость игры (задержка таймера)

    // переменные для змейки
    private int[] x = new int[ROWS * COLS]; // координаты змейки по оси X
    private int[] y = new int[ROWS * COLS]; // координаты змейки по оси Y
    private int length = 1; // начальная длина змейки
    private int direction = KeyEvent.VK_RIGHT; // направление движения змейки
    private boolean isMoving = false; // флаг движения змейки

    // переменные для еды
    private int foodX;
    private int foodY;

    // переменные для счетчика яблок и ускорения игры
    private int applesEaten = 0; // количество съеденных яблок
    private int currentApplesEaten = 0; // текущее количество съеденных яблок

    // конструктор класса
    public SnakeGame() {
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setFocusable(true);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();

                // управление змейкой с помощью стрелок клавиатуры
                if ((key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT ||
                        key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN) && !isMoving) {
                    direction = key;
                    isMoving = true;
                }
            }
        });

        startGame();
    }

    // метод для начала игры
    private void startGame() {
        // инициализация змейки в центре поля
        x[0] = WIDTH / 2;
        y[0] = HEIGHT / 2;

        // размещение случайной еды на поле
        placeFood();

        // создание таймера для обновления экрана
        timer = new Timer(delay, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // если игра закончена, останавливаем таймер
        if (!inGame) {
            timer.stop();
            return;
        }

        // перемещение змейки
        move();

        // проверка столкновения со стеной или самой собой
        checkCollision();

        // проверка на еду
        checkFood();

        // перерисовка экрана
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // отрисовка змейки
        for (int i = 0; i < length; i++) {
            g.setColor(Color.GREEN);
            g.fillRect(x[i], y[i], CELL_SIZE, CELL_SIZE);
        }

        // отрисовка еды
        g.setColor(Color.RED);
        g.fillOval(foodX, foodY, CELL_SIZE, CELL_SIZE);

        // отрисовка сетки поля
        g.setColor(Color.WHITE);
        for (int i = 0; i <= WIDTH; i += CELL_SIZE) {
            g.drawLine(i, 0, i, HEIGHT);
        }

        for (int i = 0; i <= HEIGHT; i += CELL_SIZE) {
            g.drawLine(0, i, WIDTH, i);

        }

        // вывод сообщения о статусе игры и счетчика яблок
        if (!inGame) {
            g.setColor(Color.WHITE);
            g.setFont(new Font("Arial", Font.BOLD, 40));
            String gameOverMsg = "Game Over";
            g.drawString(gameOverMsg, WIDTH / 2 - g.getFontMetrics().stringWidth(gameOverMsg) / 2, HEIGHT / 2 - 20);

            String applesEatenMsg = "Apples eaten: " + applesEaten;
            g.drawString(applesEatenMsg, WIDTH / 2 - g.getFontMetrics().stringWidth(applesEatenMsg) / 2, HEIGHT / 2 + 20);
        } else {
            // отображение счетчика яблок в верхнем левом углу поля
            g.setColor(Color.WHITE);
            g.setFont(new Font("Arial", Font.PLAIN, 18));
            String applesEatenMsg = "Apples eaten: " + applesEaten;
            g.drawString(applesEatenMsg, 10, 20);
        }
    }

    // метод для перемещения змейки
    private void move() {
        // сдвигаем тело змейки
        for (int i = length; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }

        // движение головы в зависимости от направления
        switch (direction) {
            case KeyEvent.VK_LEFT:
                x[0] -= CELL_SIZE;
                break;
            case KeyEvent.VK_RIGHT:
                x[0] += CELL_SIZE;
                break;
            case KeyEvent.VK_UP:
                y[0] -= CELL_SIZE;
                break;
            case KeyEvent.VK_DOWN:
                y[0] += CELL_SIZE;
                break;
        }

        // устанавливаем флаг движения в false
        isMoving = false;

        // ускорение змейки при поедании 10 яблок
        currentApplesEaten++;
        if (currentApplesEaten == 10) {
            delay -= 0.01;
            timer.setDelay(delay);
            currentApplesEaten = 0;
        }
    }

    // метод для проверки столкновения со стеной или самой собой
    private void checkCollision() {
        // столкновение со стеной
        if (x[0] < 0 || x[0] >= WIDTH || y[0] < 0 || y[0] >= HEIGHT) {
            inGame = false;
            return;
        }

        // столкновение с самой собой
        for (int i = 1; i < length; i++) {
            if (x[0] == x[i] && y[0] == y[i]) {
                inGame = false;
                return;
            }
        }
    }

    // метод для проверки на еду
    private void checkFood() {
        if (x[0] == foodX && y[0] == foodY) {
            // увеличение длины змейки
            length++;

            // увеличение счетчика яблок
            applesEaten++;

            // размещение новой еды
            placeFood();
        }
    }

    // метод для размещения случайной еды на поле
    private void placeFood() {
        Random random = new Random();
        foodX = random.nextInt(COLS) * CELL_SIZE;
        foodY = random.nextInt(ROWS) * CELL_SIZE;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocationRelativeTo(null);

        // добавляем панель с игрой на форму
        SnakeGame game = new SnakeGame();
        frame.add(game);

        // выводим форму на экран
        frame.setVisible(true);
    }
}