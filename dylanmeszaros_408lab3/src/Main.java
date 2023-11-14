import java.text.MessageFormat;
import java.util.*;

public class Main {

    public static List<Loan> listOfLoans = new ArrayList<Loan>();

    public static void main(String[] args) {

        //List<? extends Loan> listOfLoans = new ArrayList<>();

        boolean appExit = false;

        final int ONE = 1;
        final int TWO = 2;
        final int THREE = 3;
        final int FOUR = 4;

        Scanner scanner = new Scanner(System.in);

        do{

            System.out.println("   1.  Disburse a Loan\n   2.  Show the list of all loans\n   3.  Show sum of all loans\n   4.  Exit\n");
            int option1 = scanner.nextInt();

            switch (option1){

                case ONE:
                    // Disburse
                    boolean optExit = false;

                    System.out.print("\n\n");

                    do{

                        System.out.println("Select the loan type:\n   1.  House mortgage\n   2.  Car loan\n   3.  Personal loan\n");
                        int option2 = scanner.nextInt();

                        System.out.print("\n\n");

                        switch (option2){

                            case ONE:
                                // House mortgage
                                HouseMortgage newLoan = new HouseMortgage();

                                System.out.println(MessageFormat.format("Starting a new {0}. Current interest rate {1}%",
                                        newLoan.getLoanType(), newLoan.getInterestRate()));
                                System.out.print("Enter the amount of the loan: ");

                                int amount = scanner.nextInt();
                                newLoan.setAmount(amount);

                                listOfLoans.add(newLoan);

                                System.out.println("Loan disbursed\n\n");

                                optExit = true;

                                break;
                            case TWO:
                                // Car loan
                                CarLoan newLoan2 = new CarLoan();

                                System.out.println(MessageFormat.format("Starting a new {0}. Current interest rate {1}%",
                                        newLoan2.getLoanType(), newLoan2.getInterestRate()));
                                System.out.print("Enter the amount of the loan: ");

                                int amount2 = scanner.nextInt();
                                newLoan2.setAmount(amount2);

                                listOfLoans.add(newLoan2);

                                System.out.println("Loan disbursed\n\n");

                                optExit = true;

                                break;
                            case THREE:
                                // Personal loan
                                PersonalLoan newLoan3 = new PersonalLoan();

                                System.out.println(MessageFormat.format("Starting a new {0}. Current interest rate {1}%",
                                        newLoan3.getLoanType(), newLoan3.getInterestRate()));
                                System.out.print("Enter the amount of the loan: ");

                                int amount3 = scanner.nextInt();
                                newLoan3.setAmount(amount3);

                                listOfLoans.add(newLoan3);

                                System.out.println("Loan disbursed\n\n");

                                optExit = true;

                                break;
                            default:
                                // House mortgage
                                System.out.println("Invalid option");
                                break;

                        }

                    } while (!optExit);


                    break;
                case TWO:
                    // Show List

                    System.out.format( "\n%-14s  %-6s  %-6s", "Type", "Amount", "Amount owed" );
                    if (!listOfLoans.isEmpty()) {

                        for (Loan loan : listOfLoans){

                            System.out.format( "\n%-14s  %-6s  %-6s",
                                    loan.getLoanType(),
                                    "$" + loan.getAmount(),
                                    "$" + (int)( loan.getAmount() * ( 1 + ( loan.getInterestRate() / 100 ) ) ) );

                        }

                    }
                    else {

                        System.out.println("no loans");

                    }

                    System.out.print("\n\n");

                    break;
                case THREE:
                    // Show Sum

                    System.out.format( "\n%-6s   %-6s", "Amount", "Amount owed" );

                    if (!listOfLoans.isEmpty()) {

                        int amount = 0;
                        int amountOwed = 0;

                        for (Loan loan : listOfLoans){

                            amount += loan.getAmount();
                            amountOwed += (int)( loan.getAmount() * ( 1 + ( loan.getInterestRate() / 100 ) ) );

                        }

                        System.out.format( "\n%-6s  %-6s", "$" + amount, "$" + amountOwed );

                    }
                    else {

                        System.out.println( "no loans" );

                    }

                    System.out.print("\n\n");

                    break;
                case FOUR:
                    // Exit
                    appExit = true;
                    break;
                default:
                    // code block
                    break;

            }

        } while (!appExit);

    }

}