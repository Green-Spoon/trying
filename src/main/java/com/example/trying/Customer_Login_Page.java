package com.example.trying;

import javafx.fxml.FXML;

public class Customer_Login_Page {
    @FXML
    protected void onBackButtonClick() {
        switchScreenCustomerLoginPage("CPS");
    }

    @FXML
    protected void onSignInButtonClick() {
        switchScreenCustomerLoginPage("Customer Main Menu");
    }

    public static void switchScreenCustomerLoginPage(String screenName){
        switch (screenName) {
            case "CPS":
                App.switchScreenMain(screenName, "landing-page");
            case "Customer Main Menu":
                App.switchScreenMain(screenName, "customer-main-menu");

        }
    }
}