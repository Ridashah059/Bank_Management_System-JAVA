import javax.swing.*;

public class AccountDetails extends AccountsData{
    int option;

    public static void accountsDetails() {
        JOptionPane.showMessageDialog(null,
                "All Accounts Details\n\nAccounts User Id and Names\n\n" + "Id: " + id[0] + "      Name: " + name[0]
                        + "\n\nId: " + id[1]
                        + "      Name: " + name[1] + "\n\nId: " + id[2] + "      Name: " + name[2] + "\n\nId: " + id[3]
                        + "      Name: " + name[3] + "\n\nId: " + id[4] + "      Name: " + name[4] + "\n\nId: " + id[5]
                        + "      Name: " + name[5] + "\n\nId: " + id[6] + "      Name: " + name[6] + "\n\nId: " + id[7]
                        + "      Name: " + name[7] + "\n\nId: " + id[8] + "      Name: " + name[8] + "\n\nId: " + id[9]
                        + "      Name: " + name[9],
                "Customers Data", JOptionPane.INFORMATION_MESSAGE);
    }
}
