package com.amarmodi.app.repository;

import com.amarmodi.app.domain.RfbLocation;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the RfbLocation entity.
 */
@SuppressWarnings("unused")
@Repository
public interface RfbLocationRepository extends JpaRepository<RfbLocation, Long> {

}
