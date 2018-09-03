/**
 * 
 */
package com.jpmorgan.salesandmessages.Interface;

import java.util.Queue;

/**
 * @author N P Saradhhi
 *
 */
public interface IMessageConsumer {

	void consumeMessage(Queue<String> messageQ);

}
