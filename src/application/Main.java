package application;

import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.dao.factory.DaoFactory;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SellerDao sellerDao = DaoFactory.createSellerDao();
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

//        System.out.println("=== Teste 1: seller findById ===");
//        Seller seller = sellerDao.findById(3);
//        System.out.println(seller);
//
//        System.out.println("\n=== Teste 2: seller findByDepartment ===");
//        Department department = new Department(2, null);
//        List<Seller> list = sellerDao.findByDepartment(department);
//        list.forEach(System.out::println);
//
//        System.out.println("\n=== Teste 3: seller findAll ===");
//        List<Seller> list2 = sellerDao.findAll();
//        list2.forEach(System.out::println);
//
//        System.out.println("\n=== Teste 4: seller insert ===");
//        Seller seller1 = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
//        sellerDao.insert(seller1);
//        System.out.println("Inserted! New id = " + seller1.getId());
//
//        System.out.println("\n=== Teste 5: seller update ===");
//        seller = sellerDao.findById(1);
//        seller.setName("Martha Wayne");
//        sellerDao.update(seller);
//        System.out.println("Update completed");
//
//        System.out.println("\n=== Teste 6: seller delete ===");
//        System.out.println("Enter id for delete test: ");
//        int id = scanner.nextInt();
//        sellerDao.deleteById(id);
//        System.out.println("Delete completed");

        System.out.println("=== Teste 1: department findById ===");
        Department department = departmentDao.findById(1);
        System.out.println(department);

        System.out.println("=== Teste 2: department findAll ===");
        List<Department> list3 = departmentDao.findAll();
        list3.forEach(System.out::println);

//        System.out.println("\n=== Teste 3: department insert ===");
//        Department department1 = new Department(null, "Music");
//        departmentDao.insert(department1);
//        System.out.println("Inserted! New id = " + department1.getId());

//        System.out.println("\n=== Teste 4: department update ===");
//        department = departmentDao.findById(1);
//        department.setName("Food");
//        departmentDao.update(department);
//        System.out.println("Update completed");

        System.out.println("\n=== Teste 5: department delete ===");
        System.out.println("Enter id for delete test: ");
        int id = scanner.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");

        scanner.close();
    }
}
