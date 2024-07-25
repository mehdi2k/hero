package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HeroMovement {
    public static void main(String[] args) {
        try {
            // Load the map
            char[][] map = MapLoader.loadMap("C:\\Users\\hp\\Desktop\\carte.txt");

            // Perform the movements
            performMovements("C:\\Users\\hp\\Desktop\\movement.txt", map);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void performMovements(String fileName, char[][] map) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String initialCoordinates = br.readLine();
        String movements = br.readLine();
        br.close();

        String[] coords = initialCoordinates.split(",");
        int x = Integer.parseInt(coords[0]);
        int y = Integer.parseInt(coords[1]);

        Hero hero = new Hero(x, y, map);

        for (char move : movements.toCharArray()) {
            hero.move(move);
        }

        System.out.println("Final Position: (" + hero.getX() + "," + hero.getY() + ")");
    }
}
