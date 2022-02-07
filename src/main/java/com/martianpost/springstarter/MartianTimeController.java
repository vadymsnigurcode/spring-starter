//package com.martianpost.springstarter;
//
//import com.martianpost.springstarter.service.MartianTimeService;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.time.ZonedDateTime;
//
//@ConditionalOnWebApplication
//@RestController
//public class MartianTimeController {
//
//    private final MartianTimeService martianTimeService;
//
//    public MartianTimeController(MartianTimeService martianTimeService) {
//        this.martianTimeService = martianTimeService;
//    }
//
//    @GetMapping("/mds/current")
//    public double getMds() {
//        return martianTimeService.toMarsSolDate(ZonedDateTime.now());
//    }
//}
