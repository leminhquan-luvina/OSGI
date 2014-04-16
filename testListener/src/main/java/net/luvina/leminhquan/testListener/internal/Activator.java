package net.luvina.leminhquan.testListener.internal;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;
import org.osgi.util.tracker.ServiceTrackerCustomizer;
import org.wiperdog.bundleextractor.BundleExtractor;

public class Activator implements BundleActivator{
	
	public void start(BundleContext context) throws Exception {
		System.out.println("I am here to test listener.");
		System.out.println(new Processor(context));
		ServiceTrackerCustomizer trackerObj = new Processor(context);
		ServiceTracker tracker = new ServiceTracker(context, BundleExtractor.class.getName(), trackerObj);
		tracker.open();
	}

	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
