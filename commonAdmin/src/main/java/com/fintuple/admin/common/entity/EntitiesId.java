package com.fintuple.admin.common.entity;

import lombok.Data;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Data
public class EntitiesId implements Serializable {
    private static final long serialVersionUID = -263083886675339303L;
    @Column(name = "e_id", nullable = false)
    private Integer eId;
    @Column(name = "entity_id", nullable = false, length = 20)
    private String entityId;
    @Override
    public int hashCode() {
        return Objects.hash(eId, entityId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        EntitiesId entity = (EntitiesId) o;
        return Objects.equals(this.eId, entity.eId) &&
                Objects.equals(this.entityId, entity.entityId);
    }
}