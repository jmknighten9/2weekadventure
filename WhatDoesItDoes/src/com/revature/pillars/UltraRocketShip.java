package com.revature.pillars;

import com.revature.blueprints.RocketShip;
/*
 * Members of a class- variables and Methods
 * Static and instance forms
 * Instance variables- property of one specific object (i.e warpDriveModel)
 * Static variables- belong to ALL UltraRocketShips( i.e Ford)
 * Instance methods-Behavior related to a specific object(i.e. getName())
 * Static Methods behavior relative to the entire class/all objects of that type
 * Final- Keyword in Java. has different meanings according to what it is applied too
 * 	final variable- value cannot be changed 
 * 		static final variables are constants
 * 		Final instance variables cannot be changed once initialized
 * 	final method- a method that cannot be overridden
 * 	final class- a class that cannot be extended/ no more inheritance
 * 
 */
public class UltraRocketShip extends RocketShip {
	private boolean hasBar;
	private String warpDriveModel;
	static private String manufactuer= "Ford";
	
	// Default Constructor
	public UltraRocketShip() {
		super();
		this.setMinifridge(true);
		
	}
	public static void setManufactuer(String manufactuer) {
		UltraRocketShip.manufactuer = manufactuer;
	}
	public static String getManufactuer() {
		return manufactuer;
	}
	//Constructor with parameters
	public UltraRocketShip(String name, int numOfRockets, int fuelCapacity, boolean hasBar,
			String warpDriveModel) {
		super(name, numOfRockets, fuelCapacity, true);
		this.hasBar = hasBar;
		this.warpDriveModel = warpDriveModel;
	}
	

	public boolean isHasBar() {
		return hasBar;
	}


	public void setHasBar(boolean hasBar) {
		this.hasBar = hasBar;
	}

	public String getWarpDriveModel() {
		return warpDriveModel;
	}

	public void setWarpDriveModel(String warpDriveModel) {
		this.warpDriveModel = warpDriveModel;
	}
	
	@Override
	public boolean isMinifridge() {
		System.out.println("Duh of course it has a mini fridge");
		return super.isMinifridge();
	}
	@Override
	public String toString() {
		return "UltraRocketShip [name="+ super.getName()+" numOfRockets= "
	+ super.getNumOfRockets()+ " fuelCapacity= "+ super.getFuelCapacity()+
	"hasBar=" + hasBar + ", warpDriveModel=" + warpDriveModel + "]";
	}

	
	
	
	
}
