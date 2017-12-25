package com.amarmodi.app.repository;

import com.amarmodi.app.domain.RfbEventAttendance;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the RfbEventAttendance entity.
 */
@SuppressWarnings("unused")
@Repository
public interface RfbEventAttendanceRepository extends JpaRepository<RfbEventAttendance, Long> {

}
