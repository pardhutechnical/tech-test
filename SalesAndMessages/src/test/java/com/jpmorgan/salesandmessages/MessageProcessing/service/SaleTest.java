package com.jpmorgan.salesandmessages.MessageProcessing.service;

import org.junit.*;

import com.jpmorgan.salesandmessages.impl.MessagePublisherServiceImpl;
import com.jpmorgan.salesandmessages.service.Sale;

import static org.junit.Assert.*;

/**
 * @author N P Saradhhi
 * The class <code>SaleTest</code> contains tests for the class <code>{@link Sale}</code>.
 *
 */
public class SaleTest {

	@Test
	public void testprocessNotificationSuccess()
		throws Exception {
		Sale sale = new Sale();
		Boolean messageProcessed = sale.processNotification("apple at 10p");
		assertTrue(messageProcessed);
	}
	
	@Test
	public void testprocessNotificationEmptyMessage()
		throws Exception {
		Sale sale = new Sale();
		Boolean messageProcessed = sale.processNotification("");
		assertFalse(messageProcessed);
	}
	
	@Test
	public void testprocessNotificationInvalidMessage()
		throws Exception {
		Sale sale = new Sale();
		Boolean messageProcessed = sale.processNotification("*/2.43&");
		assertFalse(messageProcessed);
	}
}
