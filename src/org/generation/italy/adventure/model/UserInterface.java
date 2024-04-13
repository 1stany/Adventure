package org.generation.italy.adventure.model;

import java.util.Scanner;
import static java.lang.System.*;

public class UserInterface {
    private Scanner console = new Scanner(System.in);

    public void showMessage(String message){
        out.println(message);
    }

    public String readCommand(){
        return console.nextLine();
    }

    public void showPrompt(){
        out.print("->");
    }
}
