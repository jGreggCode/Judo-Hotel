package judo.hotel;

// Imports
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Reservation {
    
    // Encapsulation here can be applied to encapsulate the contact information and the methods for sending that information.
    
    // Encapsulated data fields
    private String fullName;
    private String email;
    private String number;
    private String address;
    private String city;
    private String room;
    private String date;
    private String hour;
    private int people;
    
    private String[] fields;

    // Constructor to initialize the object
    public Reservation(String fullName, String email, String number, String address, String city, String room, String date, String hour, int people) {
        fields = new String[]{fullName, email, number, address, city, room, date, hour};
        
        // Validation
        if (containsNull(fields)) {
            throw new IllegalArgumentException("Fields cannot be empty");
        }

        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email address");
        }
        
        validateDate(date);
        
        this.fullName = fullName;
        this.email = email;
        this.number = number;
        this.address = address;
        this.city = city;
        this.room = room;
        this.date = date;
        this.hour = hour;
        this.people = people;
    }

    // Getter methods to access the encapsulated data
    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }
    
    
    public String getAddress() {
        return address;
    }
    
    
    public String getCity() {
        return city;
    }
    
    
    public String getRoom() {
        return room;
    }
    
    
    public String getDate() {
        return date;
    }
    
    
    public String getHour() {
        return hour;
    }
    
    
    public int getPeople() {
        return people;
    }
    
     // Method to send contact information
    public void sendReservation() {
        JOptionPane.showMessageDialog(null, "Thank you Sir/Ma'am. " + fullName + ", Your reservation is being process. Our staff will get back to you shortly.", "Reservation", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private boolean isValidEmail(String email) {
        return email.contains("@");
    }
    
    private boolean containsNull(String[] array) {
        
        for (String value : array) {
            System.out.println(value);
            if (value == null || value.equalsIgnoreCase("")) {    
                return true;
            }
        }
        
        return false;
    }
    
    private void validateInput(String value, String fieldName) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(fieldName + " cannot be null or empty");
        }
    }
    
    private void validateDate(String date) {
        validateInput(date, "Date");

        try {
            // Try parsing the date using SimpleDateFormat
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateFormat.setLenient(false);
            Date parsedDate = dateFormat.parse(date);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Date format should be yyyy-MM-dd (Ex: 2023-12-13)");
        }
    }
    
}
