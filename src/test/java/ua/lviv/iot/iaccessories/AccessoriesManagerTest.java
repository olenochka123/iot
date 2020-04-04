package ua.lviv.iot.iaccessories;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.iaccessories.manager.*;
import ua.lviv.iot.iaccessories.model.*;
import ua.lviv.iot.iaccessories.BikeType;

public class AccessoriesManagerTest {

private static ProductManager manager;
	
	@BeforeEach
	public static void run()
	{
		manager = new ProductManager();
		BikeAccessory ba_1 = new BikeAccessory(0, "yulo1", 2000, 310, "mercedes", "grey", BikeType.MOUNTAIN);
		BikeAccessory ba_2 = new BikeAccessory(1, "yulo2", 2000, 300, "mercedes", "grey", BikeType.URBAN);
		BikeAccessory ba_3 = new BikeAccessory(2, "yulo3", 2000, 320, "bmw", "grey", BikeType.TRACK);
		BikeAccessory ba_4 = new BikeAccessory(3, "yulo4", 2000, 20, "nissan", "grey", BikeType.TRACK);
		BikeAccessory ba_5 = new BikeAccessory(4, "yulo5", 2000, 3, "nissan", "grey", BikeType.URBAN);
		
		
	}
	
    @Test
    public void findProducts() {
        
    }

}
