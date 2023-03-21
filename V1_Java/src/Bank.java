
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

    // Add a client if doesn't already exist
    public Client addClient(String clientName){
        Client newClient = this.get_client(clientName);

        if(newClient == null){
            newClient = new Client(clientName);
            clients.add(newClient);
            return newClient;
        }
        else
            return null;
    }

    // Find a client
    public Client get_client(String clientName){
        // Search if the client is in the list
        for(int i = 0 ; i < clients.size() ; i++)
        {
            if(clients.get(i).get_name().equals(clientName))
                return clients.get(i);
        }
        return null;
    }
}
