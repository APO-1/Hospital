package ui;

import java.util.Scanner;

import model.Controller;

public class Main{

	public Scanner reader;
	public Controller controller;

	public static void main(String[] args) {
		Main main = new Main();
		main.showMainMenu();
	}

	public Main() {

		reader = new Scanner(System.in);
		controller = new Controller();
	}

	public void showMainMenu() {


		boolean stopFlag = false;

		while (!stopFlag) {

			System.out.println("\nDigite una opcion");
			System.out.println("1. Registrar una paciente parkinson");
			System.out.println("2. Registrar una paciente lewy");
			System.out.println("0. Salir");

			int mainOption = reader.nextInt();

			switch (mainOption) {

			case 1:
			 //
				break;
			case 2:
			 //
				break;
			case 0:
				System.out.println("Gracias por usar el sistema");
				stopFlag = true;
				break;
			default:
				System.out.println("Por favor digite una opcion valida");
				break;

			}

		}

	}

}
