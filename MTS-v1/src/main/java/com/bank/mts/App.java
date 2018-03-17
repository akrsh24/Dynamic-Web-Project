package com.bank.mts;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bank.mts.service.TxrService;

public class App {

	public static void main(String[] args) {
		
		//Init
		//-------------------------------------------------------
		ConfigurableApplicationContext applicationContext=null;
		applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");		
		//---------------------------------------------------------
		//Use
		//---------------------------------------------------------
		TxrService txrService= applicationContext.getBean("txrService",TxrService.class);
		txrService.txr(1000.00, "1", "2");
		//---------------------------------------------------------
		//close
		//---------------------------------------------------------
		applicationContext.close();
		//---------------------------------------------------------
		
	}
}
