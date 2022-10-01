package com.example.design_pattern_decorator.Controllers;

import com.example.design_pattern_decorator.Dtos.NewInvoiceDto;

import com.example.design_pattern_decorator.Entities.Invoice;
import com.example.design_pattern_decorator.Service.InvoiceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.InvocationTargetException;
import java.util.List;


@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class InvoiceRestController {
    private InvoiceService invoiceService;
    @PostMapping("/invoice/save")
    public void SaveInvoice(@RequestBody NewInvoiceDto invoiceDto) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        invoiceService.createInvoice(invoiceDto);
    }

    @GetMapping("/invoices/all")
    public List<Invoice> getAllInvoices(){
        return this.invoiceService.getAllInvoices();
    }
}
