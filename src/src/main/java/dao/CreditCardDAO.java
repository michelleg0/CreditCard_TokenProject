package main.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import main.java.dto.CreditCardDTO;
import main.java.utility.CreditCardTokenizer;
import main.java.utility.DatabaseConnection;

public class CreditCardDAO {
    public void insertCreditCard(CreditCardDTO creditCard) {
        String sql = "INSERT INTO credit_card (credit_card_token, last_four_cc_digits, expiration_month, expiration_year, customer_id, payment_processor_id) VALUES (?, ?, ?, ?, ?, ?)";

        String token = CreditCardTokenizer.tokenize(creditCard.getCreditCardNumber());
        String lastFourDigits = creditCard.getCreditCardNumber().substring(creditCard.getCreditCardNumber().length() - 4);

        //try-resource
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, token);
            stmt.setString(2, lastFourDigits);
            stmt.setByte(3, creditCard.getExpirationMonth());
            stmt.setByte(4, creditCard.getExpirationYear());
            stmt.setInt(5, creditCard.getCustomerId());
            stmt.setInt(6, creditCard.getPaymentProcessorId());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
