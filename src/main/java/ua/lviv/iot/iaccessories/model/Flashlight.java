package ua.lviv.iot.iaccessories.model;

public class Flashlight {
	private float flashPower;
	private boolean isOn;

	public void triggerLight()
	{
		isOn = !isOn;
	}
}
