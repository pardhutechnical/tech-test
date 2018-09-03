package com.jpmorgan.salesandmessages.MessageProcessing.impl;

import java.io.IOException;
import java.util.Queue;
import org.junit.*;

import com.jpmorgan.salesandmessages.Interface.IMessagePublisher;
import com.jpmorgan.salesandmessages.impl.MessageConsumerServiceImpl;
import com.jpmorgan.salesandmessages.impl.MessagePublisherServiceImpl;

import static org.junit.Assert.*;



/**
 * @author N P Saradhhi
 * The class <code>PublisherImplTest</code> contains tests for the class <code>{@link IMessagePublisher}</code>.
 *
 */
public class PublisherImplTest {
	
	@Test
	public void testPublisherSuccessScenerio()
		throws Exception {

		IMessagePublisher result = new MessagePublisherServiceImpl();
		Queue<String> messageQ = result.publishMessage("src/test/resources/testData1.txt");
		assertEquals(10, messageQ.size());
	}

	@Ignore
	@Test (expected=IOException.class)
	public void testPublisherExceptionScenerio()
		throws Exception {
		IMessagePublisher result = new MessagePublisherServiceImpl();
		Queue<String> messageQ = result.publishMessage("src/test/resources/testData.txt");
	}
}