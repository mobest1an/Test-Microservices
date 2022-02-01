package com.mobest1an.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
