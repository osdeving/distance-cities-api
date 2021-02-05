package com.github.osdeving.citiesapi.domain.repository;

import com.github.osdeving.citiesapi.domain.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
