package ru.thomaskohouse.StupidFactsApi.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import ru.thomaskohouse.StupidFactsApi.dto.CatFactDto;

/**
 * Сервис вызывает REST API используя WebClient
 */
@Service
@Slf4j
public class CatFactService {

    private static final String CAT_URL = "https://catfact.ninja";

    private final WebClient webClient;

    public CatFactService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl(CAT_URL).build();
    }

    public String getFactAboutCat() {
        log.info("Get fact about cat");

        CatFactDto catFact = webClient.get()
                .uri("/fact")
                .retrieve()
                .bodyToMono(CatFactDto.class)
                .block();
        if (catFact != null) {
            return catFact.getFact();
        } else {
            return "No facts, sorry";
        }
    }

}
