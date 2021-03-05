package com.kosta.day08.Lab4;

public class DaoExample {
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySQLDao());
		dbWork(new DataAccessObject() {

			@Override
			public void select() {
				System.out.println("DB2... select");
				
			}

			@Override
			public void insert() {
				System.out.println("DB2... insert");
				
			}

			@Override
			public void update() {
				System.out.println("DB2... update");
				
			}

			@Override
			public void delete() {
				System.out.println("DB2... delete");
				
			}
			
		});
	}

	private static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.delete();
		dao.update();
		System.out.println("**********************");
		
	}

}
