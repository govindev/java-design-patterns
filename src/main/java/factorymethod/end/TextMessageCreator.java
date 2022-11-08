package factorymethod.end;

import factorymethod.end.message.Message;
import factorymethod.end.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}



}
