/**
 * 
 */
package test;

import java.util.Scanner;

import abs_inter.AbstractFactory;
import abs_inter.AbstractOriental;
import abs_inter.AbstractReine;
import abs_inter.AbstractTroisFrommage;

/**
 * @author ADAMA SOW
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Donnez le pays de votre choix: USA, FR, SN ");
		Scanner sc=new Scanner(System.in);		
		String pays= sc.nextLine();
		/*********************************/
		AbstractFactory factory;//=new FactoryFR();
		factory=AbstractFactory.getFactory(pays);
		AbstractOriental ori=factory.getOrientale();
		ori.service();
		/*******************************/
		factory=AbstractFactory.getFactory(pays);
		AbstractReine reine=factory.getReine();
		reine.serviceReine();
		
		/******************************/
		factory=AbstractFactory.getFactory(pays);
		AbstractTroisFrommage troisFrommage=factory.getTroisFrommage();
		troisFrommage.serviceTroisFrommage();
	}

}
