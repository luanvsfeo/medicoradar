package com.luan.clinicasradar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication(scanBasePackages={"com.luan.clinicasradar"})
@EnableScheduling
public class ClinicasradarApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicasradarApplication.class, args);
	}

}
