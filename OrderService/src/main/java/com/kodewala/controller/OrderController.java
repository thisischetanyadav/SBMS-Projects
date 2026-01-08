//package com.kodewala.controller;


//import java.time.LocalDateTime;
//import java.util.HashMap;
//import java.util.Map;


//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
//public class  OrderController {

	/*
	 * @GetMapping("/order") public ResponseEntity<Map<String, Object>> placeOrder()
	 * {
	 * 
	 * Map<String, Object> error = new HashMap<>(); error.put("timestamp",
	 * LocalDateTime.now()); error.put("status", HttpStatus.OK.value());
	 * error.put("message", "Order has been placed..."); return new
	 * ResponseEntity<>(error, HttpStatus.OK);
	 * 
	 * }
	 */

//}
package com.kodewala.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.kodewala.entity.Order;
import com.kodewala.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping()
    public ResponseEntity<Order> placeOrder(@RequestBody Order order) {
        Order savedOrder = orderService.placeOrder(order);
        return new ResponseEntity<>(savedOrder, HttpStatus.CREATED);
    }

    @GetMapping("/test")
    public String test() {
        return "Order Service is running fine!";
    }
}

