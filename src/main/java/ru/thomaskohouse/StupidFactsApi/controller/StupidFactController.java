package ru.thomaskohouse.StupidFactsApi.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.thomaskohouse.StupidFactsApi.service.CatFactService;
import ru.thomaskohouse.StupidFactsApi.service.DogFactService;
import ru.thomaskohouse.StupidFactsApi.service.NumbersFactService;

@RestController
@AllArgsConstructor
@RequestMapping("/stupid-facts")
@Slf4j
public class StupidFactController {

    private final NumbersFactService numbersFactService;

    private final DogFactService dogFactService;

    private final CatFactService catFactService;

    @GetMapping("/today")
    public ResponseEntity<String> getFactAboutToday() {
        log.info("Someone trying get fact about today");
        return new ResponseEntity<>(numbersFactService.getFactAboutToday(), HttpStatus.OK);
    }

    @GetMapping("/dog")
    public ResponseEntity<String> getFactAboutDog() {
        log.info("Someone trying get fact about dog");
        return new ResponseEntity<>(dogFactService.getFactAboutDog(), HttpStatus.OK);
    }

    @GetMapping("/cat")
    ResponseEntity<String> getFactAboutCat() {
        log.info("Someone trying get fact about cat");
        return new ResponseEntity<>(catFactService.getFactAboutCat(), HttpStatus.OK);
    }

}
