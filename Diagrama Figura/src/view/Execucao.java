package view;

import model.Circulo;
import model.Quadrado;

public class Execucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circulo c = new Circulo();
		Quadrado q = new Quadrado();
		
		c.setLado (10);
		System.out.println(c.area());
		c.area();
		
		q.setLado (5);
		System.out.println(q.area(););
		q.falar();
		
	}

}
