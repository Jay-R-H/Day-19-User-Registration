package com.programming;

import com.programming.UserRegistrationDetails;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationImpl {
    /**
     * Validation of the user entered fisrt name is donr using regex
     * Name should begin with a capital letter
     * The name should at-least contain 3 letters
     */

    public boolean validateName(String Name) {
        String regexName = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regexName);

        if (Name.isEmpty()) {
            return false;
        }
        Matcher matcher = pattern.matcher(Name);
        return matcher.matches();
    }

    public void validateUserDetails() {
        Scanner scanner = new Scanner(System.in);
        UserRegistrationDetails userRegistrationDetails = new UserRegistrationDetails();
        UserRegistrationImpl userRegistration = new UserRegistrationImpl();

        System.out.println("Enter your first name: ");
        userRegistrationDetails.setFirstName(scanner.next());

        boolean flagFName = userRegistration.validateName(userRegistrationDetails.getFirstName());
        if (flagFName) {
            System.out.println("Valid input");
        } else {
            System.out.println("Invalid input");
        }

        System.out.println("Enter your last name: ");
        userRegistrationDetails.setLastName(scanner.next());

        boolean flagLName = userRegistration.validateName(userRegistrationDetails.getLastName());
        if (flagLName) {
            System.out.println("Valid input");
        } else {
            System.out.println("Invalid input");
        }
    }
}

