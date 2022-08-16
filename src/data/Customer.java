package data;

public class Customer {
    private String name;
    private String address;
    private String email;
    private long mobile;
    private boolean premiumMembership;
    public Customer(){

        name="";
        address="";
        email="";
        mobile=0;
        premiumMembership=false;
    }
    public Customer(String name, String address, String email, long mobile, boolean premiumMembership){
        name=name;
        address=address;
        email=email;
        mobile=mobile;
        premiumMembership=premiumMembership;
    }

    public void displayCustomer(){

        System.out.println("name = " + name);
        System.out.println("address = " + address);
        System.out.println("email = " + email);
        System.out.println("mobile = " + mobile);
        System.out.println("premiumMembership = " + premiumMembership);

    }

}
