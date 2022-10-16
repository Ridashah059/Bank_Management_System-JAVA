import javax.swing.*;

class WithdrawAmount extends AccountsData {
    static int option;
    static int amount;
    public static void withdrawAmount() {
        option = Integer.parseInt(JOptionPane.showInputDialog("Enter the user Id: "));
        amount = Integer.parseInt(
                JOptionPane.showInputDialog("Account Details\n\n" +
                        "Id:  " + id[option] +
                        "\nName:  " + name[option] +
                        "\nAmount:  " + salary[option] +
                        "\n\n\nEnter user Amount to Withdraw: "));
        salary[option] -= amount;
        JOptionPane.showMessageDialog(null,
                "Account Details\n\n" +
                        "Id:  " + id[option] +
                        "\nName:  " + name[option] +
                        "\nAmount:  " + salary[option],
                "Deposit Amount", JOptionPane.INFORMATION_MESSAGE);
    }
}
