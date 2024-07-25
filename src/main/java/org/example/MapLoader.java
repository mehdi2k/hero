package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MapLoader {
    public static char[][] loadMap(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line).append("\n");
        }
        br.close();

        String[] lines = sb.toString().split("\n");
        int mapHeight = lines.length;
        int mapWidth = lines[0].length();
        char[][] map = new char[mapHeight][mapWidth];

        for (int i = 0; i < mapHeight; i++) {
            map[i] = lines[i].toCharArray();
        }

        return map;
    }
}
