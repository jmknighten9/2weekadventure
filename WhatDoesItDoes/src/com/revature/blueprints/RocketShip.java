package com.revature.blueprints;

public class RocketShip {
	private String name;
	private int  numOfRockets;
	private int fuelCapacity;
	private boolean isMinifridge;

	public RocketShip() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RocketShip(String name, int numOfRockets, int fuelCapacity, boolean isMinifridge) {
		super();
		this.name = name;
		this.numOfRockets = numOfRockets;
		this.fuelCapacity = fuelCapacity;
		this.isMinifridge = isMinifridge;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumOfRockets() {
		return numOfRockets;
	}

	public void setNumOfRockets(int numOfRockets) {
		this.numOfRockets = numOfRockets;
	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public  boolean isMinifridge() {
		return isMinifridge;
	}

	public void setMinifridge(boolean isMinifridge) {
		this.isMinifridge = isMinifridge;
	}

	@Override
	public String toString() {
		return "RocketShip [name=" + name + ", numOfRockets=" + numOfRockets + ", fuelCapacity=" + fuelCapacity
				+ ", isMinifridge=" + isMinifridge + "]";
	}
	
}
