package com.example.trying;

import javafx.fxml.FXML;

public class Worker_Login_Page {
    @FXML
    protected void onBackButtonClick() {
        switchScreenWorkerLoginPage("CPS");
    }

    @FXML
    protected void onSignInButtonClick() {
        switchScreenWorkerLoginPage("Worker Main Menu");
    }

    public static void switchScreenWorkerLoginPage (String screenName){
        switch (screenName) {
            case "CPS":
                App.switchScreenMain(screenName, "landing-page");
            case "Worker Main Menu":
                App.switchScreenMain(screenName, "worker-main-menu");

        }
    }
}