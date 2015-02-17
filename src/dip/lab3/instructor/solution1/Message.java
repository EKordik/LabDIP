package dip.lab3.instructor.solution1;

import javax.sound.sampled.AudioInputStream;

/**
 *
 * @author Instlogin
 */
public class Message {
    private String messageAsString;
    private AudioInputStream soundStream;
    
    public Message(String strMsg) {
        messageAsString = strMsg;
    }
    
    /**
     * This constructor requires both a String version of the message plus
     * an audio stream. This way if the audio stream can't be used, the
     * String still can, such as when someone mistakenly sends the message
     * to the console.
     * 
     * @param strMsg - String version of message
     * @param soundStream - AudioInputStream version of message
     */
    public Message(String strMsg, AudioInputStream soundStream) {
        this.soundStream = soundStream;
        this.messageAsString = strMsg;
    }

    public String getMessageAsString() {
        return messageAsString;
    }

    public void setMessageAsString(String message) {
        this.messageAsString = message;
    }

    public AudioInputStream getSoundStream() {
        return soundStream;
    }

    public void setSoundStream(AudioInputStream soundStream) {
        this.soundStream = soundStream;
    }

    
    
}
