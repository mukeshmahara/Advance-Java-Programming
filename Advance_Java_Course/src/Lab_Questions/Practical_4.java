/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_Questions;

/**
 *
 * @author Dell
 */
class Account{
    String id;
    String name;
    int balance =0;
    
    Account(String id,String name){
        this.id = id;
        this.name = name;
    }
    
    Account(String id,String name, int balance){
        this.id = id;
        this.name =name;
        this.balance = balance;
        
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    
    public int credit_amount(int amount){
        balance = amount+balance;
        
        return balance;
    }
    
    public int debit_amount(int amount){
        balance =  balance-amount;
        return balance;
    }
    
    public int tranfer_to(String account,int amount){
        if (amount<=balance) {
            balance= balance -amount;
            return balance;
            
        } else {
            System.out.println("Amount Exceet the balance..!!unable to transfer");
        }
        return balance;
        
    }
}

public class Practical_4 {
    
    public static void main(String[] args){
        
        Account a = new Account("mbm_acc","AJ",50000);
        
        System.out.println("Account id :"+a.getId());
        System.out.println("Account name :"+a.getName());
        System.out.println("Account _balance:"+a.getBalance());
        
        int balance_afterdebit = a.debit_amount(16000);
        System.out.println("balance after withdraw  :"+balance_afterdebit);;
        
        int balance_afterCredit = a.credit_amount(4000);
        System.out.println("balance After Credit  :"+balance_afterCredit);
        a.tranfer_to("mukesh", 6000);
        
        System.out.println(a.toString());
        
        
    }
}
