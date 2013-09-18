package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author Tracy Kobel
 */
public class ConsoleMessageInput implements MessageInput {
    
    @Override
    public Message getMessageInput() {
        Scanner keyboard = new Scanner(System.in);
        String str = keyboard.nextLine();
        Message msg = new Message(str);
        return msg;       
    }
}
