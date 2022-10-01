package com.example.design_pattern_decorator;

import com.example.design_pattern_decorator.Decorator.*;
import com.example.design_pattern_decorator.Dtos.NewInvoiceDto;
import com.example.design_pattern_decorator.Entities.Invoice;
import com.example.design_pattern_decorator.Repositories.InvoiceRepository;
import com.example.design_pattern_decorator.Service.InvoiceService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.yaml.snakeyaml.constructor.Constructor;

import javax.persistence.criteria.CriteriaBuilder;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class DesignPatternDecoratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternDecoratorApplication.class, args);

    }
    @Bean
    CommandLineRunner start(InvoiceService invoiceService){
        return args -> {
            NewInvoiceDto newInvoiceDto=new NewInvoiceDto();
            List<String> fleurs=new ArrayList<>();
            fleurs.add("FleurD");
            fleurs.add("FleurE");
            fleurs.add("FleurF");
            newInvoiceDto.setFleurs(fleurs);
            newInvoiceDto.setPacketName("PacketA");
           System.out.println(invoiceService.createInvoice(newInvoiceDto));
        };
    }

}
