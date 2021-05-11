package com.ufanet.abracadabra.repository;

import com.ufanet.abracadabra.entity.Predicates;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PredicateRepository  extends JpaRepository<Predicates, Integer> {
}
