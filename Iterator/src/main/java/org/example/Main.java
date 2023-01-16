package org.example;

public class Main {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "PostgreSQL", "Maven"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Ivan Ivanov", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.print("Skills: ");
        while(iterator.hasNext()) {
            System.out.print(iterator.next().toString() + " ");
        }
    }
}