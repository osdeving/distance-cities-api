package com.github.osdeving.citiesapi.domain.repository;

import com.github.osdeving.citiesapi.domain.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
