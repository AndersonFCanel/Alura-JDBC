package br.com.caelum.teste;

import java.sql.*;

public class TestaInsere {

	public TestaInsere() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/loja-virtual", "SA", "");
		Statement statement = connection.createStatement();
		boolean resultado = statement
				.execute("insert into Produto (nome, descricao) values ('Notebook', 'Notebook i5')");
		System.out.println("O resultado foi: " + resultado);

		statement.close();
		connection.close();
		/*
		 * Executando o código acima obtemos o resultado esperado: false. E se fizermos
		 * um select no banco de dados temos que o notebook foi inserido com sucesso:
		 */
	}
}
