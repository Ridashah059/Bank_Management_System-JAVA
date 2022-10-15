import javax.swing.*;

public class MainMenu {
    private int option;
    public void mainMenu() {
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Bank Management System\n" +
                            "\nSELECT FROM THIS MENU\n" +
                            "\n1. All Accounts Details" +
                            "\n2.  Search by Id Details" +
                            "\n3.  Withdraw Amount" +
                            "\n4.  Deposit the Amount" +
                            "\n5.  Check Balance" +
                            "\n6.  Exit" +
                            "\n\n Enter Your Choice \n",
                    "Bank Management System", JOptionPane.INFORMATION_MESSAGE));
            switch (option) {
                case 1:
                    AccountDetails.accountsDetails();
                    break;

                case 2:
                    IdDetails.IdDetails();
                    break;
                case 3:
                    WithdrawAmount.withdrawAmount();
                    break;
                case 4:
                    DepositAmount.depositAmount(null);
                    break;
                case 5:
                    CheckBalance.checkBalance();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Thank You For Using");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid Option");
            }
        } while (option != 6);
    }
}