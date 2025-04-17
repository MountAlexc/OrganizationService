package com.Webapplication.OrganizationService.domain;

import com.Webapplication.OrganizationService.domain.ids.OrganizationId;

import java.time.LocalDate;

public class Organization {
    private OrganizationId organizationId;
    private String name;

    private String email;
    private String telephone;

    private String bank;
    private String iban;
    private String accountOwner;

    private LocalDate startOfEventRegistration;

    public Organization(OrganizationId organizationId, String name, String email, String telephone, String bank, String iban, String accountOwner, LocalDate startOfEventRegistration) {
        this.organizationId = organizationId;
        this.name = name;
        this.email = email;
        this.telephone = telephone;
        this.bank = bank;
        this.iban = iban;
        this.accountOwner = accountOwner;
        this.startOfEventRegistration = startOfEventRegistration;
    }

    public OrganizationId getOrganizationId() {
        return organizationId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getBank() {
        return bank;
    }

    public String getIban() {
        return iban;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public LocalDate getStartOfEventRegistration() {
        return startOfEventRegistration;
    }
}
