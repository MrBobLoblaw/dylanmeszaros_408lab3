import java.util.Objects;

public class Loan {



    private String loanType;
    private int interestRate = 0;
    private int amount;

    public Loan(){

        this.loanType = "";
        this.interestRate = 0;
        this.amount = 0;

    }

    public Loan(String loanType, int interestRate, int amount){

        this.loanType = loanType;
        this.interestRate = interestRate;
        this.amount = amount;

    }

    public String getLoanType() {return this.loanType;}

    public void setLoanType(String loanType) {

        this.loanType = loanType;

    }

    public double getInterestRate() { return this.interestRate; }

    public void setInterestRate(int interestRate) { this.interestRate = interestRate; }

    public int getAmount() {return this.amount;}

    public void setAmount(int amount) {

        if (amount <= 0 || amount > 300000) {

            throw new IllegalArgumentException("Amount must be greater than 0 and no more than 300000");

        }

        this.amount = amount;

    }



    // return String representation of Loan object
    public String toString() {

        return String.format("Loan type: {0}, Amount: {2}", this.loanType, this.amount);

    }

}
