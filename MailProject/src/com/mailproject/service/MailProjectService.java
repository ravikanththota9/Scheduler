package com.mailproject.service;

import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class MailProjectService implements Job{
	

	 Logger log = Logger.getLogger(MailProjectService.class);
	
	@Override
	 public void execute(JobExecutionContext pArg0) throws JobExecutionException {
	 log.info("The mail sender job triggerd");
	 System.out.println("The mail sender job triggerd");
	 //call JDBC logic and Send mail 
	 
	 }
	
	public void getData() {
		//Write jdbc logic to get database connection and execute the query to fetch the data.
		// Write the data 
	}

}
