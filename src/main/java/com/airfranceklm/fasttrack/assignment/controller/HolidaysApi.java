package com.airfranceklm.fasttrack.assignment.controller;

import java.util.List;

import com.airfranceklm.fasttrack.assignment.repository.HolidayRepository;
import org.springframework.web.bind.annotation.*;

import com.airfranceklm.fasttrack.assignment.resources.Holiday;

@RestController
@RequestMapping("/holidays")
@CrossOrigin(originPatterns = "http://localhost:4200/")
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
