package com.bridgelabz.user;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
    private static final String EMAIL_PATTERN = "^[a-z0-9]{3,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
    private static final String PHONE_PATTERN = "^[9]{1}[1]{1}[ ]?[6-9]{1}[0-9]{9}$";
    private static final String PASSWORD_PATTERN = "^(?=.{8,}$)(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*\\W).*$";

    public boolean validateFirstName(String fname) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        if (Pattern.matches(NAME_PATTERN, fname) == true)
            return Pattern.matches(NAME_PATTERN, fname);
        else {
            throw new UserRegistrationException("Send proper FirstName");
        }
    }

    public boolean validateLastName(String lName) throws UserRegistrationException {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        if (Pattern.matches(NAME_PATTERN, lName) == true)
            return Pattern.matches(NAME_PATTERN, lName);
        else {
            throw new UserRegistrationException("Send proper LastName");
        }
    }

    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return Pattern.matches(EMAIL_PATTERN, email);
    }

    public boolean validatePhoneNumber(String phNumber) {
        Pattern pattern = Pattern.compile(PHONE_PATTERN);
        return Pattern.matches(PHONE_PATTERN, phNumber);
    }

    public boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return Pattern.matches(PASSWORD_PATTERN, password);
    }

    public ArrayList<String> emailArrayList = new ArrayList<String>();

    public void addEmail() {
        emailArrayList.add("abc@yahoo.com");
        emailArrayList.add("abc-100@yahoo.com");
        emailArrayList.add("abc111@abc.com");
        emailArrayList.add("abc-100@abc.net");
        emailArrayList.add("abc.100@abc.com.au");
        emailArrayList.add("abc@1.com");
        emailArrayList.add("abc@gmail.com.com");
        emailArrayList.add("abc@abc+100@gmail.com");
    }
}
