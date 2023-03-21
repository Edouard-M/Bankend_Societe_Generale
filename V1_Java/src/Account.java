import java.util.Vector;

public class Account {

    private float balance;
    private Client client;
    private Vector<Operation> statement;

    Account(Client accountClient){
        this.balance = 0;
        this.client = accountClient;
        this.statement = new Vector<Operation>();
    }

    public float deposit(float amount){
        if(amount > 0){
            this.balance += amount;
        }

        return this.balance;
    }

    public float withdrawal(float amount){
        // Verify that the client has enough in the balance
        if(((this.balance - amount) >= 0) && (amount > 0)){
            this.balance -= amount;
            return balance;
        }
        else
            return -1; // If the withdrawal is impossible
    }

    public float get_balance(){
        return this.balance;
    }

    public Client get_client(){
        return this.client;
    }

    public Vector<Operation> get_statement(){
        return this.statement;
    }
}