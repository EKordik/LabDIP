package dip.lab3.instructor.solution1;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;

/**
 *
 * @author Instlogin
 */
public class HelloAdvJavaAudioMessageOutputStrategy implements MessageOutputStrategy {
    private final int EXTERNAL_BUFFER_SIZE = 524288; // 128Kb 
    
    @Override
    public void sendMessage(final MessageInputStrategy msgInput) {
        new Thread(new Runnable() { 
              public void run() {
                    Message msg = null;
                    AudioInputStream inputStream = null;
                    SourceDataLine auline = null;
                    
                    try {
                        msg = msgInput.getMessage();
                        inputStream = msg.getSoundStream();
                        AudioFormat format = inputStream.getFormat();
                        DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
                        auline = (SourceDataLine) AudioSystem.getLine(info);
                        auline.open(format);
                        auline.start();
                        int nBytesRead = 0;
                        byte[] abData = new byte[EXTERNAL_BUFFER_SIZE];
                        while (nBytesRead != -1) { 
                            nBytesRead = inputStream.read(abData, 0, abData.length);
                            if (nBytesRead >= 0) 
                                auline.write(abData, 0, nBytesRead);
                        } 
                        
                    } catch (Exception ex) {
                        Logger.getLogger(HelloAdvJavaAudioMessageOutputStrategy.class.getName()).log(Level.SEVERE, null, ex);
                    } finally { 
                        auline.drain();
                        auline.close();
                    } 
                }
              }).start();

    }
    
}
