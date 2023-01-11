package org.example;

import org.example.Courses.FirstCourse;
import org.example.Courses.FourthCourse;
import org.example.Courses.SecondCourse;
import org.example.Courses.ThirdCourse;

public class Main {
    public static void main(String[] args) {
        String course = "FourthCourse";
        Preparation preparation = null;

        switch(course) {
            case "FirstCourse":
                System.out.println("--- FirstCourse ---");
                preparation = new FirstCourse();
                preparation.startToPrepare();
                break;
            case "SecondCourse":
                System.out.println("--- SecondCourse ---");
                preparation = new SecondCourse();
                preparation.startToPrepare();
                break;
            case "ThirdCourse":
                System.out.println("--- ThirdCourse ---");
                preparation = new ThirdCourse();
                preparation.startToPrepare();
                break;
            case "FourthCourse":
                System.out.println("--- FourthCourse ---");
                preparation = new FourthCourse();
                preparation.startToPrepare();
                break;
            default:
                System.out.println("Something wrong!");
        }
    }
}