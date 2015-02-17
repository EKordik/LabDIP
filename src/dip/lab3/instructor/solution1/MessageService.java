package dip.lab3.instructor.solution1;

/**
 *
 * @author Instlogin
 */
public class MessageService {
    private MessageInputStrategy input;
    private MessageOutputStrategy output;
    
    public MessageService(MessageInputStrategy input, MessageOutputStrategy output) {
        this.input = input;
        this.output = output;
    }
    
    public void produceMessage() {
        output.sendMessage(input);
    }
}
