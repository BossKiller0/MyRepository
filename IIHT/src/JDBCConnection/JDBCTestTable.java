package JDBCConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class JDBCTestTable {

	public static void main(String[] args) throws Exception {
		Statement std = null;
		Connection con = null;
		Scanner sc = new Scanner(System.in);
		con = new MySQLConnect().Connect();
		con.setAutoCommit(false);
		std = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

		while (true) {

			System.out.println("=======================");
			System.out.println("1. Display all Tables");
			System.out.println("2. Describe Table");
			System.out.println("3. Exit");
			System.out.println("=======================");
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {

			case 1:
				ResultSet rs = std.executeQuery("show tables");
				System.out.println("Displaying All Tables");
				rs.beforeFirst();
				while (rs.next()) {
					System.out.println(rs.getRow() + ". " + rs.getString("Tables_in_test"));
				}
				rs.close();
				break;
			case 2:
				System.out.println("Enter Name Of The Table");
				String nm = sc.nextLine();
				ResultSet rt = std.executeQuery(
						"SELECT column_name,column_type FROM information_schema.columns where table_name='" + nm + "'");

				while (rt.next()) {
					System.out.println(
							rt.getRow() + ". " + rt.getString("column_name") + " " + rt.getString("column_type"));
				}
				rt.close();
				break;
			case 3:
				System.out.println("Exiting.....");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice");

			}

		}

	}

}
