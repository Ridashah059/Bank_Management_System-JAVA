import javax.swing.*;

class CheckBalance extends AccountsData {

    static int option;

    public static void checkBalance() {
        option = Integer.parseInt(JOptionPane.showInputDialog("Enter the user Id: "));
        JOptionPane.showMessageDialog(null,
                "Check Balance" +
                        "\n\nId:   " + id[option] +
                        "\nName:   " + name[option] +
                        "\nAmount:   " + salary[option],
                "Check Balance", JOptionPane.INFORMATION_MESSAGE);
    }
}
