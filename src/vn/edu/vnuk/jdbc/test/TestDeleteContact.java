package vn.edu.vnuk.jdbc.test;

import java.sql.SQLException;
import java.util.Scanner;

import vn.edu.vnuk.jdbc.dao.ContactDao;

public class TestDeleteContact {

	public static void main(String[] args) throws SQLException {
		long id;
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Delete contact by id");
	    System.out.print("Input id: ");
		id = sc.nextLong();
		
		ContactDao contactDao = new ContactDao();

		contactDao.delete(id);

	}

}
