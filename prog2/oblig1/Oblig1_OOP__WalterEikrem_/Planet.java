import java.io.*;
import java.util.Scanner;
class Planet
{
		// Variabler
		private String name;
		private double radius;
		private double gravity;
// -----------------------------------------------------------------------
		public Planet(String startName, double startRadius, double startGravity) {
			name = startName;
			radius = startRadius;
			gravity = startGravity;
		}
// -----------------------------------------------------------------------
		// Setters
		public void setName(String newName) {
			this.name = newName;
		}
		public void setRadius(double newRadius) {
			this.radius = newRadius;
		}
		public void setGravity(double newGravity) {
			this.gravity = newGravity;
		}
// -----------------------------------------------------------------------
		// Getters
		public String getName() {
			return name;
		}
		public double getRadius() {
			return radius;
		}
		public double getGravity() {
			return gravity;
		}
// -----------------------------------------------------------------------
		//Utskriver
		public void printPlanet() {
			System.out.print("\033[H\033[2J");
			System.out.flush();
			System.out.println("Oppgave 3: a & b.");
			System.out.println("-----------------------------------------------------------------------------------");
			System.out.println("");
			System.out.println("Planeten "+ name +", har en radius på "+ radius +"km, og en gravitasjon på " + gravity+"m/s2");
			System.out.println("");
			System.out.println("-----------------------------------------------------------------------------------");
		}
}
