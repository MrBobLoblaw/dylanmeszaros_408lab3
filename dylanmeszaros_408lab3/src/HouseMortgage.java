public class HouseMortgage extends Loan {

    public HouseMortgage(){

        this.setLoanType("House mortgage");
        this.setInterestRate(1);

    }

    @Override
    public String toString() {

        return String.format("Loan type: {0}, Interest rate: {1}, Amount: {2}, Total: {3}",
                this.getLoanType(), this.getInterestRate(), this.getAmount(), this.getAmount() * (1 + (this.getInterestRate() / 100)));

    }

}
