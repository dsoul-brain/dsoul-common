package com.easwift.basic.spring;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * 
 * @descrpiton [spring容器管理listener]
 * @author [dingwei.tang]
 * @date [2017年2月9日 下午1:50:50]
 */
public class InjectionApplicationContextListener implements ApplicationListener<ContextStartedEvent> {
	private static final Logger LOG = Logger.getLogger(InjectionApplicationContextListener.class);

	@Override
	public void onApplicationEvent(ContextStartedEvent event) {
		CurrentSpringContext.setCurrentContext(event.getApplicationContext());
		if (LOG.isInfoEnabled()) {
			LOG.info("Spring 容器注入 CurrentSpringContext 成功");
		}

	}

}
