package com.Webapplication.OrganizationService.domain.ids;

import com.Webapplication.OrganizationService.domain.Organization;

public class OrganizationId extends DomainId<Organization> {
    private OrganizationId() {
    }

    public OrganizationId(String id) {
        super(id);
    }
}
