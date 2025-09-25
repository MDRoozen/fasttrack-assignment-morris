package com.airfranceklm.fasttrack.assignment.controller;

import java.util.List;

import com.airfranceklm.fasttrack.assignment.repository.HolidayRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.airfranceklm.fasttrack.assignment.resources.Holiday;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/holidays")
public class HolidaysApi {

    private final HolidayRepository holidayRepository;

    public HolidaysApi(HolidayRepository holidayRepository) {
        this.holidayRepository = holidayRepository;
    }

    @GetMapping
    public List<Holiday> getHolidays() {
        return holidayRepository.findAll();
    }

    @GetMapping("/{employeeCode}")
    public List<Holiday> getHolidaysByEmployee(@PathVariable String employeeCode) {
        return holidayRepository.findByEmployeeId(employeeCode);
    }
}
