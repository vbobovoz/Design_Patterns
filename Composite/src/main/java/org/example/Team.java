package org.example;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Developer> developers = new ArrayList<>();

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void removeDeveloper(Developer developer) {
        developers.remove(developer);
    }

    public void work() {
        System.out.println("Team working...");
        for(Developer developer : developers) {
            developer.code();
        }
    }
}
