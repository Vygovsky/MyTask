package BD;

public class ManagerContact {
    private ContactDAO dao;

    public ManagerContact(ContactDAO dao) {

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

    public void getContacts() {
        dao.findContacts();
    }
}
