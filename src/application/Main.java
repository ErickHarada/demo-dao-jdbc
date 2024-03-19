package application;

import model.dao.SellerDao;
import model.dao.factory.DaoFactory;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== Teste 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== Teste 2: seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        list.forEach(System.out::println);

        System.out.println("\n=== Teste 3: seller findAll ===");
        List<Seller> list2 = sellerDao.findAll();
        list2.forEach(System.out::println);

        System.out.println("\n=== Teste 4: seller insert ===");
        Seller seller1 = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(seller1);
        System.out.println("Inserted! New id = " + seller1.getId());
    }
}
