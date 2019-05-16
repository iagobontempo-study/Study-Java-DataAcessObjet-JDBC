package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramDepartment {

	public static void main(String[] args) {
		
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
		
		
		

	}

}
