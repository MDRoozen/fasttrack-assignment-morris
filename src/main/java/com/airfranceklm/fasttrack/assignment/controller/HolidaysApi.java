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

    @PostMapping
    public Holiday createHoliday(@RequestBody Holiday holiday) {
        if(!validHoliday(holiday)) throw new IllegalArgumentException("not a valid holiday");
        return holidayRepository.save(holiday);
    }

    @DeleteMapping("/{id}")
    public void deleteHoliday(@PathVariable String id) {
        holidayRepository.deleteById(id);
    }

    private boolean validHoliday(Holiday holiday) {
        List<Holiday> holidays = holidayRepository.findByEmployeeId(holiday.getEmployeeId());
        for(Holiday h : holidays) {
            if(overlap(holiday, h)) return false;
        }
        return true;
    }

    private boolean overlap(Holiday holiday, Holiday h) {
        // TODO: implement logic
        return false;
    }
}
