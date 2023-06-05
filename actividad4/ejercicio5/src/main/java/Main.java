import interfaz.MainWindow;
import clases.Persona;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class Main {


    public static void main(String[] args) {

        MainWindow window = new MainWindow();
        window.setVisible(true);

        DefaultListModel<Persona> personas = new DefaultListModel<Persona>();
        window.lista_personas.setModel(personas);

        window.personas = personas;
        window.add_window.personas = personas;

    }
}
