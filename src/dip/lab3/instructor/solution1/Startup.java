package dip.lab3.instructor.solution1;

/**
 *
 * @author Instlogin
 */
public class Startup {
    public static void main(String[] args) {
        // Try switching input and output strategies to see how flexible
        // this is...
        
        MessageInputStrategy input = new KeyboardInputMessageStrategy();
        MessageOutputStrategy output = new ConsoleMessageOutputStrategy();
//        MessageOutputStrategy output = new JOptionPaneMessageOutputStrategy();
        
        // If you want to hear the audio output you need a computer that has
        // speakers and an audio card.
//        MessageInputStrategy input = new HelloAdvancedJavaAudioMessageInputStrategy();
//        MessageOutputStrategy output = new HelloAdvJavaAudioMessageOutputStrategy();
    
        MessageService service = new MessageService(input, output);
        service.produceMessage();
        
        
    }
    
    
}
