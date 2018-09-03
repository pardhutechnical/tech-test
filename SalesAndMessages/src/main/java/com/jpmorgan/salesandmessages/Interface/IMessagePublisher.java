/**
 * 
 */
package com.jpmorgan.salesandmessages.Interface;

import java.util.Queue;

/**
 * @author N P Saradhhi
 *
 */
public interface IMessagePublisher {

	Queue<String> publishMessage(String inputFile);

}
