Banking System

A Java-based banking system designed to manage financial transactions efficiently. It utilizes JDBC for database connectivity with MySQL, enabling operations such as account management, transaction processing, and database updates.

Features

- Account Creation: Allows customers to create new accounts with details such as account number, name, and balance.
- Account Management: View, update, and delete account information as needed.
- Transaction Processing: Process deposits, withdrawals, and transfers between accounts.
- Transaction History: View a record of all transactions for each account.
- Account Balance Inquiry: Retrieve the current balance for a specific account.

Technologies Used

- Java: Core programming language used for application development.
- JDBC: Used for connecting and executing operations on the MySQL database.
- MySQL: The database management system used to store and manage banking data.

Setup Instructions

1. Clone the repository: `git clone (https://github.com/Shubhamkahar196/Banking_System_Project/)
2. Set up the MySQL database: Create a new MySQL database and import the provided SQL file (banking_db.sql) to set up the required tables.
3. Configure the database connection: Update the JDBC connection details in the DatabaseConnection.java file with your MySQL database credentials.
4. Compile and run the application: Use an IDE like IntelliJ IDEA or Eclipse to import the project. Compile and run the BankingSystem.java file.

Usage

- Create Account: Enter the account number, name, and initial balance to create a new account.
- View Account Details: Enter the account number to view account information.
- Process Transaction: Enter the account number, transaction type (deposit/withdrawal/transfer), and amount to process a transaction.
- View Transaction History: Enter the account number to view a record of all transactions.
- Check Account Balance: Enter the account number to retrieve the current balance.

Future Enhancements

- Add payment processing: Integrate payment gateways to handle customer payments.
- Expand account types: Include different account types (savings, checking, etc.) in the account creation process.
- User authentication: Add an authentication system for staff login.

Contributing

Contributions are welcome! If you have suggestions or want to add new features, feel free to fork this repository and submit a pull request.
