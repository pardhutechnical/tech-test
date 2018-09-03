package com.jpmorgan.salesandmessages;

import java.util.LinkedList;
import java.util.Queue;

import com.jpmorgan.salesandmessages.Interface.IMessageConsumer;
import com.jpmorgan.salesandmessages.Interface.IMessagePublisher;
import com.jpmorgan.salesandmessages.impl.MessageConsumerServiceImpl;
import com.jpmorgan.salesandmessages.impl.MessagePublisherServiceImpl;

/**
 * @author N P Saradhhi
 * SaleNotificationProcessor is the begin of the application.
 * Creates Message Queue & Consume/process Message Queue.
 *
 */
public class SaleNotificationProcessor {
	public static void main(String[] args) {
		Queue<String> messageQ = new LinkedList<String>();
		
		IMessagePublisher publisher = new MessagePublisherServiceImpl();
		IMessageConsumer consumer = new MessageConsumerServiceImpl();
		String inputFile = null;

		if (args.length != 0) {
			inputFile = args[0];
		} else {
			System.out.println("*** No input file provided, loading default input file ***");
			inputFile = "src/main/resources/inputMessages.txt";
		}

		messageQ = publisher.publishMessage(inputFile);

		consumer.consumeMessage(messageQ);

	}
}
