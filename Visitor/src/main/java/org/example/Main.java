package org.example;

public class Main {
    public static void main(String[] args) {
        Project project = new Project();

        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();

        System.out.println("Junior: ");
        project.beWritten(junior);

        System.out.println("\nSenior: ");
        project.beWritten(senior);
    }
}