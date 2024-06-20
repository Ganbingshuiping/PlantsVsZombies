import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

public class MusicPlayer {
    public static final int LOOP_PLAY = -1;
    public static final int NO_PLAY = 0;
    public static final int ONCE_PLAY = 1;
    private Clip clip;
    public MusicPlayer(String filePath){
        // 导入音乐
        File file = new File(filePath);
        // 系统是否支持
        AudioInputStream audio;

        // 系统获取音频输入流
        try {
            audio = AudioSystem.getAudioInputStream(file);  // 从文件获取音频输入流
            clip = AudioSystem.getClip();  // 获取音频的剪辑
            clip.open(audio);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    /* type
    *   -1 循环播放
    *   0 不播放
    *   1 播放一次
    * */
    public void loop(int type){
        clip.loop(type);
    }
}
