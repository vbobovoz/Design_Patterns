package org.example.Courses;

import org.example.Preparation;

public class FirstCourse extends Preparation {
    @Override
    protected void collectPractice() {
        System.out.print(" Open your practice notes.");
    }

    @Override
    protected void collectTheory() {
        System.out.print("Open your lecture notes.");
    }

    @Override
    protected void workOnPractice() {
        System.out.print(" Solve similar problems.");
    }

    @Override
    protected void workOnTheory() {
        System.out.print(" Learn and repeat it often.");
    }
}
