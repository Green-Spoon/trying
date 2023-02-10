package com.example.trying;

import javafx.fxml.FXML;

public class Landing_Page {
//    @FXML
//    static private MainApplication choose_screen;

    @FXML
    protected void onCustomerButtonClick() {
        switchScreenLandingPage("Customer login");
    }

    @FXML
    protected void onWorkerButtonClick() {
        switchScreenLandingPage("Worker login");
    }

    public static void switchScreenLandingPage (String screenName){
        switch (screenName) {
            case "Customer login":
                App.switchScreenMain(screenName, "customer-login-page");
            case "Worker login":
                App.switchScreenMain(screenName, "worker-login-page");

        }
    }

}