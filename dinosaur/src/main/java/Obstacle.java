
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jason
 */
public class Obstacle {

    int x = 835;
    int y = 215;
    Image image;

    public void move() {
        this.x -= 5;
    }

    public void paintO(Graphics g) {
        try {
            image = ImageIO.read(new File("tree.png"));
        } catch (Exception ex) {
            System.out.println("No example.jpg!!");
        }
        g.drawImage(image, x, y, 50, 50, null);
    }
}
