package com.college.cms.service;

import com.college.cms.entity.Holiday;

import java.util.List;

public interface HolidayService {

    Holiday saveHoliday(Holiday holiday);

    List<Holiday> getAllHoliday();

    Holiday getHolidayById(Integer holidayId);

    Holiday updateHoliday(Integer holidayId, Holiday holiday);

    void deleteHoliday(Integer holidayId);

}