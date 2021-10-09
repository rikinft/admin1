package com.fintuple.admin.common.entity;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;

import javax.persistence.*;
import java.time.Instant;

@Table(name = "entities")
@Entity
@Data
public class Entities {
    @EmbeddedId
    private EntitiesId id;

    @Column(name = "entity_type", nullable = false, length = 45)
    private String entityType;

    @Column(name = "entity_legal_name", nullable = false, length = 100)
    private String entityLegalName;

    @Column(name = "entity_short_name", nullable = false, length = 45)
    private String entityShortName;

    @Lob
    @Column(name = "entity_id_attributes", nullable = false)
    private String entityIdAttributes;

    @Column(name = "entity_contact_details", nullable = false)
    private String entityContactDetails;

    @Column(name = "entity_domain_restrictions", nullable = false)
    private String entityDomainRestrictions;

    @Column(name = "entity_iam_integration_details", nullable = false)
    private String entityIamIntegrationDetails;

    @Column(name = "is_services_client", nullable = false)
    private Integer isServicesClient;

    @Column(name = "is_onboarded", nullable = false)
    private Integer isOnboarded;

    @Column(name = "is_active", nullable = false)
    private Integer isActive;

    @Column(name = "created_ts", nullable = false)
    private Instant createdTs;

    @Column(name = "last_updated_ts", nullable = false)
    private Instant lastUpdatedTs;

    @Column(name = "created_by", nullable = false, length = 20)
    private String createdBy;
}