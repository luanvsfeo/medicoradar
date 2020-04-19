package com.luan.clinicasradar;

import com.luan.clinicasradar.controller.AtendimentoController;
import com.luan.clinicasradar.controller.PlanoController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(scanBasePackages={"com.luan.clinicasradar"})
public class ClinicasradarApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicasradarApplication.class, args);
	}

}
