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
		noteBook nb = new noteBook("LG", "gram", 12, "���", 16);
		System.out.println("�귣��: "+  nb.brand);
		System.out.println("��: "+  nb.model);
		System.out.println("����: "+  nb.generation);
		System.out.println("����: "+  nb.color);
		System.out.println("ũ��(��ġ): "+  nb.inch);
	}
}
