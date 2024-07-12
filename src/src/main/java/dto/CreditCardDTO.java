package main.java.dto;

public class CreditCardDTO {

    //The CC number should be string since this would be a long integer.

    private String creditCardNumber;
    private byte expirationMonth;
    private byte expirationYear;
    private String cvv;
    private int customerId;
    private int paymentProcessorId;

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public byte getExpirationMonth() {
        return expirationMonth;
    }

    public void setExpirationMonth(byte expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    public byte getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(byte expirationYear) {
        this.expirationYear = expirationYear;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getPaymentProcessorId() {
        return paymentProcessorId;
    }

    public void setPaymentProcessorId(int paymentProcessorId) {
        this.paymentProcessorId = paymentProcessorId;
    }

    public CreditCardDTO(String creditCardNumber, byte expirationMonth,
                         byte expirationYear, String cvv, int customerId, int paymentProcessorId){
        this.creditCardNumber = creditCardNumber;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.cvv = cvv;
        this.customerId = customerId;
        this.paymentProcessorId = paymentProcessorId;


    }

}
