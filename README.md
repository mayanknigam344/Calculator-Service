# 💪 Spring Boot Calculator API

A simple RESTful calculator service built with Spring Boot that performs basic arithmetic operations like `add`, `subtract`, `multiply`, and `divide`.

---

## 📌 Features

- Clean architecture using the **Strategy Design Pattern**
- No `if-else` or `switch` statements for operation logic
- Easily extensible for new operations
- JSON-based REST API

---

## 🚀 API Endpoint

**POST** `http://localhost:8080/calculate`

### 📟 Sample Request

```json
{
  "num1": 12,
  "num2": 34,
  "operation": "add"
}
```

### ✅ Sample Response

```json
{
  "result": 46
}
```

---

## ⚙️ Architecture

Each arithmetic operation (like addition) is implemented using a separate class that implements a common `Operation` interface.

### Example: `AddOperationImpl`

```java
@Component
public class AddOperationImpl implements Operation {

    @Override
    public CalculateServiceResponse calculate(CalculateServiceRequest request) {
        CalculateServiceResponse response = new CalculateServiceResponse();
        response.setResult(request.getNum1() + request.getNum2());
        return response;
    }

    @Override
    public boolean isApplicable(CalculateServiceRequest request) {
        return request.getOperation().equals("add");
    }
}
```

### Operation Resolver

When a request comes in, the application finds the correct `Operation` implementation using the `isApplicable()` method — this avoids `if-else` logic completely.

---

## 📦 Tech Stack

- Java 17
- Spring Boot 3.x
- Maven

---

## 📁 Project Structure

```
🕠 com.calc.calculator
👉— controller
👉— dto
👉— service
       👉— operation
           👉— impl
👉— CalculatorApplication.java
```

---

## 🤝 Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

