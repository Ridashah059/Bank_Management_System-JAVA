import javax.swing.JOptionPane;
class MainMenu {
    private int option = 0;
    private String inputUser;
    public void mainMenu() {
        do {
            inputUser = JOptionPane.showInputDialog(null,
                    "Bank Management System\n" +
                            "\nSELECT FROM THIS MENU\n" + 
                            "\n1. All Accounts Details\n" +
                            "2.  Search by Id Details\n" +
                            "3.  Withdraw Amount\n" +
                            "4.  Deposit the Amount\n" +
                            "5.  Check Balance\n" +
                            "6.  Exit" + 
                            "\n\n Enter Your Choice \n",
                    "Bank Management System", JOptionPane.INFORMATION_MESSAGE);
            if(inputUser != null) {
                option = Integer.parseInt(inputUser);
                switch (option) {
                    case 1:
                        AllAccountsDetails.accountsDetails();
                        break;

                    case 2:
                        SearchbyIdDetails.searchbyIdDetails();
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
            }
            else{
                JOptionPane.showMessageDialog(null, "Thank You For Using Bank Management System");
                break;
            }
        } while (option != 6);
    }
}
