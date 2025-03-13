# Parking System - Java Project

## 📌 Project Description
This Java-based **Parking System** allows users to book parking slots for different vehicle types (Bike, Car, Truck). It also provides a **cancellation feature**, calculates parking charges, and displays real-time slot availability.

## 🚀 Features
- 📌 **Vehicle Booking** – Users can park their **Bike, Car, or Truck**.
- 📌 **Slot Management** – Displays available slots on different floors.
- 📌 **Parking Charge Calculation** – Charges **$6 per hour**.
- 📌 **Booking Cancellation** – Users can cancel a booking to free up space.

## 📂 Project Structure
```
📁 ParkingSystem
 ┣ 📁 src/Parking
 ┃ ┣ 📄 Vehicle.java    # Stores vehicle details
 ┃ ┣ 📄 Booking.java    # Handles booking and pricing
 ┃ ┣ 📄 ParkingLot.java # Manages slot availability
 ┃ ┗ 📄 Main.java       # Runs the program
 ┗ 📄 README.md         # Project documentation
```

## 🔧 Installation & Execution
### 1️⃣ **Compile the Code**
Open the terminal in the project directory and run:
```sh
javac Parking/*.java
```

### 2️⃣ **Run the Program**
```sh
java Parking.Main
```

## 🏗️ Classes & Responsibilities
| Class | Description |
|--------|------------|
| **Vehicle** | Stores vehicle details like number, color, and type |
| **Booking** | Handles vehicle booking and calculates price |
| **ParkingLot** | Manages parking slots and cancellations |
| **Main** | Entry point to run the parking system |

## 🛠️ Possible Improvements
- 🔹 **Database Integration** for persistent storage.
- 🔹 **GUI or Web Interface** for a user-friendly experience.
- 🔹 **Online Reservation** for booking in advance.
- 🔹 **IoT Integration** for real-time parking detection.

## 📜 License
This project is open-source and can be modified or extended as needed.

---
🚀 **Happy Coding!**
