package com.arsalon.salonapi.domain.repository;

import com.arsalon.salonapi.domain.Slot;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SlotRepository extends CrudRepository<Slot, Long> {
}
