package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author Tracy Kobel
 */
public class GUIMessageOutput implements MessageOutput {
    
    @Override
    public void sendMessage(MessageInput msgInput) {
        JOptionPane.showMessageDialog(null, msgInput.getMessageInput().getMessageAsString());
    }
}
