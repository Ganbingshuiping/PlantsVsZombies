import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class GamePanel extends JPanel {
    // 在画布中绘制游戏背景
    public void paint(Graphics g){
        // 读取图片流
        try {
            BufferedImage image = ImageIO.read(new File("resource/image/game_background.jpg"));  // 读取图片至缓冲区
            g.drawImage(image,0,0,this);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
