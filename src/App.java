import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainMenu menu = new MainMenu(); //calling my main menu class and its constrcutor to start the program
            }

        });


    }
}