# Bank Management System

A comprehensive bank management system that provides essential banking operations and account management features.

## Features

- **Account Management**
  - Create new bank accounts
  - View account details and balance
  - Update account information
  - Close accounts

- **Transaction Operations**
  - Deposit funds
  - Withdraw money
  - Transfer between accounts
  - Transaction history tracking

- **Customer Management**
  - Customer registration
  - Profile management
  - Account linking

- **Security**
  - User authentication
  - Secure transaction processing
  - Data encryption

## Prerequisites

- Java 8 or higher
- Maven or Gradle (for dependency management)
- Database (MySQL/PostgreSQL recommended)

## Installation

1. Clone the repository:
```bash
git clone https://github.com/yourusername/Bank-management-system.git
cd Bank-management-system
```

2. Configure database connection:
   - Update database credentials in configuration files
   - Run database schema setup scripts

3. Build the project:
```bash
mvn clean install
```

4. Run the application using Login.java.

## Usage

### Creating an Account
```java
// Example usage
BankAccount account = new BankAccount("John Doe", "123456789", 1000.0);
bankService.createAccount(account);
```

### Making Transactions
```java
// Deposit
transactionService.deposit(accountId, 500.0);

// Withdraw
transactionService.withdraw(accountId, 200.0);

// Transfer
transactionService.transfer(fromAccountId, toAccountId, 300.0);
```


## Technologies Used

- Java
- MySQL

## Acknowledgments

- Thanks to all contributors
- Inspired by real-world banking systems
- Built for educational purposes
