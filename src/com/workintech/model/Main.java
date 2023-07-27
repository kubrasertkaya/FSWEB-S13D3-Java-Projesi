package com.workintech.model;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person =new Person("John","Doe",20);
        person.pets=new String[2];//2 elemanlı bir array tanımlama
        person.pets[0]="cat";
        person.pets[1]="dog";
        System.out.println(Arrays.toString(person.pets));

        System.out.println("Firstname: " + person.getFirstName());
        System.out.println("LastName: " + person.getLastName());
        System.out.println("Age: " + person.getAge());

        System.out.println(person.salary);

        System.out.println("************************");
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
        System.out.println("************************");
        Wall wall2=new Wall(-5,-4);
        wall2.width=-5;
        System.out.println("wall2 width"+ wall2.width);
        System.out.println("wall2 height" + wall2.height);


        //NullPointerException
        //System.out.println(person.pets.length);
    }
}