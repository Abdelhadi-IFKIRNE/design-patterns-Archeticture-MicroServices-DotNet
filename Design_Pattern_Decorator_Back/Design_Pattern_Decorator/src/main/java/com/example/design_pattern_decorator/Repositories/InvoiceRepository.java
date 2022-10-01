package com.example.design_pattern_decorator.Repositories;

import com.example.design_pattern_decorator.Entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice,Long> {
}
