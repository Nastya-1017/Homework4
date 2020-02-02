package fmi.informatics.events;

import java.util.ArrayList;
import java.util.List;

public class GreetPeople implements Observable {
    private List<Observer> people = new ArrayList<>();
    private boolean greeted;

    @Override
    public void addObserver(Observer o) {
        people.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        people.remove(o);
    }

    private void greetPeople() {
        System.out.println("Hello people!");
        notifyObserver();
    }

    @Override
    public void notifyObserver() {
        for(Observer person : people) {
            person.update();
        }
    }
}
