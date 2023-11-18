package week_11.assignments;

import week_09.assignments.Question_09_09.RegularPolygon;
import week_11.assignments.question_11_01.GeometricObject;
import week_11.assignments.question_11_01.Triangle;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Question_11_06 {
    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<>();

        RegularPolygon obj1 = new RegularPolygon(3, 4);
        list.add(obj1.getPerimeter());

        Date obj2 = new Date();
        list.add(obj2);

        String obj3 = new String("Inar Academy");
        list.add(obj3);

        System.out.println(list);

    }
}
