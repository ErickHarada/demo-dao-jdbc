package application;

import model.dao.SellerDao;
import model.dao.factory.DaoFactory;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Department d = new Department(1, "Books");
        Seller seller = new Seller(1, "Bob", "bob@gmail.com", new Date(), 3000.0, d);
        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println(seller);
    }
}
