package org.wiperdog.bundleextractor.internal;

import javax.naming.Context;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.wiperdog.bundleextractor.BundleExtractor;

public class Activator implements BundleActivator{

	public void start(BundleContext context) throws Exception {
		System.out.println("Bundle extractor to the rescue!");
		context.registerService(BundleExtractor.class.getName(), new BundleExtractorImpl("leminhquan"), null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Bye :(");
	}

}
