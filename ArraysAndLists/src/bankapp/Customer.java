/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapp;
import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;
    
    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
    }
    
    public void makeDeposit(Double deposit) {
        this.transactions.add(deposit);
    }
    
    //Assuming we are withdrawaing 
    public void makeWithdrawal(Double withdrawal) {
        this.transactions.add(-1*withdrawal);
    }
}
