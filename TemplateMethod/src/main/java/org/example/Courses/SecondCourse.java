package org.example.Courses;

import org.example.Preparation;

public class SecondCourse extends Preparation {
    @Override
    protected void collectPractice() {
        System.out.print(" Ask your collegues about practice notes.");
    }

    @Override
    protected void collectTheory() {
        System.out.print("Open GoogleDisk with theory.");
    }

    @Override
    protected void workOnPractice() {
        System.out.print(" Revise practice.");
    }

    @Override
    protected void workOnTheory() {
        System.out.print(" Try to learn theory.");
    }
}
