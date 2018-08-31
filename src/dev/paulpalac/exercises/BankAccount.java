package dev.paulpalac.exercises;

public class BankAccount {
    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;
    private static double limit = 100;

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Juan dela Cruz", "juan@gmail.com", "+63 222-9234",
                1_455_454_548, 1000);

        acc.deposit(500);
        acc.withdraw(1200);
        acc.withdraw(500);

        System.out.println(acc.getAccountNumber());
        System.out.println(acc.getCustomerName());
        System.out.println(acc.getEmail());
        System.out.println(acc.getPhoneNumber());

        /*BankAccount a = new BankAccount();
        System.out.println(a.getAccountNumber());
        System.out.println(a.getCustomerName());
        System.out.println(a.getEmail());
        System.out.println(a.getPhoneNumber());*/

    }

    public BankAccount(){
        this("NO NAME", "NO EMAIL", "NO PHONE",
                1000000L, 0);
        System.out.println("No new account made.");
    }

    private BankAccount(String customerName, String email, String phoneNumber,
                       long accountNumber, double balance){
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    private void deposit(double deposit){
        this.balance = this.balance + deposit;
        setBalance(this.balance);
        System.out.println("Deposit of " + deposit +" made."
                +" New Balance is " +this.balance);
    }

    private void withdraw(double withdraw){
        if(this.balance >= (limit+withdraw)){
            this.balance = this.balance - withdraw;
            setBalance(this.balance);
            System.out.println("Withdraw of " +withdraw +" made."
                +" New Balance is " +this.balance);
        }else{
            System.out.println("Only " +this.balance +" is available."
                    +" Withdrawal not processed.");
        }
    }

    private long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    private String getCustomerName() {
        return customerName;
    }

    private void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    private String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
