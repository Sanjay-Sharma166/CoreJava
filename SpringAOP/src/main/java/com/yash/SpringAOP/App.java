package com.yash.SpringAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.SpringAOP.service.PaymentService;
/**
 * 
 * @author sanjay.sharma
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/yash/SpringAOP/Config.xml");
    	PaymentService paymentobject = context.getBean("payment", PaymentService.class);
    	paymentobject.makePayment(123);
    }
}
