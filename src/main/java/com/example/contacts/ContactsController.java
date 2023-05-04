package com.example.contacts;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class ContactsController {

    @FXML
    private ListView<?> contactsListView;

    @FXML
    private TextField emailTextField;

    @FXML
    private TextField firstNameTextField;

    @FXML
    private Pane infoView;

    @FXML
    private TextField lastNameTextField;

    @FXML
    private TextField phoneNumberTextField;

}

