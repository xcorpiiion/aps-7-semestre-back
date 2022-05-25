package br.com.unip;

import br.com.unip.model.Gerente;
import br.com.unip.service.GerenteService;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApsApplication implements ApplicationRunner {
    @Autowired
    private GerenteService gerenteService;

    public static void main(String[] args) {
        SpringApplication.run(ApsApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Gerente gerente = this.gerenteService.findByEmail("master@iscontente");
        if (gerente == null) {
            gerente = new Gerente();
            gerente.setEmail("master@iscontente");
            gerente.setNome("Gerente");
            gerente.setSenha("12345678");
            gerente.setMaster(true);
            gerente.setCreateDate(new DateTime());
            this.gerenteService.save(gerente);
        }
    }
}
