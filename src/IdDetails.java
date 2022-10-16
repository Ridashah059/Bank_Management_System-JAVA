import javax.swing.*;

// Search by ID Details Class

class SearchbyIdDetails extends AccountsData {

    static int option;

    public static void searchbyIdDetails() {
        option = Integer.parseInt(JOptionPane.showInputDialog("Enter the user Id from 0 to 9:  "));

        if (option >= 0 && option <= 9) {
            JOptionPane.showMessageDialog(null,
                    "Account Details\n\n" +
                            "Id:  " + id[option] +
                            "\nName:  " + name[option] +
                            "\nAccount Type:  " + acountType[option],
                    "AccountsDetails", JOptionPane.INFORMATION_MESSAGE);
        } else {
            option = Integer.parseInt(JOptionPane.showInputDialog("Wrong Input\n\nEnter the user Id from 0 to 9:  "));
            JOptionPane.showMessageDialog(null,
                    "Account Details\n\n" +
                            "Id:  " + id[option] +
                            "\nName:  " + name[option] +
                            "\nAccount Type:  " + acountType[option],
                    "AccountsDetails", JOptionPane.INFORMATION_MESSAGE);

        }

    }
}
