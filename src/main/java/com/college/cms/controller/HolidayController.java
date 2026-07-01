package com.college.cms.controller;

import com.college.cms.entity.Holiday;
import com.college.cms.service.HolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/holidays")
@CrossOrigin(origins = "*")
public class HolidayController {

    @Autowired
    private HolidayService holidayService;

    @PostMapping
    public Holiday saveHoliday(@RequestBody Holiday holiday) {
        return holidayService.saveHoliday(holiday);
    }

    @GetMapping
    public List<Holiday> getAllHoliday() {
        return holidayService.getAllHoliday();
    }

    @GetMapping("/{holidayId}")
    public Holiday getHolidayById(@PathVariable Integer holidayId) {
        return holidayService.getHolidayById(holidayId);
    }

    @PutMapping("/{holidayId}")
    public Holiday updateHoliday(@PathVariable Integer holidayId,
                                 @RequestBody Holiday holiday) {

        return holidayService.updateHoliday(holidayId, holiday);
    }

    @DeleteMapping("/{holidayId}")
    public String deleteHoliday(@PathVariable Integer holidayId) {

        holidayService.deleteHoliday(holidayId);

        return "Holiday Deleted Successfully";
    }
}