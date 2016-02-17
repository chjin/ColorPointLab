package com.sist;

/**
 * Created by sist on 2016-02-17.
 */
public class ColorPoint extends Point {
    //점 색
    private String color;
    void setColor(String color){
        this.color=color;
    }
    //컬러와 좌표 출력
    void showColorPoint(){
        System.out.println(color);
        showPoint();
    }
}
