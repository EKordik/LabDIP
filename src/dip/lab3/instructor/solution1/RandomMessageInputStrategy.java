package dip.lab3.instructor.solution1;

import java.util.Random;

/**
 *
 * @author Instlogin
 */
public class RandomMessageInputStrategy implements MessageInputStrategy {
    private Message[] randomMessages = {
        new Message("Hello World"),
        new Message("Hello Java"),
        new Message("I love Advanced Java"),
        new Message("Design Patterns are Cool"),
        new Message("Work harder, work smarter")
    };

    @Override
    public Message getMessage() {
        Random r = new Random(System.nanoTime());
        int index = r.nextInt(randomMessages.length);
        return randomMessages[index];
    }
    
    
}
