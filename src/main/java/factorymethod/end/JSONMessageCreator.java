package factorymethod.end;

import factorymethod.end.message.JSONMessage;
import factorymethod.end.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}

	
}
