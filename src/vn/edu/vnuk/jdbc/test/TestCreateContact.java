package vn.edu.vnuk.jdbc.test;

import java.sql.SQLException;
import java.util.Calendar;

import vn.edu.vnuk.jdbc.dao.ContactDao;
import vn.edu.vnuk.jdbc.model.Contact;

public class TestCreateContact {
	public static void main(String[] args) throws SQLException {
		Contact contact = new Contact();
		contact.setName("Giang1");
		contact.setEmail("Something");
		contact.setAddress("another Something");
		contact.setDateOfRegister(Calendar.getInstance());
		
		new ContactDao().create(contact);
	}
}
