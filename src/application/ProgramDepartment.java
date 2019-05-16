package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramDepartment {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST1 === insert Department");
		Department newDepartment = new Department(null, "Food");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! ID = " + newDepartment.getId());
		
		System.out.println("=== TEST2 === findById");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("=== TEST2 === update Department");
		department = departmentDao.findById(5);
		department.setName("Novo Nome Teste");
		departmentDao.update(department);
		System.out.println("Updated! ID = " + department.getId());
		
		System.out.println("=== TEST3 === findAll");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("=== TEST4 === delete Department");
		System.out.println("ID to delete: ");
		int id = scanner.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Deleted! ID = " + id);
		
		scanner.close();

	}

}
