public class App {
    private MainMenu menu;

    public App() {
        this.menu = new MainMenu();
        this.menu.getOptionsPanel().setMain(this.menu);
    }
}