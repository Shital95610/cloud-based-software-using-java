import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentService {
    
    // AWS SQS Consumer: Listens to payment queue from OrderService
    // Purpose: Decoupling - OrderService doesn't wait for payment
    // L10 Concept: If PaymentService is down, orders still get created
    
    @PostMapping("/payment")
    public String processPayment() {
        return "Payment processed via AWS SQS";
    }
}
