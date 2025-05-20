# 🚗 Welcome to the **Car Dealership Console App**!

A Java-based console application that simulates a car dealership system with functionality for managing vehicle inventory, handling customer interactions, and recording both **sales** and **lease** contracts. The application showcases principles of object-oriented programming and file-based data persistence.

---

## 🧩 Overview

This application allows dealership employees to:

- View and manage the vehicle inventory via a simple menu interface:
    1. 🔍 Search vehicles by:
       - Price range
       - Make/Model
       - Year range
       - Color
       - Mileage range
       - Type (Car, Truck, SUV, Van)
    2. 📃 List all vehicles
    3. ➕ Add a new vehicle
    4. 🗑️ Remove a vehicle
    5. 👋 Quit the program
- Manage Dealership inventory
- Sell or lease vehicles to customers

---

## ✨ Key Features

- **Inventory Management**: View and select available vehicles.
- **Sales Contracts**:
  - Calculates total sale price including sales tax, fees, and optional financing
  - Financing rules based on vehicle price and duration
- **Lease Contracts**:
  - Computes monthly payments based on depreciation and lease fees
  - Enforces a restriction on leasing vehicles older than 3 years
- **User Interaction**:
  - Console prompts guide users through contract creation
  - Dynamic pricing calculations and payment estimates
- **Data Persistence**:
  - Contracts are saved to a file (`contracts.txt`) using a structured format
  - All contracts—sales and leases—are appended for record-keeping

---

## 🧱 Object-Oriented Design

The project uses a clean class hierarchy:

- **`Contract`** (Abstract):
  - Base class with shared fields and abstract methods for computing price/payment
- **`SalesContract`**:
  - Includes tax, fees, and financing options
- **`LeaseContract`**:
  - Handles depreciation, lease fees, and fixed financing terms
- **`ContractFileManager`**:
  - Responsible for saving contracts to a persistent file
  - Detects contract type dynamically to format the output
 
---

## 📁 Project Structure

```
CarDealership/
├── .idea/                      # IDE configuration folder (e.g., IntelliJ IDEA)
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── pluralsight/
│                   ├── Contract.java
│                   ├── ContractDataManager.java
│                   ├── Dealership.java
│                   ├── DealershipFileManager.java
│                   ├── LeaseContract.java
│                   ├── Program.java
│                   ├── SalesContract.java
│                   ├── UserInterface.java
│                   └── Vehicle.java
├── resources/
│   ├── contracts.csv
│   └── inventory.csv
├── .gitignore
├── pom.xml
└── README.md
```

---

## 🖼️ Screenshots

### 🏠 Home Screen
![image](https://github.com/user-attachments/assets/ac4debb7-fe1e-4c08-a2d1-e1abe3d6044c)

### 🚗 Adding Vehicle
![image](https://github.com/user-attachments/assets/98e76748-545d-443e-ae1e-00e81a01af4c)

### 🚗 Removing Vehicle
![image](https://github.com/user-attachments/assets/134bcced-473f-40ae-8680-ab592cff879c)

### 💳 Sell/Lease Vehicle
![image](https://github.com/user-attachments/assets/0a8a1d68-ff00-4f7b-bebc-ffe32babb473)
