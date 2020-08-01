package org.shop.rest;


import org.shop.dto.OrderDto;
import org.shop.service.OrdersService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("orders")
public class OrderResource {

    private OrdersService ordersService;

    @GetMapping(produces = "application/json")
    public List<OrderDto> findAll() {

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring/application-context.xml");
//        OrdersService ordersService = context.getBean("orderServiceImpl", OrdersService.class);

        return ordersService.findAll();
    }

//    public List<OrdersDto> findAll() {
//        return List.of(
//                new OrderDto( "name1", "position1"),
//                new OrderDto( "name2", "position2"),
//                new OrderDto( "name3", "position3")
//        );
//    }

//    @PostMapping
//    public void createEmployee(@RequestBody OrderDto employee) {
//        System.out.println("Created employee: " + employee);
//    }
//
//    @PutMapping
//    public void updateEmployee(@RequestBody OrderDto employee) {
//        System.out.println("Updated employee " + employee);
//    }
//
//    @DeleteMapping
//    public void deleteEmployee(@RequestBody OrderDto employee) {
//        System.out.println("Deleted employee " + employee);
//    }


}
