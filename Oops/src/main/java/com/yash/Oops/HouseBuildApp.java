package com.yash.oops_demo;
/**
 * 
 * @author sanjay.sharma
 *
 */
public class HouseBuildApp {

	public static void main( String[] args )
		{

			HouseBuild h=new HouseBuild(156,"Ram",5500.54,"LightGrey", "Pitch", "K.S Construction");
			h.getDetails();
			HouseBuild h1=new HouseBuild(168,"Shyam",8000.89,"Cyan", "seablue", "K.S Construction");
			h1.getDetails();
			HouseBuild h2=new HouseBuild(168,"Rakesh",6000.52,"Grey", "LightRed", "K.S Construction");
			h2.getDetails();
		}
	}