
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
public class Dinosaur {

    Image image;
    int x;
    int y;
    int jump = 0;
    int jumpType = 0;

    public Dinosaur() {
    }

    public void paintD(Graphics g) {
        try {
            image = ImageIO.read(new File("image.png"));
        } catch (Exception ex) {
            System.out.println("No example.jpg!!");
        }
        g.drawImage(image, x, y-35, 50, 50, null);
        

    }

    public Dinosaur(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void jumping() {
        if (jump == 1) {
            if (jumpType == 0) {
                y -= 5;
                if (y <= 150) {
                    jumpType = 1;
                    return;
                }
            }
            if (jumpType == 1) {
                y += 5;
                if (y >= 250) {
                    jumpType = 0;
                    jump = 0;
                    return;
                }
            }
        }
    }
}
