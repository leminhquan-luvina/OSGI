package net.luvina.leminhquan.testListener.internal;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTrackerCustomizer;
import org.wiperdog.bundleextractor.BundleExtractor;

public class Processor implements ServiceTrackerCustomizer{
	BundleContext ctx;
	
	public Processor(BundleContext context){
		this.ctx = context;
	}

	public Object addingService(ServiceReference sr) {
		System.out.println("Got " + sr.getClass());
		BundleExtractor service = (BundleExtractor)ctx.getService(sr);
		System.out.println("====" + service);
		System.out.println(service.getName());
		return null;
	}

	public void modifiedService(ServiceReference sr, Object arg1) {
		// TODO Auto-generated method stub
		
	}

	public void removedService(ServiceReference sr, Object arg1) {
		// TODO Auto-generated method stub
		
	}

}
