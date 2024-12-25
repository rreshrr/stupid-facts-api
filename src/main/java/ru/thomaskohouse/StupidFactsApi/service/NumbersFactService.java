package ru.thomaskohouse.StupidFactsApi.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.thomaskohouse.StupidFactsApi.clients.NumbersClient;

import java.time.LocalDate;

/**
 * Сервис вызывает внешний REST API используя OpenFeign
 */
@Service
@AllArgsConstructor
@Slf4j
public class NumbersFactService {

    final private NumbersClient numbersClient;

    public String getFactAboutToday() {
        Integer currentDay = LocalDate.now().getDayOfMonth();
        Integer currentMonth = LocalDate.now().getMonthValue();
        log.info("trying get fun fact about today({}/{})", currentDay, currentMonth);
        return numbersClient.funFactAboutDate(currentMonth, currentDay);
    }

}
