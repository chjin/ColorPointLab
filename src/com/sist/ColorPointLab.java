package com.sist;

/**
 * Created by sist on 2016-02-17.
 */
public class ColorPointLab {
    public static void main(String[] args){
        //Point 객체 생성
        Point point=new Point();
        point.set(1,2);
        point.showPoint();
        System.out.println();

        //ColorPoint 객체 생성
        ColorPoint colorPoint=new ColorPoint();
        colorPoint.set(3,4);
        colorPoint.setColor("blue");
        colorPoint.showColorPoint();
    }

}
