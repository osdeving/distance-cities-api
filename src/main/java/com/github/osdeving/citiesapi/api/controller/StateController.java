package com.github.osdeving.citiesapi.api.controller;

import com.github.osdeving.citiesapi.domain.model.State;
import com.github.osdeving.citiesapi.domain.repository.StateRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staties")
public class StateController {

  private final StateRepository repository;

  public StateController(final StateRepository repository) {
    this.repository = repository;
  }

  @GetMapping
  public List<State> staties() {
    return repository.findAll();
  }
}
