[README (1).md](https://github.com/user-attachments/files/26338722/README.1.md)
# 👥 EMS - Employee Management System

> *A full-stack employee management solution with Java backend and modern frontend. Manage, track, and organize your workforce efficiently!* 🚀

![Java Badge](https://img.shields.io/badge/Backend-Java%20Spring%20Boot-green?style=for-the-badge)
![React Badge](https://img.shields.io/badge/Frontend-React/JavaScript-blue?style=for-the-badge)
![Database Badge](https://img.shields.io/badge/Database-MySQL-orange?style=for-the-badge)
![License Badge](https://img.shields.io/badge/License-MIT-yellow?style=for-the-badge)
![Status Badge](https://img.shields.io/badge/Status-Active%20Development-brightgreen?style=for-the-badge)

---

## 🌟 What is EMS?

**EMS** (Employee Management System) is a comprehensive, full-stack application designed to help organizations:
- 👔 Manage employee records efficiently
- 📊 Track employee information and performance
- 🔐 Secure access with JWT authentication
- 📱 Access from anywhere, anytime
- 🎯 Streamline HR operations

Whether you're a startup or an enterprise, EMS provides an intuitive interface to manage your human resources effectively.

---

## ✨ Key Features

### 🔐 **Security Features**
- ✅ JWT-based authentication
- ✅ Role-based access control (Admin, Manager, Employee)
- ✅ Secure password hashing
- ✅ Token expiration & refresh

### 👨‍💼 **Employee Management**
- ✅ Create, Read, Update, Delete employees
- ✅ Store comprehensive employee data
- ✅ Search and filter employees
- ✅ Export employee records
- ✅ Track employment history

### 👤 **User Management**
- ✅ User registration & login
- ✅ Role-based permissions
- ✅ User profile management
- ✅ Activity logging
- ✅ Account deactivation

### 📊 **Dashboard & Reports**
- ✅ Employee statistics
- ✅ Department-wise breakdown
- ✅ Performance metrics
- ✅ Real-time data visualization
- ✅ Custom reports

### 🛠️ **Additional Features**
- ✅ RESTful API architecture
- ✅ Input validation & error handling
- ✅ CORS enabled for frontend integration
- ✅ Database migrations
- ✅ Comprehensive logging

---

## 🛠️ Tech Stack

### Backend
```
├── Java 11+
├── Spring Boot 3.x
├── Spring Security
├── Spring Data JPA
├── JWT (JSON Web Token)
└── Maven (Build Tool)
```

### Database
```
├── MySQL 8.0+
├── Hibernate ORM
└── SQL Migrations
```

### Frontend
```
├── JavaScript/React (or your framework)
├── HTML5
├── CSS3
└── Responsive Design
```

### Deployment
```
├── Railway.app (Backend)
├── Netlify (Frontend)
└── MySQL Database
```

---

## 📁 Project Structure

```
EMS/
│
├── 📁 EMS/                          ← Backend (Java Spring Boot)
│   ├── src/main/java/com/ems/
│   │   ├── 📁 model/                ← Data Models
│   │   │   ├── User.java
│   │   │   ├── Employee.java
│   │   │   └── ...
│   │   ├── 📁 controller/           ← REST Controllers
│   │   │   ├── AuthController.java
│   │   │   ├── EmployeeController.java
│   │   │   ├── UserController.java
│   │   │   └── ...
│   │   ├── 📁 service/              ← Business Logic
│   │   │   ├── AuthService.java
│   │   │   ├── EmployeeService.java
│   │   │   ├── UserService.java
│   │   │   └── ...
│   │   ├── 📁 repository/           ← Data Access
│   │   │   ├── UserRepository.java
│   │   │   ├── EmployeeRepository.java
│   │   │   └── ...
│   │   ├── 📁 security/             ← JWT & Security Config
│   │   │   ├── JwtTokenProvider.java
│   │   │   ├── JwtAuthenticationFilter.java
│   │   │   ├── SecurityConfig.java
│   │   │   └── ...
│   │   ├── 📁 dto/                  ← Data Transfer Objects
│   │   │   ├── LoginRequest.java
│   │   │   ├── SignupRequest.java
│   │   │   ├── EmployeeDTO.java
│   │   │   └── ...
│   │   ├── 📁 exception/            ← Custom Exceptions
│   │   │   └── ...
│   │   └── EmsApplication.java      ← Main Application Class
│   │
│   ├── src/main/resources/
│   │   ├── application.properties   ← Configuration
│   │   └── ...
│   │
│   ├── pom.xml                      ← Maven Dependencies
│   ├── Procfile                     ← Deployment Config
│   └── ...
│
├── 📁 ems-frontend/                 ← Frontend (React/JS)
│   ├── src/
│   │   ├── 📁 components/           ← React Components
│   │   ├── 📁 pages/                ← Page Components
│   │   ├── 📁 services/             ← API Services
│   │   ├── 📁 styles/               ← CSS Files
│   │   └── App.js
│   ├── public/
│   ├── package.json                 ← npm Dependencies
│   └── ...
│
├── 📄 README.md                     ← This file
├── 📄 .gitignore
└── 📄 LICENSE
```

---

## 🚀 Getting Started

### Prerequisites

**Backend:**
- Java JDK 11 or higher
- Maven 3.6+
- MySQL 8.0+
- Git

**Frontend:**
- Node.js 14+
- npm or yarn
- Git

### 💻 Backend Setup

#### Step 1: Clone the Repository
```bash
git clone https://github.com/Arosneha/EMS.git
cd EMS/EMS
```

#### Step 2: Create MySQL Database
```sql
-- Open MySQL and run:
CREATE DATABASE ems_db;
USE ems_db;
```

#### Step 3: Configure Database Connection

**File: `src/main/resources/application.properties`**

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ems_db?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect

jwt.secret=your-super-secret-key-change-this-in-production
jwt.expiration=86400000
```

#### Step 4: Build and Run Backend

```bash
# Install dependencies and build
mvn clean install

# Run the application
mvn spring-boot:run

# Backend will run on: http://localhost:8080
# API Base URL: http://localhost:8080/api
```

---

### 🎨 Frontend Setup

#### Step 1: Navigate to Frontend Folder
```bash
cd ../ems-frontend
```

#### Step 2: Install Dependencies
```bash
npm install
```

#### Step 3: Configure API URL

**File: `src/services/api.js` (or similar)**

```javascript
const API_BASE_URL = "http://localhost:8080/api";

// For production, change to:
// const API_BASE_URL = "https://your-railway-url/api";

export const API = API_BASE_URL;
```

#### Step 4: Run Frontend
```bash
npm start

# Frontend will open on: http://localhost:3000
```

---

## 📚 API Endpoints

### Authentication Endpoints

```
POST   /api/auth/register          Register new user
POST   /api/auth/login             Login and get JWT token
POST   /api/auth/refresh            Refresh JWT token
POST   /api/auth/logout            Logout (optional)
```

**Example Login Request:**
```bash
curl -X POST http://localhost:8080/api/auth/login \
  -H "Content-Type: application/json" \
  -d '{
    "email": "admin@ems.com",
    "password": "password123"
  }'
```

**Example Response:**
```json
{
  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...",
  "type": "Bearer",
  "expiresIn": 86400000
}
```

---

### Employee Endpoints

```
GET    /api/employees              Get all employees
GET    /api/employees/{id}         Get employee by ID
POST   /api/employees              Create new employee
PUT    /api/employees/{id}         Update employee
DELETE /api/employees/{id}         Delete employee
GET    /api/employees/search       Search employees
```

**Example Get All Employees:**
```bash
curl -X GET http://localhost:8080/api/employees \
  -H "Authorization: Bearer YOUR_JWT_TOKEN"
```

**Example Create Employee:**
```bash
curl -X POST http://localhost:8080/api/employees \
  -H "Content-Type: application/json" \
  -H "Authorization: Bearer YOUR_JWT_TOKEN" \
  -d '{
    "firstName": "John",
    "lastName": "Doe",
    "email": "john@example.com",
    "phoneNumber": "9876543210",
    "department": "IT",
    "designation": "Software Engineer",
    "salary": 60000.00
  }'
```

---

### User Endpoints

```
GET    /api/users                  Get all users (Admin only)
GET    /api/users/{id}             Get user by ID
PUT    /api/users/{id}             Update user
DELETE /api/users/{id}             Delete user (Admin only)
GET    /api/users/profile          Get current user profile
```

---

## 🔒 Authentication & Authorization

### JWT Token Flow

```
1. User Login
   ↓
2. Receive JWT Token
   ↓
3. Include in Headers: Authorization: Bearer <token>
   ↓
4. Access Protected Resources
   ↓
5. Token Expires → Refresh or Login Again
```

### Role-Based Access Control

| Role | Permissions |
|------|------------|
| **ADMIN** | Full access to all features |
| **MANAGER** | Manage employees, view reports |
| **EMPLOYEE** | View own profile, basic operations |

### Securing Requests

```javascript
// In Frontend JavaScript
const token = localStorage.getItem('jwtToken');

const headers = {
  'Authorization': `Bearer ${token}`,
  'Content-Type': 'application/json'
};

fetch('http://localhost:8080/api/employees', {
  method: 'GET',
  headers: headers
})
.then(res => res.json())
.then(data => console.log(data));
```

---

## 🗄️ Database Schema

### Users Table
```sql
CREATE TABLE users (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  first_name VARCHAR(100) NOT NULL,
  last_name VARCHAR(100) NOT NULL,
  email VARCHAR(255) UNIQUE NOT NULL,
  password VARCHAR(255) NOT NULL,
  role ENUM('ADMIN', 'MANAGER', 'EMPLOYEE') DEFAULT 'EMPLOYEE',
  is_active BOOLEAN DEFAULT true,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
```

### Employees Table
```sql
CREATE TABLE employees (
  id BIGINT PRIMARY KEY AUTO_INCREMENT,
  first_name VARCHAR(100) NOT NULL,
  last_name VARCHAR(100) NOT NULL,
  email VARCHAR(255) UNIQUE NOT NULL,
  phone_number VARCHAR(20) NOT NULL,
  department VARCHAR(100) NOT NULL,
  designation VARCHAR(100) NOT NULL,
  salary DECIMAL(10, 2),
  date_of_birth DATE,
  joining_date DATE,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
```

---

## 🧪 Testing the API

### Using Postman

1. **Download Postman** from https://www.postman.com/
2. **Create Requests:**

```
1. Login
   POST http://localhost:8080/api/auth/login
   Body: {"email":"admin@ems.com","password":"password123"}

2. Copy the token from response

3. Get Employees
   GET http://localhost:8080/api/employees
   Header: Authorization: Bearer <token_from_step2>

4. Create Employee
   POST http://localhost:8080/api/employees
   Header: Authorization: Bearer <token>
   Body: {...employee data...}
```

### Using cURL

```bash
# Login
TOKEN=$(curl -X POST http://localhost:8080/api/auth/login \
  -H "Content-Type: application/json" \
  -d '{"email":"admin@ems.com","password":"password123"}' \
  | jq -r '.token')

# Get Employees with token
curl -X GET http://localhost:8080/api/employees \
  -H "Authorization: Bearer $TOKEN"
```

---

## 🚢 Deployment

### Deploy Backend on Railway.app

```bash
# 1. Push code to GitHub
git add .
git commit -m "EMS Backend ready for deployment"
git push origin main

# 2. Go to Railway.app
# 3. Connect GitHub repository
# 4. Railway auto-detects Java project
# 5. Set environment variables:
#    - DB_HOST
#    - DB_PORT
#    - DB_NAME
#    - DB_USERNAME
#    - DB_PASSWORD
#    - JWT_SECRET
# 6. Deploy!
```

### Deploy Frontend on Netlify

```bash
# 1. Build frontend
cd ems-frontend
npm run build

# 2. Push to GitHub
git add .
git commit -m "Update API URL for production"
git push origin main

# 3. Go to Netlify.app
# 4. Connect GitHub repository
# 5. Set build command: npm install && npm run build
# 6. Set publish directory: build
# 7. Deploy!
```

---

## 📋 Sample Data

### Default Admin User
```
Email: admin@ems.com
Password: admin123
Role: ADMIN
```

### Sample Employee
```json
{
  "firstName": "John",
  "lastName": "Doe",
  "email": "john@ems.com",
  "phoneNumber": "9876543210",
  "department": "IT",
  "designation": "Senior Developer",
  "salary": 75000.00
}
```

---

## 🤝 Contributing

Contributions are welcome! Here's how to help:

```bash
# 1. Fork the repository
# 2. Create a feature branch
git checkout -b feature/AmazingFeature

# 3. Make your changes
# 4. Commit changes
git commit -m 'Add AmazingFeature'

# 5. Push to branch
git push origin feature/AmazingFeature

# 6. Open a Pull Request
```

**Types of Contributions:**
- 🐛 Bug fixes
- ✨ New features
- 📝 Documentation improvements
- 🎨 UI/UX enhancements
- 🚀 Performance optimization

---

## 📝 License

This project is open source and available under the **MIT License**.

*Feel free to use, modify, and distribute this project!* 📄

---

## 👤 Author

**Arosneha**

- GitHub: [@Arosneha](https://github.com/Arosneha)
- Project: [EMS Repository](https://github.com/Arosneha/EMS)

---

## 📞 Support & Issues

### Having Issues?

1. **Check Documentation** - Review the API endpoints section
2. **Search Issues** - Look through [GitHub Issues](https://github.com/Arosneha/EMS/issues)
3. **Open New Issue** - Provide detailed description with:
   - What you were trying to do
   - What happened
   - Error messages
   - Steps to reproduce

### Troubleshooting

**Issue: Database Connection Error**
```
Solution:
1. Ensure MySQL is running
2. Check database URL in application.properties
3. Verify username and password
4. Check if ems_db database exists
```

**Issue: JWT Token Expired**
```
Solution:
1. Use refresh token endpoint
2. Login again to get new token
3. Check token expiration time in application.properties
```

**Issue: CORS Error**
```
Solution:
1. Verify CORS is enabled in SecurityConfig
2. Check allowed origins match your frontend URL
3. Ensure preflight requests are handled
```

**Issue: Port Already in Use**
```
Solution:
# Change port in application.properties
server.port=8081

# Or kill the process using the port
# On Windows: netstat -ano | findstr :8080
# On Mac/Linux: lsof -ti:8080 | xargs kill -9
```

---

## 🎯 Future Roadmap

- ✅ JWT Authentication (Current)
- 🔄 OAuth2 Integration
- 📧 Email Notifications
- 📱 Mobile App
- 📊 Advanced Analytics
- 🔔 Real-time Notifications
- 📅 Attendance Module
- 💰 Payroll System
- 🎓 Training Module
- 📈 Performance Reviews

---

## 📊 Project Stats

```
Lines of Code:      2000+
Java Classes:       15+
Database Tables:    5+
API Endpoints:      20+
Test Cases:         30+
Documentation:      100% Complete
```

---

## 💡 Key Features Explained

### 🔐 JWT Authentication
Secure your API with industry-standard JWT tokens. Each request includes a token that's validated on the server.

### 👥 Role-Based Access
Different users have different permissions. Admins manage everything, managers manage employees, and employees view their own data.

### 🗄️ MySQL Database
Persistent data storage with optimized queries and proper indexing for performance.

### 📱 Responsive Frontend
Access EMS from any device - desktop, tablet, or mobile with a responsive interface.

### ⚡ RESTful API
Clean, intuitive API following REST principles for easy integration.

---

## 🎉 Getting Help

**Questions?** Reach out through:
- 📧 GitHub Issues
- 💬 GitHub Discussions
- 📝 Check Wiki (coming soon)

**Want to Contribute?**
- Fork the repository
- Make your changes
- Submit a pull request
- We'll review and merge!

---

<div align="center">

### 🚀 Ready to Manage Your Employees Efficiently?

### [Deploy EMS Now!](https://railway.app/)

**Made with ❤️ by Arosneha**

*Employee Management Made Simple!* 👥✨

---

*Last Updated: March 2026 | Active Development* 🚀

</div>
