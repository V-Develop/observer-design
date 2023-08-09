/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerdesignpattern;

import java.util.ArrayList;

/**
 *
 * @author alongkornvanzoh
 */
public class FootballReporter implements Source {
    private final ArrayList<Observer> observerList;
    private String data;

    public FootballReporter() {
        this.observerList = new ArrayList<>();
    }

    public void setData(String newData) {
        this.data = newData;
        notifyObservers();
    }

    public String getData() {
        return this.data;
    }

    @Override
    public void register(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < this.observerList.size(); i++) {
            observerList.get(i).update(this);
        }
    }
}
