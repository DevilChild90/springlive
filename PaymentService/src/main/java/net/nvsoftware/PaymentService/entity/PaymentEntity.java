package net.nvsoftware.PaymentService.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Table;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.Instant;

@Entity
//@Table(name="Payment_TB")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaymentEntity {
   @org.springframework.data.annotation.Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private long orderId;
    private String paymentMode;
    private long totalAmount;
    private Instant paymentDate;
    private String paymentStatus;
}
