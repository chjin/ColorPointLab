package com.sist;

/**
 * Created by sist on 2016-02-17.
 */
public class Point {
    //한점
    private int x,y;
    void set(int x, int y){
        this.x=x;
        this.y=y;
    }
    //점 좌표 출력
    void showPoint(){
        System.out.println("(" +x+ "," +y+ ")");
    }
}
