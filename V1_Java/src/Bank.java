
import java.util.Vector;

public class Bank {

    private String bankName;
    private Vector<Account> accounts;
    private Vector<Client> clients;

    Bank(String bank_name){
        this.bankName = bank_name;
        this.accounts = new Vector<Account>();
        this.clients = new Vector<Client>();
    }

    public String get_bankName(){
        return bankName;
    }

}
