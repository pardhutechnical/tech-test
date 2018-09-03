/**
 * 
 */
package com.jpmorgan.salesandmessages.impl;

import java.util.Queue;

import com.jpmorgan.salesandmessages.Interface.IMessageConsumer;
import com.jpmorgan.salesandmessages.service.Sale;

/**
 * @author N P Saradhhi
 * 
 */
public class MessageConsumerServiceImpl implements IMessageConsumer {

	public MessageConsumerServiceImpl() {

	}

	/* (non-Javadoc)
	 * @see com.technical.test.MessageProcessing.Interface.MessageConsumer#consumeMessage(java.util.Queue)
	 * While consuming the Queue, calls sale.processNotification(message) to process the sale notice.
	 */
	@Override
	public void consumeMessage(Queue<String> messageQ) {
		Sale sale = new Sale();
		messageQ.forEach(message -> {
			System.out.println("Message Read : " + message.toString());

			if (sale.processNotification(message.toString()))
				sale.log.report();
		});
	}

}
