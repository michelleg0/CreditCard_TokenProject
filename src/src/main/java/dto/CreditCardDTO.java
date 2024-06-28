package main.java.dto;

public class CreditCardDTO {

    //The CC number should be string since this would be a long integer.
    private String creditCardNumber;
    private byte expirationMonth;
    private byte expirationYear;
    private String cvv;

    public CreditCardDTO(String creditCardNumber, byte expirationMonth,
                         byte expirationYear, String cvv){
        this.creditCardNumber = creditCardNumber;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.cvv = cvv;

    }

}
