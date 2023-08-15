package com.project.web_servicespring_boot.config;

import com.project.web_servicespring_boot.entides.User;
import com.project.web_servicespring_boot.repositories.UseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")

public class TesteConfig implements CommandLineRunner {

    @Autowired
    private UseRepository useRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1= new User(null,"Maria Brow","maria@gmail.com.br","999874562","123456");
        User u2= new User(null,"Alex Green","alex@gmail.com.br","256421887","98752");

        //criando uma lista para salvar no repositório
        useRepository.saveAll(Arrays.asList(u1,u2));
    }
}
