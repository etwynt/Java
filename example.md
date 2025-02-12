# Online Marketplace
Swagger - http://localhost:8080/swagger-ui/index.html

In Latvia, the most popular online service for buying and selling products is ss.lv. Over the years, while the platform has remained widely used, its user interface has not seen significant updates, making it feel outdated. 
We recognised the need for an upgrade to provide a better, more modern, and visually appealing experience for users. That’s why we decided to create a new Online Marketplace—one that not only meets the needs of today’s users but also offers a more intuitive, user-friendly interface and enhanced features.

## Key Features

1. **User Management**:
    - User registration and login with **JWT-based authentication**.
    - Role-based access control (e.g., Admin, Seller, Buyer) using **Spring Security**.
    - Social login integration via **OAuth2** (e.g., Google, Facebook).

2. **Product Management**:
    - CRUD operations for products (sellers can add, update, or delete products).
    - Product categorization and filtering (e.g., by price, category, ratings).
    - Search functionality with pagination and sorting.

3. **Order Management**:
    - Shopping cart functionality for buyers.
    - Order creation, tracking, and status updates (e.g., pending, shipped, delivered).
    - Integration with payment gateways (e.g., Stripe, PayPal) for secure transactions.

4. **Reviews & Ratings**:
    - Buyers can leave reviews and ratings for products.
    - Average rating calculation for products.

5. **Notifications**:
    - Email or in-app notifications for order confirmations, updates, and promotions.
    - Real-time updates using WebSocket or messaging queues (e.g., RabbitMQ, Kafka).

6. **Admin Dashboard**:
    - Manage users, products, and orders.
    - Analytics and reporting (e.g., sales, revenue, user activity).

---

## Technical Stack

- **Backend Framework**: Spring Boot (RESTful APIs, dependency injection, and modular architecture).
- **Database**: MySQL (relational database for structured data storage).
- **Authentication**: JWT for secure token-based authentication and OAuth2 for social login.
- **Security**: Spring Security for role-based access control and endpoint protection.
- **Caching**: Redis for caching frequently accessed data (e.g., product listings).
- **Logging & Monitoring**: Logback for logging and tools like Prometheus/Grafana for monitoring.

  ---

This setup ensures a **scalable, secure, and efficient** online marketplace with a seamless user experience.

---

## Reviews

- To get all reviews make a GET request to /reviews

EXAMPLE RESPONSE: 

```java
 {
    "id": 9007199254740991,
    "reviewerName": "string",
    "content": "string",
    "rating": 1073741824
  }
```
- To create a review, make a POST request to /reviews

EXAMPLE REQUEST:
```java
{
  "id": 9007199254740991,
  "reviewerName": "string",
  "content": "string",
  "rating": 1073741824
}
```
EXAMPLE RESPONSE:
```java
{
  "id": 9007199254740991,
  "reviewerName": "string",
  "content": "string",
  "rating": 1073741824
}
```

- To get a specific review based on ID make a request to /reviews

Enter the ID

EXAMPLE RESPONSE: 
```java
{
  "id": 9007199254740991,
  "reviewerName": "string",
  "content": "string",
  "rating": 1073741824
}
```

- To delete a specific review based on ID make a request to /reviews

Enter the ID - and there is no response?
