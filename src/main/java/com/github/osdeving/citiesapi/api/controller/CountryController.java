package com.github.osdeving.citiesapi.api.controller;

import com.github.osdeving.citiesapi.domain.model.Country;
import com.github.osdeving.citiesapi.domain.repository.CountryRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

  private final CountryRepository repository;

  public CountryController(final CountryRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/countries")
  public List<Country> cities() {

    return repository.findAll();
  }
}
