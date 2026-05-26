// UserService.java - Microservice for Accenture L10 Prep
// Author: Shital | Oct 2026
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class UserService {
    
    // L10 D2 Concept: O(n) optimization using HashSet
    private Set<String> processedUsers = new HashSet<>();
    
    @PostMapping("/processUser")
    public String processUser(@RequestBody String userId) {
        if(processedUsers.contains(userId)) { // O(1) check - D2 me yahi poochenge
            return "Duplicate request handled - AKS Microservice";
        }
        processedUsers.add(userId);
        return "User processed via Azure Kubernetes Service";
    }
}
