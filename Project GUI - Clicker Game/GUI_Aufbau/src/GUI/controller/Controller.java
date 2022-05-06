package GUI.controller;

/*

 */

import GUI.model.Model;
import GUI.view.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    //Classes
    private Model model;
    private View view;

    public static void main(String[] args) {
        new Controller();
    }

    public Controller() {
        //View
        view = new View();

        //Model
        model = new Model();

        //Action Listener Adds
        view.getbButton().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {

            if (e.getActionCommand().equals("TEST_BUTTON")) {

                //Hier Übergibst du die Klasse die du oben erstellt hast. (view)
                model.Klick(view);
            }

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }
}
