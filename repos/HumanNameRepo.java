package org.healtheta.model.common.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.healtheta.model.common.HumanName;

@Repository
public interface HumanNameRepo extends JpaRepository<HumanName, Long> {
    public HumanName findHumanNameByFamilyAndGiven(String family, String given);
}
