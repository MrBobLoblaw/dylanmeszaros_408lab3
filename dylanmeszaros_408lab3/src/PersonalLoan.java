public class PersonalLoan extends Loan {

    public PersonalLoan(){

        this.setLoanType("Personal loan");
        this.setInterestRate(4);

    }

    @Override
    public String toString() {

        return String.format("Loan type: {0}, Interest rate: {1}, Amount: {2}, Total: {3}",
                this.getLoanType(), this.getInterestRate(), this.getAmount(), this.getAmount() * (1 + (this.getInterestRate() / 100)));

    }


}
