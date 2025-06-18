# Adapter Pattern

The **Adapter Pattern** allows incompatible interfaces to work together. It converts the interfaces of a class into another interface that clients expects.

It's commonly used when you want to reuse an existing class but its interface does not match what your code expects.

---

### **Concept Overview**
The **Adapter Pattern** acts as a bridge between two incompatible interfaces. It wraps an existing class with a new interface so that it becomes compatible with the client's code.

### 🔹 Key Concepts
- **Target**: The interface the client expects.
- **Adaptee**: The class with an incompatible interface.
- **Adapter**: A wrapper that implements the Target interface and translates calls to the Adaptee.

### **Advantages**
- ✅ Allows code reuse of existing functionality.
- ✅ Promotes Open/Closed Principle - You adapt behavior without modifying existing code.
- ✅ Supports legacy or third-party APIs.

## **Adapter Pattern in Action: Duck-Turkey Simulation**

## **How It Works**
Suppose you have two interfaces: `Duck` and `Turkey`, Ducks `quack()` and `fly()`
normally, but turkeys `gobble()` and fly short distances.

You want to use a `Turkey` object where a `Duck` is expected. You create a `TurkeyAdapter` to wrap the `Turkey` and expose the `Duck` interface.

### **1️⃣ Define the Target Interface**
The Duck interface defines:
- `quack()`
- `fly()`

### **2️⃣ Create the Adaptee**
The Turkey class has:
- `gobble()`
- `fly() (short distance)`

### **3️⃣ Build the Adapter**
The TurkeyAdapter implements Duck, holds a reference to a Turkey, and internally maps:
- `quack()` → `gobble()`
- `fly()` → calls `fly()` multiple times to simulate distance.

### **4️⃣ Use the Adapter in the Client**
In the main method you can now pass the `TurkeyAdapter` wherever a `Duck` is expected, allowing seamless integration.

### **🎯 Use Cases**
- Using legacy code in a new system.
- Wrapping third-party APIs.
- Adapting interfaces in testing or mock environments.

## **Conclusion**
The **Adapter Pattern** is great for making existing code compatible with new interfaces

It also follows **SOLID Principles** and improve maintainability, readability and flexibility in large systems.