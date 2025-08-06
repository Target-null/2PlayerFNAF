package csc180.place.rollin.controller;

import csc180.place.rollin.view.PhysicalUser;
import csc180.place.rollin.view.TerminalUser;

public class MainController {
    TerminalUser TU;
    PhysicalUser PU;

    public MainController(){
        System.out.println("MainController Running");
        TU = new TerminalUser();
        PU = new PhysicalUser();
    }
}
