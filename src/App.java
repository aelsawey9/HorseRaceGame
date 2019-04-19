import javax.swing.SwingUtilities;

public class App  implements Runnable {
    private MainMenu menu;
    private OptionsPanel mainOptions;
    public static void main(String[] args) throws Exception {
        var app = new App();
        //SwingUtilities.invokeLater(this);
    }

    public App() {
        run();
    }

    public void setMain(MainMenu menu) {
        this.menu = menu;
    }

    @Override
    public void run() {
        this.menu = new MainMenu();
    }
}