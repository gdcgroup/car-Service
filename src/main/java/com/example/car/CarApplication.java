package com.example.car;

import com.example.car.common.TypeOfFuel;
import com.example.car.common.TypeTechnicalReview;
import com.example.car.entity.*;
import com.example.car.repository.CarRepository;
import com.example.car.repository.LorryRepository;
import com.example.car.repository.MotorbikeRepository;
import com.example.car.repository.VehicleRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.LocalDate;

@SpringBootApplication
@EnableSwagger2
public class CarApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext
				= SpringApplication.run(CarApplication.class, args);
		VehicleRepository carRepository = configurableApplicationContext.getBean(CarRepository.class);
		VehicleRepository lorryRepository = configurableApplicationContext.getBean(LorryRepository.class);
		VehicleRepository motorbikeRepository = configurableApplicationContext.getBean(MotorbikeRepository.class);

		Car car = new Car("vw", LocalDate.of(1981, 7, 19), TypeOfFuel.BENZIN, "WZ 58N21",
				new Insurance("PZU", LocalDate.of(2020, 10, 11), LocalDate.of(2021, 10, 10)),
				new TechnicalReview( TypeTechnicalReview.PODSTAWOWY_PRZEGLAD, LocalDate.of(2020, 5, 6), LocalDate.of(2021, 5, 5)));
		Car car1 = new Car("polonez", LocalDate.of(1982, 7, 19), TypeOfFuel.BENZIN_LPG, "KTT 843",
				new Insurance("PZU", LocalDate.of(2020, 10, 11), LocalDate.of(2021, 10, 10)),
				new TechnicalReview( TypeTechnicalReview.PODSTAWOWY_PRZEGLAD, LocalDate.of(2020, 5, 6), LocalDate.of(2021, 5, 5)));

		Lorry lorry = new Lorry("man", LocalDate.of(1959, 7, 19), TypeOfFuel.DIESEL, "DW 68974",
				new Insurance("Warta", LocalDate.of(2020, 7, 19), LocalDate.of(2021, 7, 18)),
				new TechnicalReview( TypeTechnicalReview.ROZSZERZONY_PRZEGLAD, LocalDate.of(2020, 12, 6), LocalDate.of(2021, 12, 5)));
		Motorbike motorbike = new Motorbike("suzuki", LocalDate.of(2000, 7, 1), TypeOfFuel.ELECETRIC, "GDA 5621",
				new Insurance("Samopomoc", LocalDate.of(2020, 7, 19), LocalDate.of(2021, 7, 18)),
				new TechnicalReview( TypeTechnicalReview.PODSTAWOWY_PRZEGLAD, LocalDate.of(2020, 12, 6), LocalDate.of(2021, 12, 5)));


		carRepository.save(car);
		carRepository.save(car1);
		lorryRepository.save(lorry);
		motorbikeRepository.save(motorbike);


	}

}
