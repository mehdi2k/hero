package org.example;

public class Hero {
    private int x;
    private int y;
    private char[][] map;

    public Hero(int x, int y, char[][] map) {
        this.x = x;
        this.y = y;
        this.map = map;
    }

    public void move(char direction) {
        int newX = x, newY = y;
        switch (direction) {
            case 'N':
                newY--;
                break;
            case 'S':
                newY++;
                break;
            case 'E':
                newX++;
                break;
            case 'O':
                newX--;
                break;
        }

        if (isValidMove(newX, newY)) {
            x = newX;
            y = newY;
        }
    }

    private boolean isValidMove(int x, int y) {
        if (x < 0 || y < 0 || x >= map[0].length || y >= map.length) {
            return false;
        }
        return map[y][x] != '#';
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
