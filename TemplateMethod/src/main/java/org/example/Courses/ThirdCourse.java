package org.example.Courses;

import org.example.Preparation;

public class ThirdCourse extends Preparation {
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
        System.out.print(" Please open practice.");
    }

    @Override
    protected void workOnTheory() {
        System.out.print(" Please open theory.");
    }
}
