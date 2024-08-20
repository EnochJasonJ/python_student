import java.util.Scanner;

public class Bank{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount b1 = new BankAccount();
        System.out.println("Welcome to Java Bank!");
        while (true){
            System.out.println("\n1.Create Account\n2.See Name\n3.See Balance\n4.Deposit\n5.Withdraw\n6.Quit");
            System.out.print("Your Choice: ");
            int choice = input.nextInt();
            switch (choice){
                case 1 -> {
                    System.out.print("Name: ");
                    input.nextLine();
                    String name = input.nextLine();
                    System.out.print("Initial Balance: ");
                    float Balance = input.nextFloat();
                    b1 = new BankAccount(name,Balance);
                    System.out.print("Account created for "+name+" Successfully!");
                    break;
                }
                case 2 -> {
                    b1.getname();
                    break;
                }
                case 3 -> {
                    b1.getbalance();
                    break;
                }
                case 4 -> {
                    System.out.print("Amount: ");
                    float amount = input.nextFloat();
                    b1.deposit(amount);
                    break;
                }
                case 5 -> {
                    System.out.print("Amount : ");
                    float amount = input.nextFloat();
                    b1.withdraw(amount);
                    break;
                }
                case 6 -> {
                    System.out.println("Thank you for using Java Bank!");
                    System.out.println("Bank Closed");
                    input.close();
                    System.exit(0);
                    break;
                }
                default -> {
                    System.out.println("An error has occured! Cannot process your request!");
                }
            }
        }
    }
}
class BankAccount{
    private String name;
    private float Balance;
    BankAccount(){}
    BankAccount(String name, float Balance){
        this.name = name;
        this.Balance = Balance;
    }
    void getname(){
        System.out.print("Name: "+name);
    }
    void getbalance(){
        System.out.print("Balance: $"+Balance);
    }
    void deposit(float amount){
        Balance += amount;
        System.out.println("$"+amount+" Deposited Successfully!");
        System.out.print("Balance: $"+Balance);
    }
    void withdraw(float amount){
        if (amount < Balance){
            Balance -= amount;
            System.out.println("$"+amount+" Withdrawed Successfully!");
            System.out.print("Balance: $"+Balance);
        }
        else{
            System.out.println("Insufficient Balance!");
        }
    }
}