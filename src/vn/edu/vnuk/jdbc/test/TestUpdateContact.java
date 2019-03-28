package vn.edu.vnuk.jdbc.test;

import java.sql.SQLException;
import java.util.Scanner;

import vn.edu.vnuk.jdbc.dao.ContactDao;
import vn.edu.vnuk.jdbc.model.Contact;

public class TestUpdateContact {

	public static void main(String[] args) throws SQLException {
	ContactDao contactDao = new ContactDao();
		
		long id;
		String name, email, address;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Update contact by ID");
	    
	    System.out.print("Input id: ");
		id = sc.nextLong();
		
		Contact newContact = contactDao.read(id);
		
		System.out.println("input data(enter '0' if not change");
		
		System.out.println("Input new name: ");
		name = sc.next();
		
		if (!name.equals("0")) {
			newContact.setName(name);
			System.out.println("change successed!");
		} else {
			System.out.println("unchanged!");
		}
		
		System.out.println("Input new email: ");
		email = sc.next();
		
		if (!email.equals("0")) {
			newContact.setEmail(email);
			System.out.println("change successed!");
		} else {
			System.out.println("unchanged!");

		}
		
		System.out.println("Input new address: ");
		address = sc.next();
		
		if (!address.equals("0")) {
			newContact.setAddress(address);
			System.out.println("change successed!");
		} else {
			System.out.println("unchanged!");

		}

		contactDao.update(id, newContact);
	}

}
