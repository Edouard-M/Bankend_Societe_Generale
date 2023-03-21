import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        Bank myBank = new Bank("Societe Generale");
        Account account = null;
        Client client = null;
        int userInput = 0;
        String name = "";

        // Main Menu in order to connect to an client account
        do{
            showConnectionMenu();
            userInput = scan.nextInt();

            switch(userInput){
                case 0 :
                    System.out.println("Goodbye");
                break;

                case 1 :
                    System.out.println("Please tape your name to create a client : ");
                    name = scan.next();
                    client = myBank.addClient(name);
                    if(client != null){
                        account = myBank.createAccount(client);
                        if(account != null)
                            accountMenu(scan, account);
                    }
                    else
                        System.out.println("Your account already exist\n");
                break;

                case 2 :
                    System.out.println("Please tape your name to login :");
                    name = scan.next();
                    client = myBank.get_client(name);
                    if(client != null){
                        account = myBank.get_account(client);
                        if(account != null)
                            accountMenu(scan, account);
                    }
                    else
                        System.out.println("Your account doesn't exist, try to create an account\n");
                break;
            }

        }while(userInput != 0);

        scan.close();
    }

    // Account Menu Once Logged
    public static void accountMenu(Scanner scan, Account account){
        int userInput = 0;
        float amount = 0;
        float balance = 0;
        
        do{
            showAccountMenu(account.get_balance());
            userInput = scan.nextInt();

            switch(userInput){
                case 0 :
                    System.out.println("Goodbye");
                break;

                case 1 :
                    System.out.println("Please enter the amount : ");
                    amount = scan.nextFloat();
                    balance = account.deposit(amount);
                    System.out.println("Your current balance = " + balance + "\n");
                break;

                case 2 :
                    System.out.println("Please enter the amount to withdraw : ");
                    amount = scan.nextFloat();
                    balance = account.withdrawal(amount);
                    if(balance == -1)
                        System.out.println("You can't withdraw this amount");
                    else
                        System.out.println("Your current balance = " + balance + "\n");
                break;

                case 3 :
                    System.out.println("Your account statement :\n");
                    account.show_statement();
                break;
            }
        }while(userInput != 0);
    }

    public static void showConnectionMenu(){
        System.out.println("\n---------- Connection Menu ----------");
        System.out.println("0 : Exit");
        System.out.println("1 : New Client");
        System.out.println("2 : Already Client");
    }

    public static void showAccountMenu(float balance){
        System.out.println("\n---------- Account Menu ----------");
        System.out.println("Your actual balance : " + balance);
        System.out.println("0 : Log Out");
        System.out.println("1 : Deposit");
        System.out.println("2 : Withdrawal");
        System.out.println("3 : Show Account Statement");
    }
}