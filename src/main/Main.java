package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import bll.Data;
import dol.hourEmployee;
import ui.Menu;
import ui.PMenu;
import ui.addHourEmp;

public class Main  {
	


	//static PMenu m  = new PMenu();
	
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		boolean error = false;
		PMenu m  = new PMenu();
		//try {
		
		m.options2();
		/**}catch(InputMismatchException e) {
			System.out.println("\033[31mIntroduce un valor numerico.\u001B[0m");
			System.out.println();
			error = true;
			if(error = true) {
				m.options2();
		}
	 }catch(StackOverflowError e) {
		 System.out.println("bucle");
	   error = true;
		if(error = true) {
			m.options2();
		}			
		}**/
	
	}
	
}
