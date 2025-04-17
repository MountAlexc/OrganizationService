package com.Webapplication.OrganizationService.application.impl;

import com.Webapplication.OrganizationService.application.OrganizationService;
import com.Webapplication.OrganizationService.application.dto.OrganizationDTO;
import com.Webapplication.OrganizationService.domain.Hibernate.OrganizationRepository;
import com.Webapplication.OrganizationService.domain.Organization;
import com.Webapplication.OrganizationService.domain.ids.OrganizationId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class OrganizationServiceImpl implements OrganizationService {
    @Autowired
    private OrganizationRepository organizationRepository;

    @Override
    public OrganizationRepository createOrganization(OrganizationId organizationId, String name, String email, String telephone, String bank, String iban, String accountOwner, LocalDate startOfEventRegistration) {
        return null;
    }

    @Override
    public Organization getOrganization(String organizationId) {
        return null;
    }

    @Override
    public List<Organization> getOrganizations() {
        return List.of();
    }

    @Override
    public void updateOrganization(String organizationId, OrganizationDTO OrganizationDTO) {

    }

    @Override
    public void updateOrganization(OrganizationDTO OrganizationDTO) {

    }

    @Override
    public boolean deleteOrganization(String organizationId) {
        return false;
    }
}
