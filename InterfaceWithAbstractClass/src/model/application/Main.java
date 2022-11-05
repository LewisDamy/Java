package model.application;

import model.enums.Color;
import model.entities.Circle;
import  model.entities.Rectangle;
import model.entities.AbstractShape;

public class Main {
    public static void main(String[] args) {
        AbstractShape s1 = new Circle(Color.BLACK, 2.0);
        AbstractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);

        System.out.println("model.entities.Circle color: " + s1.getColor());
        System.out.println("model.entities.Circle area: " + s1.area());
        System.out.println("model.entities.Rectangle color: " + s2.getColor());
        System.out.println("model.entities.Rectangle area: " + s2.area());
    }
}