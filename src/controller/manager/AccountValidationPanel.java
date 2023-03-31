package controller.manager;

import model.user.User;
import repo.UserRepository;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Array;
import java.util.ArrayList;

import static javax.swing.ListSelectionModel.SINGLE_SELECTION;

public class AccountValidationPanel extends JFrame {

    private JList accountsList;

    JButton validateAccount;
    JButton backButton;

    private User selectedClient;

    public AccountValidationPanel(User user) {

        this.setSize(500,500);

        accountsList = new JList(getInvalidatedClients());
        accountsList.setSelectionMode(SINGLE_SELECTION);

        validateAccount = new JButton("Validate Account");
        validateAccount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedClient = (User) accountsList.getSelectedValue();
                selectedClient.validateAccount();
                accountsList.setListData(getInvalidatedClients());
            }
        });

        JPanel mainPanel = new JPanel();

        mainPanel.add(accountsList);
        mainPanel.add(validateAccount);

        this.add(mainPanel);
        this.setVisible(true);
    }

    private Object[] getInvalidatedClients()
    {

        UserRepository UR = new UserRepository();
        List<User> allClients = UR.getUsers();

        //Replace above with Raf's get users
        ArrayList<User> clients = new ArrayList<>();

        for (User client : allClients) {
            if (!((User) client).getValidationStatus()) {
                clients.add(client);
            }
        }

        return clients.toArray();
    }


}