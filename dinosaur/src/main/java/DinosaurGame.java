/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jason
 */
public class DinosaurGame {

    public static void main(String[] args) {
        Runnable runnable = new DinosaurFrame();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
