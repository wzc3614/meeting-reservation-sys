package com.wzc.meetingreservationsys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.wzc.meetingreservationsys.mapper")
@SpringBootApplication
public class MeetingReservationSysApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeetingReservationSysApplication.class, args);
    }

}
