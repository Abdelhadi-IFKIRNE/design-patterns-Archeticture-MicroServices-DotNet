package com.example.design_pattern_decorator.Service;

import com.example.design_pattern_decorator.Decorator.*;
import com.example.design_pattern_decorator.Dtos.NewInvoiceDto;
import com.example.design_pattern_decorator.Entities.Invoice;
import com.example.design_pattern_decorator.Repositories.InvoiceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

@Service
@AllArgsConstructor
public class InvoiceServiceImpl implements InvoiceService {
    private InvoiceRepository invoiceRepository;
    @Override
    public Invoice createInvoice(NewInvoiceDto invoiceDto) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Packet packet=(Packet) Class.forName("com.example.design_pattern_decorator.Decorator."+invoiceDto.getPacketName()).newInstance();
        for (String name : invoiceDto.getFleurs()) {
            packet=(Packet) Class.forName("com.example.design_pattern_decorator.Decorator."+name).getConstructor(Packet.class)
                    .newInstance(packet);
        }
        Invoice invoice=new Invoice();
        invoice.setPrice(packet.price());
        invoice.setDescription(packet.getDescription());

       return invoiceRepository.save(invoice);
    }

    @Override
    public List<Invoice> getAllInvoices(){
        return invoiceRepository.findAll();
    }

}
