/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package observerdesignpattern;

/**
 *
 * @author alongkornvanzoh
 */
public interface Source {
    public void notifyObservers();

    public void register(Observer observer);
}
