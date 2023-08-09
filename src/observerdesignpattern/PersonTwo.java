/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerdesignpattern;

/**
 *
 * @author alongkornvanzoh
 */
public class PersonTwo implements Observer {
    @Override
    public void update(Source o) {
        System.out.println("live result: " + ((FootballReporter) o).getData());
    }
}
