package br.com.agenda.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dao {
	
	// Drive que conecta com o banco
	private String driver = "com.mysql.cj.jdbc.Driver";
	
	// caminho do banco
	private String url = "jdbc:mysql://127.0.0.1:3306/agenda?useTimezone=true&serverTimeZone=UTC";
	
	// usuário do banco
	private String user ="root";
	
	// senha do banco
	private String password = "";
	
	// conexao com o banco
	private Connection conectar() {
		Connection conn = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			
			return conn;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public void testaconexao() {
		try {
			Connection connection = conectar();
			System.out.println("Conexao bem sucedida " + connection);
			connection.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
