package org.healtheta.model.common.repos;

import org.healtheta.model.common.Identifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.healtheta.model.common.Reference;

@Repository
public interface ReferenceRepo extends JpaRepository<Reference, Long> {
    public Reference findReferenceByIdentifier(Identifier identifier);
    public Reference findReferenceById(Long id);
}
