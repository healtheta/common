package org.healtheta.model.common.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.healtheta.model.common.HumanName;
import java.util.List;

@Repository
public interface HumanNameRepo extends JpaRepository<HumanName, Long> {
    public List<HumanName> findHumanNameByFamilyAndGiven(String family, String given);
    public List<HumanName> findHumanNameByFamily(String family);
    public List<HumanName> findHumanNameByGiven(String given);
}
