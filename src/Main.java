public class BankManagementSystem extends Thread {
    public static void main(String[] args) {
        BankManagementSystem thread = new BankManagementSystem();
        thread.start();
    }
    public void run() {
        MainMenu ob = new MainMenu();
        ob.mainMenu();
    }
}
