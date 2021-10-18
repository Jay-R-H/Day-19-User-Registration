package com.programming;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationImpl {
    /**
     * Validation of the user entered fisrt name is donr using regex
     * Name should begin with a capital letter
     * The name should at-least contain 3 letters
     */

    public boolean validateFirstName(String firstName) {
        String regexName = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regexName);

        if (firstName.isEmpty()) {
            return false;
        }
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    public void validateUserDetails() {
        Scanner scanner = new Scanner(System.in);
        UserRegistrationDetails userRegistrationDetails = new UserRegistrationDetails();
        UserRegistrationImpl userRegistration = new UserRegistrationImpl();

        System.out.println("Enter your first name ");
        userRegistrationDetails.setFirstName(scanner.next());

        boolean flag = userRegistration.validateFirstName(userRegistrationDetails.getFirstName());
        if (flag == true) {
            System.out.println("Valid input");
        } else {
            System.out.println("Invalid input");
        }
    }
}
