package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		

		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("=== TEST1 === findById");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("=== TEST2 === findByDepartment");
		Department department = new Department(2, null);
		List<Seller> sellerList = sellerDao.findByDepartment(department);
		for (Seller obj : sellerList) {
			System.out.println(obj);
		}
		
		System.out.println("=== TEST3 === findAll");
		sellerList = sellerDao.findAll();
		for (Seller obj : sellerList) {
			System.out.println(obj);
		}
		
		System.out.println("=== TEST4 === insertSeller");
		Seller newSeller = new Seller(null, "Greg", "greg@hotmail.com", new Date(), 5000, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! ID = " + newSeller.getId());
		
		
		System.out.println("=== TEST5 === updateSeller");
		seller = sellerDao.findById(1);
		seller.setName("Linda Cruz");
		seller.setEmail("linda@hotmail.com");
		sellerDao.update(seller);
		System.out.println("Updated! ID = " + seller.getId());
		
	}
}
