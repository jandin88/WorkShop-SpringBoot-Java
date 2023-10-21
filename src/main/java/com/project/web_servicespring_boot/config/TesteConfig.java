package com.project.web_servicespring_boot.config;

import com.project.web_servicespring_boot.entides.Order;
import com.project.web_servicespring_boot.entides.User;
import com.project.web_servicespring_boot.entides.enuns.OrderStatus;
import com.project.web_servicespring_boot.repositories.OrderRepository;
import com.project.web_servicespring_boot.repositories.UseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")

public class TesteConfig implements CommandLineRunner {

    @Autowired
    private UseRepository useRepository;
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1= new User(null,"Maria Brow","maria@gmail.com.br","999874562","123456");
        User u2= new User(null,"Alex Green","alex@gmail.com.br","256421887","98752");

        //criando uma lista para salvar no repositório
        useRepository.saveAll(Arrays.asList(u1,u2));

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.DELIVERED ,u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"),OrderStatus.CANCELED, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"),OrderStatus.PAID, u1);

        orderRepository.saveAll(Arrays.asList(o1,o2,o3));
    }
}
