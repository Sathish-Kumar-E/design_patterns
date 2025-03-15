package com.dp.creational_pattern.factory_method_pattern;

// Abstract Product
interface DatabaseConnection {
	public void connect();
}

// Concrete Product
class MySQLConnection implements DatabaseConnection {
	@Override
	public void connect() {
		System.out.println("Connecting to MySQL Database");
	}
}

// Concrete Product
class PostgreSQLConnection implements DatabaseConnection {
	@Override
	public void connect() {
		System.out.println("Connecting to PostgreSQL Database");
	}
}

// Creator
abstract class DatabaseConnectionFactory {
	public abstract DatabaseConnection createConnection();
}

// Concrete Creator
class MySQLConnectionFactory extends DatabaseConnectionFactory {
	@Override
	public DatabaseConnection createConnection() {
		return new MySQLConnection();
	}
}

// Concrete Creator
class PostgreSQLConnectionFactory extends DatabaseConnectionFactory {
	@Override
	public DatabaseConnection createConnection() {
		return new PostgreSQLConnection();
	}
}

public class Demo3 {
	public static void main(String[] args) {
		DatabaseConnectionFactory mysqlFactory = new MySQLConnectionFactory();
		DatabaseConnection mysqlConnection = mysqlFactory.createConnection();
		mysqlConnection.connect();
		
		DatabaseConnectionFactory postgresqlFactory = new PostgreSQLConnectionFactory();
		DatabaseConnection postgresqlConnection = postgresqlFactory.createConnection();
		postgresqlConnection.connect();
	}
}
