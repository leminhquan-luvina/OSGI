package org.wiperdog.bundleextractor.internal;

import org.wiperdog.bundleextractor.BundleExtractor;

public class BundleExtractorImpl implements BundleExtractor{
	private String name;
	
	public BundleExtractorImpl(){
		this.name = "";
	}
	
	public BundleExtractorImpl(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void shoutout() {
		// TODO Auto-generated method stub
		
	}

}
