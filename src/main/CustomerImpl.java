package main;

import data.Customer;

public class CustomerImpl {
    public static void main(String[] args) {

        Customer Obj1=new Customer();
        Obj1.displayCustomer();
        System.out.println();

        Customer obj2=new Customer("","","",0,false);
        obj2.displayCustomer();

    }
}
