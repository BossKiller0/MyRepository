package JDBCConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTestTable {

	public static void main(String[] args) throws Exception {
		Statement std = null;
		Connection con = null;
		Scanner sc = new Scanner(System.in);

		while (true) {
			con = new MySQLConnect().Connect();
			con.setAutoCommit(false);
			std = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = std.executeQuery("show tables");

			System.out.println("1. Display all Tables");
			System.out.println("2. Create Table");
			System.out.println("3. Exit");

			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {

			case 1:
				System.out.println("Displaying All Tables");
				rs.beforeFirst();
				while (rs.next()) {
					System.out.println(rs.getRow() + ". " + rs.getString("Tables_in_test"));
				}
				break;
			case 2:
				System.out.println("Enter Name Of The Table");
				String nm = sc.nextLine();
				rs.beforeFirst();
				while (rs.next()) {
					if (rs.getString("Tables_in_test").equals(nm)) {
						System.out.println("Table Already Exists");
						ResultSet rt = std.executeQuery(
								"SELECT column_name,column_type FROM information_schema.columns where table_name='" + nm
										+ "'");

						while (rt.next()) {
							System.out.println(rt.getRow() + ". " + rt.getString("column_name") + " "
									+ rt.getString("column_type"));
						}
					}

				}
				break;
			default:
				System.out.println("Invalid choice");

			}

		}

	}

}
