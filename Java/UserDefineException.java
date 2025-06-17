
class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }
}

class BankAccount{
    private double balance;
    public BankAccount(double amount){
        if(amount<0)
            this.balance=0;
        else
            this.balance=amount;
    }
    public double getBalance(){
        System.out.println("Current Balance: "+this.balance);
        return this.balance;
    }
    
    public void deposit(double amount) throws InsufficientBalanceException{
        if(amount<=0){
            throw new InsufficientBalanceException("Invalid Amount.");
        }
        this.balance+=amount;
        System.out.println("Deposit Successfull.");
    }
    public void withdraw(double amount) throws InsufficientBalanceException{
        if(amount<0)
            throw new InsufficientBalanceException("Invalid Amount");
        if(amount>this.balance){
            throw new InsufficientBalanceException("Insufficient Amount.");
        }

        this.balance-=amount;
        System.out.println("Withdraw Successfull.");
    }
    public static void main(String[] args) {
        BankAccount myaccount=new BankAccount(1000.0);
        try{
        myaccount.deposit(1500);
        myaccount.getBalance();
        myaccount.withdraw(3000);
        myaccount.getBalance();
        }
        catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }

    }
}