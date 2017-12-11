package bd;

import java.util.ArrayList;
import java.util.List;

public class ContactSimpleDAO implements ContactDAO {
    private List<Contact> contacts = new ArrayList<>();

    public ContactSimpleDAO() {
        addContact(new Contact("Михаил", "Троцкий", "097-165-99-48", "miha@ukr.net"));
        addContact(new Contact("Валера", "Крупицкия", "097-189-80-48", "Valera89@mail.ru"));
        addContact(new Contact("Ольга", "Миронинко", "066-996-55-41", "Olgino77@yandex.ru"));
    }

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
            if (contact.getId().equals(id)) {
                return contact;
            }
        }
        return null;
    }

    @Override
    public List<Contact> findContacts() {
        return contacts;
    }

    public Long generateId() {
        Long contactId = Math.round(Math.random() * 1000 + System.currentTimeMillis());
        while (getContact(contactId) != null) {
            contactId = Math.round(Math.random() * 1000 + System.currentTimeMillis());
        }
        return contactId;
    }
}
