package me.andreaiacono.dp.pathcounter;

import java.time.Instant;

public class PathCounter {

    public static void main(String[] args) {
        int width = 20;
        int height = 20;
        System.out.println("Started computing recursive PathCounter at " + Instant.now());
        System.out.println("PathCounter[" + width + ", " + height + "] = " + pathCounter(0, 0, width, height));
        System.out.println("Finished computing recursive PathCounter at " + Instant.now());
    }

    static int pathCounter(int x, int y, int width, int height) {
        if (x >= width || y >= height) {
            return 0;
        }
        if (x == width - 1 && y == height - 1) {
            return 1;
        }
        return pathCounter(x + 1, y, width, height) + pathCounter(x, y + 1, width, height);
    }
}
