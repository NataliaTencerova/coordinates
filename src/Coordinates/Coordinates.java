package Coordinates;

import java.util.Locale;
import java.util.Scanner;

class point {
	String name;
	double x;
	double y;

	point(String name, double x, double y) {
		this.name = name;
		this.x = x;
		this.y = y;
	}
}

public class Coordinates {
	static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		point a = setPoint("A");
		point d = setPoint("D");
		
		point n = new point("N", (d.x - a.x)/2.0, (d.y - a.y)/2.0);
		point b = new point("B", a.x - n.y, a.y + n.x);
		point c = new point("C", d.x - n.y, d.y + n.x);
		
		printPoint(b);
		printPoint(c);
	
	}
	
	static point setPoint(String name){
		Locale.setDefault(Locale.US);
		
		System.out.println("Zadej "+name+"x: ");
		double x = sc.nextDouble();
		System.out.println("Zadej "+name+"y: ");
		double y = sc.nextDouble();
		
		return new point(name, x, y);
	}
	
	static void printPoint(point p) {
		System.out.format("%sx = %.3f%n", p.name, p.x);
		System.out.format("%sy = %.3f%n", p.name, p.y);	
	}
}