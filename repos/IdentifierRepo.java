package org.healtheta.model.common.repos;

import org.healtheta.model.common.Identifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.healtheta.model.common.Identifier;

@Repository
public interface IdentifierRepo extends JpaRepository<Identifier, Long> {
    public Identifier findIdentifierByValue(String value);
}
