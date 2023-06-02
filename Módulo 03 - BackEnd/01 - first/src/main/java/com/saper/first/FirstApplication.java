package com.saper.first;

//import java.util.HashMap;
//import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.saper.first.dtos.CostResponseDTO;
import com.saper.first.dtos.PriceResponseDTO;
import com.saper.first.services.PayService;
import com.saper.first.services.TimeService;
import com.saper.first.services.TypeService;

//Classe responsável por inciar o Spring Boot
@SpringBootApplication
@RestController
public class FirstApplication implements CommandLineRunner {

	@Autowired
	TimeService timeService;
	@Autowired
	TypeService typeService;
	@Autowired
	PayService payService;

	/* public FirstApplication(TimeService timeService, TypeService typeService, PayService payService) {
		this.timeService = timeService;
		this.typeService = typeService;
		this.payService = payService;
	} */ //UTILIZAÇÃO DO CONSTRUTOR DOS BEANS

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}

	@GetMapping("/hello") //EndPoint
    public String hello(@RequestParam(value = "first", defaultValue = "Lucas") String first,
						@RequestParam(value = "second", defaultValue = "Sousa") String second) {
      return String.format("Hello %s %s!", first, second);
    }

	@Override
	public void run(String... args) throws Exception {

			System.out.println(payService.calcCost(78, "carro"));
	}

	@GetMapping("/calc-cost") //EndPoint
    public CostResponseDTO calcCost(@RequestParam(value = "minutes", defaultValue = "0") int minutes,
						   			@RequestParam(value = "type", defaultValue = "carro") String type) {

		return new CostResponseDTO(payService.calcCost(minutes, type));
    }

	/* @GetMapping("/price")
	public HashMap<String, Object> price() {
		HashMap<String, Object> ans = new HashMap<>();
		ans.put("moto", typeService.calcType("moto"));
		ans.put("carro", typeService.calcType("carro"));
		return ans;
	} */

	@GetMapping("/price")
	public PriceResponseDTO price(){
		return new PriceResponseDTO(typeService.calcType("carro"),
									typeService.calcType("moto"));
	}
}