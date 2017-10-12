package dao;

import java.sql.Connection;

public class teste {

	public static void main(String[] args) {
		DatabaseConnection db = new DatabaseConnection();
		try {
			Connection con = db.getConnection();
			if (con != null){
				System.out.println("Conexao efetuada com sucesso");
			} else {
				System.out.println(("Conexao NAO efetuada"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("ERRO na conexao");
		}

	}

}
