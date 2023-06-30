import java.io.IOException;

import interfaz.MainWindow;

public class Main {

    public static void main(String[] args) throws IOException {

        try {
            MainWindow window = new MainWindow();
            window.setVisible(true);
        }
        catch(IOException e) {
        }

    }

}
