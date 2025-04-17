package com.Webapplication.OrganizationService.application;

import com.Webapplication.OrganizationService.application.dto.OrganizationDTO;
import com.Webapplication.OrganizationService.domain.Hibernate.OrganizationRepository;
import com.Webapplication.OrganizationService.domain.Organization;
import com.Webapplication.OrganizationService.domain.ids.OrganizationId;

import java.time.LocalDate;
import java.util.List;

public interface OrganizationService {

    OrganizationRepository createOrganization(OrganizationId organizationId, String name, String email, String telephone, String bank, String iban, String accountOwner, LocalDate startOfEventRegistration);
    Organization getOrganization(String organizationId);
    List<Organization> getOrganizations();
    void updateOrganization(String organizationId, OrganizationDTO OrganizationDTO);
    void updateOrganization(OrganizationDTO OrganizationDTO);
    boolean deleteOrganization(String organizationId);
}
