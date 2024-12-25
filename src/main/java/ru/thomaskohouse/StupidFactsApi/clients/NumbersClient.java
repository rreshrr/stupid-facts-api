package ru.thomaskohouse.StupidFactsApi.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Пример использования FeignClient для вызова внешнего REST-сервиса
 * Объявляем декларативно интерфейс с методами, Spring самостоятельно создаёт реализацию
 */
@FeignClient(name = "numbersClient", url = "http://numbersapi.com")
public interface NumbersClient {

    @GetMapping("/{month}/{day}/date")
    String funFactAboutDate(@PathVariable Integer month, @PathVariable Integer day);
}
