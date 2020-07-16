import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.String;


public class Account {
        private int id = 0;
        private double balance = 0;
        private double annualInterestRate = 0;
        Date dateCreated = new Date();
        Account(int id, double balance){
                this.id = id;
                this.balance = balance;
        }

        public int getId(){
            return id;
        }
        public int setId (int id){
            return this.id = id;
        }
        public double getBalance(){
            return balance;
        }
        public double setBalance(double balance){
            return  this.balance = balance;
        }
        public double getAnnualInterestRate(){
            return annualInterestRate;
        }
        public double setAnnualInterestRate(double annualInterestRate){
                return  this.annualInterestRate = annualInterestRate;
        }

        public Date getDateCreated(){
            return dateCreated;
        }

        double getMonthlyInterest(){

            return (annualInterestRate/100)/12;
        }
        double withdraw(double amount){
            return this.balance -= amount;

        }
        double deposit(double amount){
            return this.balance += amount;
        }


    public static void main(String[] args) {



            Account acc =  new Account(1122, 2000);
            System.out.println(acc.dateCreated);
            System.out.println("balance" + acc.getBalance());
            acc.withdraw(2000);
            System.out.println("withdraw" + acc.getBalance());
            acc.deposit(3000);
            System.out.println("balance after deposit " +  acc.getBalance());
    }




}
