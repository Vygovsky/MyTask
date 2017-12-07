package bd.ContactFrame;

import bd.Contact;
import bd.ManagerContact;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;

/**
 * Created by Roman_v on 03.12.2017.
 */
public class ContactFrame extends JFrame implements ActionListener {
    private static final String LOAD = "LOAD";
    private static final String ADD = "ADD";
    private static final String EDIT = "EDIT";
    private static final String DELETE = "DELETE";

    private final ManagerContact mc = new ManagerContact();
    private final JTable contactTable = new JTable();

    public ContactFrame() {
        contactTable.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        GridBagLayout gridBag = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 0, 5);

        JPanel panel = new JPanel();
        panel.setLayout(gridBag);
        panel.add(createButton(gridBag, gbc, "Обновить", LOAD));
        panel.add(createButton(gridBag, gbc, "Добавить", ADD));
        panel.add(createButton(gridBag, gbc, "Изменить", EDIT));
        panel.add(createButton(gridBag, gbc, "Удалить", DELETE));

        JPanel left = new JPanel();
        left.setLayout(new BorderLayout());

        left.add(panel, BorderLayout.NORTH);
        add(left, BorderLayout.WEST);
        add(new JScrollPane(contactTable), BorderLayout.CENTER);
        setBounds(100, 200, 900, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loadContact();
    }

    // Метод создает кнопку с заданными харктеристиками - заголовок и действие
    private JButton createButton(GridBagLayout gridBag, GridBagConstraints gbc, String title, String action) {
        // Создаем кнопку с заданным загловком
        JButton jButton = new JButton(title);
        // Действие будетп роверяться в обработчике и мы будем знать, какую именно кнопку нажали
        jButton.setActionCommand(action);
        // Обработчиком события от кнопки являемся сама форма
        jButton.addActionListener(this);
        // Выставляем свойства для размещения для кнопки
        gridBag.setConstraints(jButton, gbc);
        return jButton;
    }

    private void loadContact() {
        List<Contact> list = mc.findContacts();
        ContactModel cm = new ContactModel(list);
        contactTable.setModel(cm);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        switch (action) {
            case LOAD:
                loadContact();
                break;
            case ADD:
                addContact();
                break;
            case EDIT:
                editContact();
                break;
            case DELETE:
               // deleteContact();
                break;

        }

    }

    private void addContact() {
        //EditContactDialog

    }

    private void editContact() {
        int st = contactTable.getSelectedRow();
        if (st != -1) {
            Long id = Long.parseLong(contactTable.getModel().getValueAt(st, 0).toString());
            Contact cnt = mc.getContact(id);
            EditContactDialog ecd = new EditContactDialog(mc.getContact(id));
            saveContact(ecd);
        }else {
            JOptionPane.showMessageDialog(this,"Вы должны выделить строку для редактирования");
        }
    }

    private void saveContact(EditContactDialog ed) {
        if (ed.isSave()){

        }

    }

}
