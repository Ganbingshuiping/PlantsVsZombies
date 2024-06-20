import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameFrame extends JFrame {
    public GameFrame(){
        this.setTitle("植物大战僵尸");  // 窗口名
        this.setLocation(100,50);  // 起始位置
        this.setSize(1280,600);  // 窗口大小
        this.setResizable(false);  // 用户无法修改窗口大小
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 关闭窗口操作

        //背景音乐
        MusicPlayer musicPlayer = new MusicPlayer("resource/sound/植物大战僵尸bgm.wav");
        musicPlayer.loop(MusicPlayer.LOOP_PLAY);

        // 监听窗口
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int dialog = JOptionPane.showConfirmDialog(null, "是否退出","退出",JOptionPane.YES_NO_OPTION);
                if (dialog == JOptionPane.OK_OPTION) {
                    System.exit(0);
                }
            }
        });
        // 在Frame中加入Panel
        GamePanel panel = new GamePanel();
        this.add(panel);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new GameFrame();
    }

}
