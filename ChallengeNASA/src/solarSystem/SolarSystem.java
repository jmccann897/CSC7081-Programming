package solarSystem;

import java.awt.DisplayMode;
import java.util.ArrayList;

public class SolarSystem {

	//count for planet list
	public static int planetCount = 14;
	
	public static void main(String[] args) {
			
		//full planets
		Planet p1 = new Planet("Mercury", PlanetType.PLANET);
		Planet p2 = new Planet("Venus", PlanetType.PLANET);
		Planet p3 = new Planet("Earth", PlanetType.PLANET);
		Planet p4 = new Planet("Mars", PlanetType.PLANET);
		Planet p5 = new Planet("Jupiter", PlanetType.PLANET);
		Planet p6 = new Planet("Saturn", PlanetType.PLANET);
		Planet p7 = new Planet("Uranus", PlanetType.PLANET);
		Planet p8 = new Planet("Neptune", PlanetType.PLANET);

		//dwarfs
		Planet p9 = new Planet("Ceres", PlanetType.DWARF);
		Planet p10 = new Planet("Pluto", PlanetType.DWARF);
		Planet p11 = new Planet("Makemake", PlanetType.DWARF);
		Planet p12 = new Planet("Haumea", PlanetType.DWARF);
		Planet p13 = new Planet("Eris", PlanetType.DWARF);
		
		
		//hypotheticals
		Planet p14 = new Planet("Planet X",PlanetType.HYPOTHETICAL);

		
		ArrayList<Planet> planetList = new ArrayList<Planet>();
		planetList.add(p1);
		planetList.add(p2);
		planetList.add(p3);
		planetList.add(p4);
		planetList.add(p5);
		planetList.add(p6);
		planetList.add(p7);
		planetList.add(p8);
		planetList.add(p9);
		planetList.add(p10);
		planetList.add(p11);
		planetList.add(p12);
		planetList.add(p13);
		planetList.add(p14);
		
		displayPlanetList(planetList);
	}
	
	public static void displayPlanetList(ArrayList<Planet> list) {
		for (Planet p: list) {
			p.displayPlanetInfo();
		}
	}

}
