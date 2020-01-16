import java.io.*;
import java.util.Scanner;
public class Oppgave2_3
{
	public static void main(String[] args)
	{
		Planet mars = new Planet("Mars", 3389.5, 3.711);
		mars.printPlanet();

		//lager scanner så vi kan ta i mot inputs
		Scanner scanner = new Scanner(System.in);

		System.out.println("");
		System.out.println("");
		System.out.println("Bonus oppgave under.");
		System.out.println("");

		//Ber brukeren om info og lagrer info i variabler
		System.out.println("Skriv inn navnet på planeten: ");
		String inputName = scanner.next();
		System.out.println("Skriv inn radiusen på planeten: ");
		double inputRadius = scanner.nextDouble();
		System.out.println("Skriv inn gravitasjonen på planeten: ");
		double inputGravity = scanner.nextDouble();

		//bruker variablene til å registrere ny planet og printer planeten
		Planet userPlanet = new Planet(inputName, inputRadius, inputGravity);
		userPlanet.printPlanet();
	}
}
