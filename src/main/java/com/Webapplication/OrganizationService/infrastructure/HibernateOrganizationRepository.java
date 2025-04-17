package com.Webapplication.OrganizationService.infrastructure;

import com.Webapplication.OrganizationService.domain.Hibernate.OrganizationRepository;
import com.Webapplication.OrganizationService.domain.Organization;
import com.Webapplication.OrganizationService.domain.ids.OrganizationId;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class HibernateOrganizationRepository implements OrganizationRepository {
    @Override
    public Optional<Organization> findById(OrganizationId id) {
        return Optional.empty();
    }

    @Override
    public List<Organization> findAll() {
        return List.of();
    }

    @Override
    public void save(Organization event) {

    }

    @Override
    public void delete(OrganizationId id) {

    }
}
