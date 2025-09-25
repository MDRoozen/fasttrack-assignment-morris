package com.airfranceklm.fasttrack.assignment.controller;

import com.airfranceklm.fasttrack.assignment.repository.HolidayRepository;
import com.airfranceklm.fasttrack.assignment.resources.Holiday;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@EnableAutoConfiguration
@SpringBootTest(
        classes = { HolidayRepository.class, DataSource.class },
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
class HolidaysApiIntegrationTest {
    @Autowired
    private HolidayRepository holidayRepository;

    private HolidaysApi holidaysApi;

    @BeforeEach
    void setup() {
        holidaysApi = new HolidaysApi(holidayRepository);
    }

    @Test
    void testGetHolidaysByEmployee() {
        List<Holiday> result = holidaysApi.getHolidaysByEmployee("klm012345");

        assertEquals(2, result.size());
    }
}
