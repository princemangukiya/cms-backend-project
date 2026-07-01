package com.college.cms.service.impl;

import com.college.cms.entity.Holiday;
import com.college.cms.repository.HolidayRepository;
import com.college.cms.service.HolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HolidayServiceImpl implements HolidayService {

    @Autowired
    private HolidayRepository holidayRepository;

    @Override
    public Holiday saveHoliday(Holiday holiday) {
        return holidayRepository.save(holiday);
    }

    @Override
    public List<Holiday> getAllHoliday() {
        return holidayRepository.findAll();
    }

    @Override
    public Holiday getHolidayById(Integer holidayId) {
        return holidayRepository.findById(holidayId).orElse(null);
    }

    @Override
    public Holiday updateHoliday(Integer holidayId, Holiday holiday) {

        Holiday oldHoliday = holidayRepository.findById(holidayId).orElse(null);

        if (oldHoliday != null) {

            oldHoliday.setHolidayDate(holiday.getHolidayDate());
            oldHoliday.setHolidayName(holiday.getHolidayName());

            return holidayRepository.save(oldHoliday);
        }

        return null;
    }

    @Override
    public void deleteHoliday(Integer holidayId) {
        holidayRepository.deleteById(holidayId);
    }
}