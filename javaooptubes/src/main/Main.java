/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import auth.SignUp;
import splash.Splash;

/**
 *
 * @author benon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Splash mySplash = new Splash();
        mySplash.setVisible(true);

        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                mySplash.getProgressBar().setValue(i);
                mySplash.getPercentage().setText(i + "%");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new SignUp().setVisible(true);
        mySplash.dispose();
    } 
}
