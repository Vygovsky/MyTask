package bd;

import java.util.List;

public class ManagerContact {
    private ContactDAO dao;

    public ManagerContact() {
        dao = ContactDAOFactory.getContactDAO();
    }

    public Long addContact(Contact contact) {
        return dao.addContact(contact);
    }

    public void updateContact(Contact contact) {
        dao.updateContact(contact);
    }

    public void deleteContact(Long id) {
        dao.deleteContact(id);
    }

    public Contact getContact(Long id) {
        return dao.getContact(id);
    }

    public List<Contact> findContacts() {
        return dao.findContacts();
    }
}
