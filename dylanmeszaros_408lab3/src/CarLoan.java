public class CarLoan extends Loan {

    public CarLoan(){

        this.setLoanType("Car loan");
        this.setInterestRate(3);

    }

    @Override
    public String toString() {

        return String.format("Loan type: {0}, Interest rate: {1}, Amount: {2}, Total: {3}",
                this.getLoanType(), this.getInterestRate(), this.getAmount(), this.getAmount() * (1 + (this.getInterestRate() / 100)));

    }

}
