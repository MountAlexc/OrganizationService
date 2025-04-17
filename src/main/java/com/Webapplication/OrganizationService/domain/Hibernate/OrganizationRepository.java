package com.Webapplication.OrganizationService.domain.Hibernate;

import com.Webapplication.OrganizationService.domain.Organization;
import com.Webapplication.OrganizationService.domain.ids.OrganizationId;

import java.util.List;
import java.util.Optional;

public interface OrganizationRepository {
    Optional<Organization> findById(OrganizationId id);
    List<Organization> findAll();
    void save(Organization event);
    void delete(OrganizationId id);
}

