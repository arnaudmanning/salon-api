package com.arsalon.salonapi.domain.repository;

import com.arsalon.salonapi.domain.SalonServiceDetail;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalonServiceDetailRepository extends CrudRepository<SalonServiceDetail, Long> {
}
