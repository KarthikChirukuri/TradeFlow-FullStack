# 🚀 TradeFlow Full Stack Trading Platform

TradeFlow is a full-stack stock trading platform inspired by modern brokerage applications. It provides a responsive trading dashboard, secure authentication, portfolio tracking, and order management using React, Spring Boot, Spring Security, and MySQL.

---

## 📌 Project Overview

This project demonstrates the development of a complete full-stack application with separate frontend and dashboard applications communicating with a Spring Boot backend through REST APIs.

The application implements secure session-based authentication using Spring Security and provides a modern trading interface for viewing holdings, positions, orders, funds, and market data.

---

## ✨ Features

### 🔐 Authentication & Security

* Secure Login Authentication
* Session-Based Authentication using Spring Security
* Protected Dashboard Routes
* Authentication Validation using REST APIs
* CORS Configuration for Multiple Frontends
* Password Encryption using BCrypt

### 📊 Trading Dashboard

* Interactive Trading Dashboard
* Holdings Management
* Positions Tracking
* Order Management
* Funds Overview
* Watchlist Interface
* Market Data Visualization

### 🎨 User Interface

* Modern Responsive Design
* Animated Login Page
* Dashboard Navigation
* Interactive Charts & Analytics
* Mobile-Friendly Layout

### ⚙️ Backend Features

* RESTful API Architecture
* Spring Boot Backend Services
* Role-Based Authorization Support
* Secure Session Management
* MySQL Database Integration

---

## 🏗️ System Architecture

```text
Frontend (React)
      │
      ▼
Spring Boot REST APIs
      │
      ▼
Spring Security
      │
      ▼
MySQL Database
```

### Multi-Frontend Architecture

```text
Login Application
localhost:3001
       │
       ▼
Spring Boot Backend
localhost:8080
       │
       ▼
Trading Dashboard
localhost:3000
```

---

## 🔄 Authentication Flow

1. User enters username and password.
2. React sends login credentials to Spring Boot.
3. Spring Security validates the credentials.
4. A session is created upon successful login.
5. Browser stores the generated session cookie.
6. Dashboard verifies authentication using protected APIs.
7. Unauthorized users are redirected to the login application.

---

## 🛠️ Tech Stack

### Frontend

* React.js
* React Router DOM
* Axios
* CSS3

### Backend

* Java
* Spring Boot
* Spring Security
* REST APIs

### Database

* MySQL

### Tools

* VS Code
* Postman
* Git & GitHub

---

## 📂 Project Structure

```bash
TradeFlow-FullStack
│
├── Backend
│   └── backend
│
├── frontend
│   └── Login Application
│
├── dashboard
│   └── Trading Dashboard
│
└── README.md
```

---

## ⚙️ Installation & Setup

### Clone Repository

```bash
git clone https://github.com/KarthikChirukuri/TradeFlow-FullStack.git
```

---

### Start Backend

```bash
cd Backend/backend
mvn spring-boot:run
```

Backend runs on:

```bash
http://localhost:8080
```

---

### Start Login Frontend

```bash
cd frontend
npm install
npm start
```

Runs on:

```bash
http://localhost:3001
```

---

### Start Dashboard

```bash
cd dashboard
npm install
npm start
```

Runs on:

```bash
http://localhost:3000
```

---

## 🗄️ Database Setup

Create a MySQL database:

```sql
CREATE DATABASE stockdb;
```

Update database credentials inside:

```properties
application.properties
```

---

## 📈 Future Improvements

* JWT Authentication
* Real-Time Stock Market Data Integration
* Portfolio Performance Analytics
* Buy/Sell Order Persistence
* User Registration System
* Docker Containerization
* AWS Deployment
* Dark / Light Theme Support
* WebSocket-Based Live Market Updates

---

## 🎯 Learning Outcomes

Through this project, I gained hands-on experience in:

* Full Stack Development
* Spring Security Authentication
* Session Management
* React Routing
* REST API Development
* Frontend-Backend Integration
* MySQL Database Operations
* Authentication & Authorization Concepts
* CORS Handling
* Application Architecture Design

---

## 👨‍💻 Author

**Karthik Chirukuri**

* Full Stack Developer
* Java & Spring Boot Developer
* React Developer
* Backend Enthusiast

GitHub: https://github.com/KarthikChirukuri

---

## 📜 License

This project is developed for educational, learning, and portfolio purposes.
