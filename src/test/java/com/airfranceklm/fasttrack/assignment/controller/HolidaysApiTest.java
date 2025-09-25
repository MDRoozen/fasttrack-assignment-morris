package com.airfranceklm.fasttrack.assignment.controller;

import com.airfranceklm.fasttrack.assignment.repository.HolidayRepository;
import com.airfranceklm.fasttrack.assignment.resources.Holiday;
import com.airfranceklm.fasttrack.assignment.resources.Status;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class HolidaysApiTest {

    private HolidaysApi holidaysApi;
    private HolidayRepository holidayRepository;

    @BeforeEach
    void setUp() {
        holidayRepository = mock(HolidayRepository.class);
        holidaysApi = new HolidaysApi(holidayRepository);
    }

    @Test
    void testGetHolidays() {
        when(holidayRepository.findAll()).thenReturn(mockHolidays());

        List<Holiday> result = holidaysApi.getHolidays();

        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals("klm012345", result.get(0).getEmployeeId());
        assertEquals("12356", result.get(1).getUuid());
    }

    @Test
    void testCreateHoliday() {
        when(holidayRepository.save(any(Holiday.class))).thenReturn(new Holiday());

        Holiday result = holidaysApi.createHoliday(mockHolidays().getFirst());
        assertNotNull(result);
    }

    @Test
    void testDeleteHoliday() {
        holidaysApi.deleteHoliday("12345");

        verify(holidayRepository, times(1)).deleteById("12345");
    }

    private List<Holiday> mockHolidays() {
        Date date1 = new Date(10);
        Date date2 = new Date(20);
        Date date3 = new Date(30);
        Date date4 = new Date(40);
        List<Holiday> holidays = new ArrayList<>();

        holidays.add(new Holiday(
                "12345",
                "summer vacation",
                "klm012345",
                date1,
                date2,
                Status.DRAFT
        ));
        holidays.add(new Holiday(
                "12356",
                "christmas",
                "klm232323",
                date3,
                date4,
                Status.SCHEDULED
        ));

        return holidays;
    }
}
