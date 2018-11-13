package com.lianjia.shenyanchao;

/**
 * @author shenyanchao
 * @since 2017-05-17 17:17
 */
public class Point {

    public int x;
    private int y;

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

}
