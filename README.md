 # Cloud Based Software - Java Microservices | AWS

## 🎯 Target: Accenture L10 - Cloud Data Engineer
 # Java Microservices on AWS for Accenture L10
> Spring Boot | AWS RDS | AWS SQS | O(n) HashSet DSA | REST APIs

## ⚡ Architecture Used
- **Microservices**: 3 services using Spring Boot 
- **Deployed On**: AWS EC2
- **Communication**: REST APIs+ AWS SQS for async decoupling
- **Database**: AWS RDS MySQL
- **DSA Used**: HashSet for O(n) duplicate API calls detection
  
  ## Microservices Breakdown - For Accenture L10
| **Service Name** | **Cloud Used** | **Purpose** | **L10 Concept** |
| --- | --- | --- | --- |
| **UserService** | AWS EC2 | User management | HashSet O(n) duplicate check |
| **OrderService** | AWS RDS MySQL | Order creation | Saves order to managed DB |
| **PaymentService** | AWS SQS | Async payments | Decoupling via Queue |

## 🏆 L10 Interview Points
1. "Sir maine monolith ko 3 microservices me toda, O(n²) se O(n) kiya"
2. "AWS SQS i use for decoupling ,OrderService not fail". 

## 🔗 Roles This Project Is Relevant For
This microservices architecture aligns with requirements for:
- Accenture L10 - Cloud Data Engineer 
- TCS Digital - Cloud Specialist
- Capgemini - Cloud Architect
- IBM - Application Developer

Note: Built as part of personal upskilling for cloud + DSA concepts. Not part of any company assignment.
