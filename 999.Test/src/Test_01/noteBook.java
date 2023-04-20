package Test_01;

import java.util.Scanner;

public class noteBook {
	String brand, model, color;
	int inch, generation;
	public noteBook(String brand, String model, int generation, String color, int inch) {
		this.brand = brand;
		this.model = model;
		this.generation = generation;
		this.color = color;
		this.inch = inch;
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		noteBook nb = new noteBook("LG", "gram", 12, "흰색", 16);
		System.out.println("브랜드: "+  nb.brand);
		System.out.println("모델: "+  nb.model);
		System.out.println("세대: "+  nb.generation);
		System.out.println("색상: "+  nb.color);
		System.out.println("크기(인치): "+  nb.inch);
	}
}
