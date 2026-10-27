package org.example.ui;

import org.example.dao.UserDao;
import org.example.model.User;

import java.util.List;
import java.util.Scanner;

/** Dashboard for the ADMIN role. */
public class AdminMenu extends RoleMenu {

    public AdminMenu(Scanner scanner, UserDao userDao) {
        super(scanner, userDao);
    }

    @Override
    protected String title() {
        return "ADMIN DASHBOARD";
    }

    @Override
    protected List<String> options() {
        return List.of("Manage User Accounts", "View Clinic Information");
    }

    @Override
    protected void handleOption(int option, User user) {
        // TODO: connect each option to its DAO in a later deliverable
        notYetImplemented();
    }
}
