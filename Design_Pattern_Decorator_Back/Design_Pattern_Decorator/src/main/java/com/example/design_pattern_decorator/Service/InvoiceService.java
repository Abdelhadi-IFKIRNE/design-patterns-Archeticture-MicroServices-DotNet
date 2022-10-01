package com.example.design_pattern_decorator.Service;

import com.example.design_pattern_decorator.Decorator.*;
import com.example.design_pattern_decorator.Dtos.NewInvoiceDto;
import com.example.design_pattern_decorator.Entities.Invoice;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface InvoiceService {
    public Invoice createInvoice(NewInvoiceDto invoiceDto) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException;

    List<Invoice> getAllInvoices();
}
