package main.java.dto;

//Declaring class

public class CustomerDTO {

    private String firstName;
    private String lastName;
    private String email;

    private CreditCardDTO creditCard;

    //The syntax is similar to declaring a variable. A class is a custom data type
    //This is how you link two classes
    //CreditCard is upper camel case since it is a class
    //String is a special data type since it is  a built in class for Java


    //Create constructor. A constructor is a special method that is called when an object is initiated.
    //Must be the same as the class name.
    public CustomerDTO(String firstName, String lastName, String email, CreditCardDTO creditCard) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.creditCard = creditCard;


    }

    public void printCustomer() {
        System.out.println("Customer First Name: " + this.firstName);
        System.out.println("Customer Last Name: " + this.lastName);
        System.out.println("Customer Email: " + this.email);

    }
}