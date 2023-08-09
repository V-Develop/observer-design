/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observerdesignpattern;

import java.util.Scanner;

/**
 *
 * @author alongkornvanzoh
 */
public class ObserverDesignPattern {
    static Scanner scanner = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonOne personOne = new PersonOne();
        PersonTwo personTwo = new PersonTwo();
        FootballReporter footballReporter = new FootballReporter();
        footballReporter.register(personOne);
        footballReporter.register(personTwo);

        String line;
        Boolean isLoop = true;

        while (isLoop) {
            System.out.print("Enter Score ");
            if ((line = scanner.nextLine()).isEmpty()) {
                break;
            } else {
                footballReporter.setData(line);
            }
        }
    }
    
}
