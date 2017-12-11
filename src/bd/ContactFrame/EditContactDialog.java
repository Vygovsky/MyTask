package bd.ContactFrame;

import bd.Contact;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditContactDialog extends JDialog implements ActionListener {
    private static final String SAVE = "SAVE";
    private static final String CANCEL = "CANCEL";

    private static final int PAD = 10;
    private static final int W_L = 100;
    private static final int W_T = 300;
    private static final int W_B = 120;

    private static final int H_B = 25;

    private static final JTextPane txtFirstName = new JTextPane();
    private static final JTextPane txtLastName = new JTextPane();
    private static final JTextPane txtPhone = new JTextPane();
    private static final JTextPane txtEmail = new JTextPane();

    private Long contactId = null;
    private boolean save = false;

    public EditContactDialog() {
        this(null);
    }

    public EditContactDialog(Contact contact) {
        setLayout(null);
        buildFeids();
        iniContact(contact);
        buildButtons();

        setModal(true);
        setResizable(false);
        setBounds(300,300,450,500);
        setVisible(true);
    }

    private void buildFeids() {
        JLabel lblFirstName = new JLabel("Имя:");
        // Выравнивание текста с правой стороны
        lblFirstName.setHorizontalAlignment(SwingConstants.RIGHT);
        // Выставляем координаты метки
        lblFirstName.setBounds(new Rectangle(PAD, 0 * H_B + PAD, W_L, H_B));
        // Кладем метку на форму
        add(lblFirstName);
        // Выставляем координаты поля
        txtFirstName.setBounds(new Rectangle(W_L + 2 * PAD, 0 * H_B + PAD, W_T, H_B));
        // Делаем "бордюр" для поля
        txtFirstName.setBorder(BorderFactory.createEtchedBorder());
        // Кладем поле на форму
        add(txtFirstName);

        // Набор метки и поля для Фамилии
        JLabel lblLastName = new JLabel("Фамилия:");
        lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
        lblLastName.setBounds(new Rectangle(PAD, 1 * H_B + PAD, W_L, H_B));
        add(lblLastName);
        txtLastName.setBounds(new Rectangle(W_L + 2 * PAD, 1 * H_B + PAD, W_T, H_B));
        txtLastName.setBorder(BorderFactory.createEtchedBorder());
        add(txtLastName);

        // Набор метки и поля для Телефона
        JLabel lblPhone = new JLabel("Телефон:");
        lblPhone.setHorizontalAlignment(SwingConstants.RIGHT);
        lblPhone.setBounds(new Rectangle(PAD, 2 * H_B + PAD, W_L, H_B));
        add(lblPhone);
        txtPhone.setBounds(new Rectangle(W_L + 2 * PAD, 2 * H_B + PAD, W_T, H_B));
        txtPhone.setBorder(BorderFactory.createEtchedBorder());
        add(txtPhone);

        // Набор метки и поля для Email
        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
        lblEmail.setBounds(new Rectangle(PAD, 3 * H_B + PAD, W_L, H_B));
        add(lblEmail);
        txtEmail.setBounds(new Rectangle(W_L + 2 * PAD, 3 * H_B + PAD, W_T, H_B));
        txtEmail.setBorder(BorderFactory.createEtchedBorder());
        add(txtEmail);
    }

    private void buildButtons() {
        JButton saveButtons = new JButton("SAVE");
        saveButtons.setActionCommand(SAVE);
        saveButtons.addActionListener(this);
        saveButtons.setBounds(new Rectangle(PAD, 5 * H_B + PAD, W_B, H_B));
        add(saveButtons);

        JButton canselButtons = new JButton("CANCEL");
        canselButtons.setActionCommand(CANCEL);
        canselButtons.addActionListener(this);
        canselButtons.setBounds(new Rectangle(W_B+2*PAD, 5 * H_B + PAD, W_B, H_B));
        add(canselButtons);
    }

    private void iniContact(Contact contact) {
        if (contact != null) {
            contactId = contact.getId();
            txtFirstName.setText(contact.getName());
            txtLastName.setText(contact.getLastName());
            txtEmail.setText(contact.getMail());
            txtPhone.setText(contact.getPhone());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        save = SAVE.equals(action);
        setVisible(true);
    }

    public boolean isSave() {
        return save;
    }

    public Contact getContact() {
        Contact contact = new Contact(contactId, txtFirstName.getText(), txtLastName.getText(), txtPhone.getText(), txtEmail.getText());
        return contact;
    }
}
