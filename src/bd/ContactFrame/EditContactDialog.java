package bd.ContactFrame;

import bd.Contact;

import javax.swing.*;
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
    boolean save = false;

    public EditContactDialog() {
        this(null);
    }

    public EditContactDialog(Contact contact) {

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public boolean isSave() {
        return save;
    }


}
