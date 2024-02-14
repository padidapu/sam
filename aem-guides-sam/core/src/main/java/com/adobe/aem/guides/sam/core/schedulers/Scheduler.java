package com.adobe.aem.guides.sam.core.schedulers;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Component(immediate=true,service=Runnable.class)
@Designate(ocd = OsgiConfiguration.class)
public class Scheduler implements Runnable {
private static final Logger Log = LoggerFactory.getLogger(Scheduler.class);
private int schedulurid;
@Reference
 private Scheduler scheduler;
@Activate
protected void activate(OsgiConfiguration config) {
	schedulurid=config.sanjuproject().hashCode();
}

public void run() {
	// TODO Auto-generated method stub
	
}

		
	}


