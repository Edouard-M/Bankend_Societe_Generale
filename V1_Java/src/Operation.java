import java.util.Date;

public class Operation {

    private String operationType;
    private Date date;
    private float amount;
    private float balance;

    Operation(String newOperationType, float newAmount, float newBalance){
        this.operationType = newOperationType;
        this.amount = newAmount;
        this.balance = newBalance;
        this.date = new Date();
    }

    public String toString()
    {
        return ("Operation Type : " + this.operationType + "\n" + 
                "Date : " + this.date.toString() + "\n" + 
                "Amount : " + this.amount + "\n" + 
                "Balance : " + this.balance + "\n");
    }

}
