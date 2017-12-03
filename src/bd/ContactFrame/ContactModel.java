package bd.ContactFrame;

import bd.Contact;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ContactModel extends AbstractTableModel {

    public static final String[] head = {"ID", "Имя", "Фамилия", "Email", "Телефон"};
    public final List<Contact> contacts;

    public ContactModel(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public int getRowCount() {
        return contacts.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int column) {
        return head[column];
    }

    @Override
    public Object getValueAt(int row, int column) {
        Contact contact = contacts.get(row);
        switch (column) {
            case 0:
                return contact.getId().toString();
            case 1:
                return contact.getName();
            case 2:
                return contact.getLastName();
            case 3:
                return contact.getMail();
            default:
                return contact.getPhone();

        }
    }
}
