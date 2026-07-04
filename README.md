# Coffee Shop Ordering Engine ☕🛠️

A professional-grade backend simulation of a coffee shop ordering system, built using **Core Java**. This project demonstrates the practical application of advanced **Object-Oriented Design Patterns (GoF)** to solve complex architectural challenges like dynamic pricing, state-based notifications, and centralized resource management.

## 🌟 Key Features

* **Dynamic Add-On System:** Customers can customize base beverages (Espresso, Latte) with infinite combinations of add-ons (Milk, Caramel). The system calculates costs and generates receipts dynamically at runtime.
* **Automated Notification Pipeline:** Employs a decoupled event-broadcasting system. When an order changes state (`PLACED` → `PREPARING` → `READY`), the system automatically alerts the Kitchen Display and sends Customer SMS notifications.
* **Centralized Order Management:** Utilizes a globally accessible, single-instance manager to track all active orders, ensuring data consistency across the application.
* **Flexible Payment Gateway:** Supports plug-and-play payment methods (UPI, Card) without hardcoding business logic into the core ordering engine.

## 🏗️ Design Patterns Applied

* **Decorator Pattern:** Used to dynamically wrap base `Beverage` objects with `AddOnDecorator` classes, preventing "class explosion" while accurately calculating final costs.
* **Observer Pattern:** Manages state-based event broadcasting. The `CoffeeOrder` acts as the Subject, notifying decoupled `OrderObserver` implementations (Kitchen, Customer) of lifecycle changes.
* **Singleton Pattern:** Applied to the `CoffeeShopManager` to ensure only one central system state exists to track and generate unique order IDs.
* **Strategy Pattern:** Decouples payment processing logic via the `PaymentStrategy` interface, allowing for seamless addition of new payment methods.

## 📂 Project Structure

The project is modularized into distinct packages to ensure high cohesion and maintainability:

```text
src/com/coffeeshop/
├── core/           # Main execution engine and Singleton Manager
├── decorator/      # Base beverages and dynamic add-on wrappers
├── model/          # Domain interfaces and OrderStatus Enums
├── observer/       # Notification interfaces and system listeners
└── strategy/       # Payment interface and concrete strategies
