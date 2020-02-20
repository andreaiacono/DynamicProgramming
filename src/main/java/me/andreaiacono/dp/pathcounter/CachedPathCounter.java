package me.andreaiacono.dp.pathcounter;

import java.time.Instant;

public class CachedPathCounter {

    public static void main(String[] args) {
        int width = 20;
        int height = 20;
        int[][] results = new int[width + 1][height + 1];
        System.out.println("Started computing cached PathCounter at " + Instant.now());
        System.out.println("robot[" + width + ", " + height + "] = " + pathCounter(0, 0, width, height, results));
        System.out.println("Finished computing cached PathCounter at " + Instant.now());
    }

    static int pathCounter(int x, int y, int width, int height, int[][] results) {
        if (x >= width || y >= height) {
            return 0;
        }
        if (x == width - 1 && y == height - 1) {
            return 1;
        }
        if (results[x][y] != 0) {
            return results[x][y];
        }
        int result = pathCounter(x + 1, y, width, height, results) + pathCounter(x, y + 1, width, height, results);
        results[x][y] = result;
        return result;
    }
}
