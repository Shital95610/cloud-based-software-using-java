// OrderService.java - Accenture L10 Microservice
// Database: AWS RDS MySQL | Purpose: Handle all order operations
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.amazonaws.services.sqs.AmazonSQS;

@RestController
public class OrderService {
    
    // L10 Concept: SQS for decoupling PaymentService
    @Autowired
    private AmazonSQS sqsClient;
    
    @PostMapping("/createOrder")
    public String createOrder(@RequestBody String orderDetails) {
        // Step 1: Save order to RDS MySQL - O(1) insert
        saveToRDS(orderDetails);
        
        // Step 2: Instead of calling Payment directly, push to SQS Queue
        // Benefit: If PaymentService is down, OrderService doesn't fail
        sqsClient.sendMessage("PaymentQueue", orderDetails);
        
        return "Order created & Payment queued via AWS SQS";
    }
    
    private void saveToRDS(String data) {
        // AWS RDS connection logic here
    }
}
