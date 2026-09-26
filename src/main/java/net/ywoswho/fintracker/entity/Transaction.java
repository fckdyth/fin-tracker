package net.ywoswho.fintracker.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Table(name = "transactions")
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @Nullable
    private Category category;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal amount;
}
