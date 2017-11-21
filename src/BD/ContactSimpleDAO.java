package BD;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ContactSimpleDAO implements ContactDAO {
    private List<Contact> contacts = new ArrayList<>();

    @Override
    public Long addContact(Contact contact) {
        Long id = generateId();
        contact.setId(id);
        contacts.add(contact);
        return id;
    }

    @Override
    public void updateContact(Contact contact) {
        Contact oldContact = getContact(contact.getId());
        if (oldContact != null) {
            oldContact.setName(contact.getName());
            oldContact.setLastName(contact.getLastName());
            oldContact.setPhone(contact.getPhone());
            oldContact.setMail(contact.getMail());
        }

    }

    @Override
    public void deleteContact(Long id) {
        contacts.removeIf(cnt -> cnt.getId().equals(id));
    }

    @Override
    public Contact getContact(Long id) {
        for (Contact contact : contacts) {
            contact.getId().equals(id);
            return contact;
        }
        return null;
    }

    @Override
    public List<Contact> findContacts() {
        return contacts;
    }

    private Long generateId() {
        Long contactId = Math.round(Math.random() * 1000 + System.currentTimeMillis());
        while (getContact(contactId) != null) {
            contactId = Math.round(Math.random() * 1000 + System.currentTimeMillis());
        }
        return contactId;
    }
}
