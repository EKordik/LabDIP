package dip.lab3.instructor.solution1;

import java.util.Scanner;

/**
 *
 * @author Instlogin
 */
public class KeyboardInputMessageStrategy implements MessageInputStrategy {

    @Override
    public Message getMessage() {
        Scanner input = new Scanner(System.in);
        String rawMsg = input.nextLine();
        Message msg = new Message(rawMsg);
        return msg;
    }
    
}
