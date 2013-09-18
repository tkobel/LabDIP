package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author Tracy Kobel
 */
public class ConsoleMessageOutput implements MessageOutput {
    @Override
    public void sendMessage(MessageInput msgInput) {
        System.out.println(msgInput.getMessageInput().getMessageAsString());
    }
}
