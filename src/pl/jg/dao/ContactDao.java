package pl.jg.dao;

import java.util.List;
import pl.jg.model.Contact;

public interface ContactDao {
	public List <Contact> read();
	public Contact read (Integer id);
	public void save (Contact contact);
	public void delete(Integer id);
}
