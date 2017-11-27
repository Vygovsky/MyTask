package bd;

import java.util.List;

public interface ContactDAO {
    Long addContact(Contact contact);

    void updateContact(Contact contact);

    void deleteContact(Long id);

    Contact getContact(Long id);

    List<Contact> findContacts();
}
