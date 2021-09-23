
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jason
 */
public class DinosaurPanel extends JPanel {
    Image image;
    int x;
    int y;
    ArrayList<Obstacle> obsL;
    Dinosaur dinosaur;

    public DinosaurPanel(ArrayList obsL, Dinosaur dino) {
        //this.setSize(600, 300);
        this.setVisible(true);
        this.dinosaur = dino;
        this.obsL = obsL;
        this.setLayout(null);
    }

    @Override
    public void paint(Graphics g) {
        // System.out.println(""+(obsL.get(0)).x+(obsL.get(0).y));
        if (obsL.size() > 0) {
            for (int i = 0; i < obsL.size(); i++) {
                obsL.get(i).paintO(g);
            }
        }
        g.setColor(Color.BLUE);
        dinosaur.paintD(g);
    }
}
