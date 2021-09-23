
import java.awt.Graphics;
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
public class  Bird extends Obstacle {

    public Bird() {
        x=835;
        y=150;
    }
    @Override
    public void paintO(Graphics g)
    {
        try {
            image = ImageIO.read(new File("bird.png"));
        } catch (Exception ex) {
            System.out.println("No example.jpg!!");
        }
        g.drawImage(image, x, y, 50, 50, null);
    }
}
