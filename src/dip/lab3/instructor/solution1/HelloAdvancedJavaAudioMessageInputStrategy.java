package dip.lab3.instructor.solution1;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

/**
 *
 * @author Instlogin
 */
public class HelloAdvancedJavaAudioMessageInputStrategy implements MessageInputStrategy {
    private final String STR_MSG = "Hello Advanced Java";
    @Override
    public Message getMessage() {
        Message msg = null;
        AudioInputStream inputStream = null;
        try {
            inputStream = AudioSystem.getAudioInputStream(
                    Startup.class.getResourceAsStream("HelloAdvJava.wav"));
            msg = new Message(STR_MSG, inputStream);
        } catch (Exception ex) {
            Logger.getLogger(HelloAdvancedJavaAudioMessageInputStrategy.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        return msg;
    }
}
