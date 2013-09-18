package dip.lab3.student.solution1;

/**
 *
 * @author Tracy Kobel
 */
public class Startup {
    public static void main(String[] args) {
        MessageInput input = new GUIMessageInput();
        MessageOutput output = new GUIMessageOutput();
        
        MessageService msgService = new MessageService(input,output);
        msgService.produceMessage();
    }
}
