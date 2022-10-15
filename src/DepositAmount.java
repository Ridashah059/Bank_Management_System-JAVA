import javax.swing.*;

public class DepositAmount extends AccountsData{
    static int option;
    static int amount;

    public static void depositAmount(String[] args) {
        option = Integer.parseInt(JOptionPane.showInputDialog("Enter the user Id: "));
        amount = Integer.parseInt(JOptionPane.showInputDialog("Enter user Amount: "));
        salary[option] += amount;
        JOptionPane.showMessageDialog(null,
                "Account Details\n\n" +
                        "Id:  " + id[option] +
                        "\nName:  " + name[option] +
                        "\nAmount:  " + salary[option],
                "Deposit Amount", JOptionPane.INFORMATION_MESSAGE);
    }
}