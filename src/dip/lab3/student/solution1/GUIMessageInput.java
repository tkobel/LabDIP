package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author Tracy Kobel
 */
public class GUIMessageInput implements MessageInput {
    
    @Override
    public Message getMessageInput() {
        String inputMsg = JOptionPane.showInputDialog("Enter a message:");
        Message msg = new Message(inputMsg);
        return msg;
    }
    
}
