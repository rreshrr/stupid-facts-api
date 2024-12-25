package ru.thomaskohouse.StupidFactsApi.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.thomaskohouse.StupidFactsApi.dto.DogFactDto;

/**
 * Сервис вызывает REST API используя RestTemplate
 */
@Service
@AllArgsConstructor
@Slf4j
public class DogFactService {

    private static final String DOG_URL = "https://dog-api.kinduff.com/api/facts";
    final private RestTemplate restTemplate;

    public String getFactAboutDog() {
        log.info("Get fact about dog");
        DogFactDto dogFact = restTemplate.getForObject(DOG_URL, DogFactDto.class);
        if (dogFact != null) {
            return dogFact.getFacts().get(0);
        } else {
            return "No facts, sorry";
        }
    }
}
