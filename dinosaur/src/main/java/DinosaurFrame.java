
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jason
 */
public class DinosaurFrame extends JFrame implements Runnable, KeyListener {

    ArrayList<Obstacle> obsL = new ArrayList();
    Dinosaur dinosaur = new Dinosaur(50, 250);
    DinosaurPanel gamePanel = new DinosaurPanel(obsL, dinosaur);
    static int jump = 0;
    int jumping = 0;
    int newO = 100;

    public DinosaurFrame() {
        this.setBackground(Color.WHITE);
        this.setVisible(true);
        this.add(gamePanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setBounds(0, 0, 900, 300);//540,265
        this.addKeyListener(this);
        this.setFocusable(true);
        this.setTitle("壯祖豪小恐龍");
    }

    @Override
    public void run() {
        for (int i = 0;; i++) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                Logger.getLogger(DinosaurFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("" + dinosaur.x + dinosaur.y);
            if (obsL.size() > 0) {
                System.out.println("" + obsL.get(0).y);
            }
            for (int x = 0; x < obsL.size(); x++) {
                if (Math.abs(obsL.get(x).x - dinosaur.x) <= 25 && Math.abs((obsL.get(x).y + 35) - dinosaur.y) <= 30) {
                    return;
                }
            }
            for (int x = 0; x < obsL.size(); x++) {
                obsL.get(x).move();
            }
            dinosaur.jumping();
            // System.out.println(""+obsL.size());
            repaint();
            if (obsL.size() == 0) {
                obsL.add(new Obstacle());
            }
            if (obsL.get(0).x == 0) {
                obsL.remove(0);
                // obsL.add(new Obstacle());

            }
            newO--;
            if (newO == 0) {
                newO = (int) (Math.random() * 40 + 40);
                if (newO % 3 == 0) {
                    obsL.add(new Bird());
                }
                else
                    obsL.add(new Obstacle());

            }
        }//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            if (dinosaur.jump == 0) {
                dinosaur.jump = 1;
                dinosaur.jumping();
            }
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
