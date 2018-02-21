import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /**
     * You may want to use this to distinguish between different kinds of accounts.

     *
     */
    public enum BankAccountType {
        /**
         *
         */
        CHECKINGS,
        /**
         *
         */
        SAVINGS,
        /**
         *
         */
        STUDENT,
        /**
         *
         */
        WORKPLACE
    }

    /**
     *
     */
    private int accountNumber;
    /**
     *
     */
    public int getAccountNumber(){
        return accountNumber;
    }
    /**
     * @param accountNum the of the account
     */
    public void setAccountNumber(final int accountNum){
        this.accountNumber = accountNum;
    }
    /**
     *
     */
    private BankAccountType accountType;
    /**
     *
     */
    public BankAccountType getAccountType(){
        return accountType;
    }
    /**
     * @param accTy the of the account
     */
    public void setAccountType(final BankAccountType accTy){
        this.accountType = accountType;
    }
    /**
     *
     */
    private double accountBalance;
    /**
     *
     */
    public double getAccountBalancer(){
        return accountBalance;
    }
    /**
     * @param accountBal the of the account
     */
    public void setAccountBalance(final int accountBal){
        this.accountBalance = accountBal;
    }
    /**
     *
     */
    private String ownerName;
    /**
     *
     */
    private double interestRate;
    /**
     *
     */
    public double getInterestRate(){
        return interestRate;
    }
    /**
     * @param interestRat the of the account
     */
    public void setInterestRate(final int interestRat){
        this.interestRate = interestRat;
    }
    /**
     *
     */
    private double interestEarned;
    /**
     *
     */
    public double getInterestEarned(){
        return interestEarned;
    }
    /**
     * @param interestEarn the of the account
     */
    public void setInterestEarned(final int interestEarn){
        this.interestEarned = interestEarn;
    }

    /**
     *
     * @param name the n
     * @param accountCategory the aC
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
}
