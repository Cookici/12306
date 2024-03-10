package com.lrh.project12306.biz.ticketservice.toolkit;

import com.lrh.project12306.biz.ticketservice.dto.domain.TicketListDTO;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

/**
 * @ProjectName: project-12306
 * @Package: com.lrh.project12306.biz.ticketservice.toolkit
 * @ClassName: TimeStringComparator
 * @Author: 63283
 * @Description: 自定义时间比较器
 * @Date: 2024/3/7 23:40
 */

public class TimeStringComparator implements Comparator<TicketListDTO> {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm");

    @Override
    public int compare(TicketListDTO ticketList1, TicketListDTO ticketList2) {
        LocalTime localTime1 = LocalTime.parse(ticketList1.getDepartureTime(), FORMATTER);
        LocalTime localTime2 = LocalTime.parse(ticketList2.getDepartureTime(), FORMATTER);
        return localTime1.compareTo(localTime2);
    }
}
