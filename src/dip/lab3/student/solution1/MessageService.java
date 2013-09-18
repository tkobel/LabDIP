package dip.lab3.student.solution1;

/**
 *
 * @author Tracy Kobel
 */
public class MessageService {
    private MessageInput input;
    private MessageOutput output;
    
    public MessageService(MessageInput input, MessageOutput output) {
        this.input = input;
        this.output = output;
    }
    
    public void produceMessage() {
        output.sendMessage(input);
    }
}
