package dip.lab3.instructor.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author Instlogin
 */
public class JOptionPaneMessageOutputStrategy implements MessageOutputStrategy {

    @Override
    public void sendMessage(final MessageInputStrategy msgInput) {
        Message msg = msgInput.getMessage();
        JOptionPane.showMessageDialog(null, msg.getMessageAsString());
    }
    
}
