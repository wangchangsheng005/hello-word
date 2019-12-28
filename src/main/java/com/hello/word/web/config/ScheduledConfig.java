package com.hello.word.web.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;




@Component
public class ScheduledConfig {
	private final Logger logger = LoggerFactory.getLogger(ScheduledConfig.class);
	@Scheduled(cron = "* 0/1 * * * ?")
	public void saveGatherResources() {
		
		logger.info("11111111111111111111111111111");
	}

}
