package com.exam.util;

import com.ex.geometry.circle;
import com.ex.geometry.rectangle;

import java.util.Scanner;



public class calculator {
    public static void main(String[] args) {


        circle cir = new circle(5);
        rectangle rect = new rectangle(5,6);

        double cirArea= Math.PI*Math.pow(cir.radius,2);
        double rectArea = rect.length*rect.breadth;

        System.out.printf("The area of Circle is: %f \n" +
                "The area of rectangle is: %f.",cirArea,rectArea);
    }
}
