package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department dep = new Department(1, "Venda");
		Seller seller = new Seller(1, "Maria", "maria@gmail.com", new Date(), 6000, dep);
		
		System.out.println(dep);
		System.out.println(seller);
	}
}
