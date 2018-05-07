package InvPrime;

import java.io.File;
import java.sql.*;

public class SqliteConnection extends Common {

	public static void Connect() throws SQLException {
		Statement stmt = null;
		try {
			System.out.println(Common.App_Path);
			File Dir = new File(Common.App_Path + "\\Data");
			if (!Dir.exists()) {
				if (Dir.mkdir()) {
					System.out.println("Directory is created!");
				} else {
					System.out.println("Failed to create directory!");
					System.exit(0);
				}
			}
			Dir = new File(Common.App_Path + "\\Data\\mydata.data");
			if (!Dir.exists()) {
				Class.forName("org.sqlite.JDBC");
				GBLConn = DriverManager.getConnection("jdbc:sqlite:Data\\mydata.data");
				GBLConn.setAutoCommit(false);
				stmt = GBLConn.createStatement();
				String sql = "CREATE TABLE IF NOT EXISTS [Login](\r\n"
						+ "    [Username] TEXT NOT NULL ON CONFLICT ROLLBACK UNIQUE ON CONFLICT ROLLBACK, \r\n"
						+ "    [Password] TEXT);\r\n" + "INSERT INTO \"Login\" VALUES('ADMIN','ADMIN');\r\n" + "";
				stmt.executeUpdate(sql);
				GBLConn.commit();

				System.out.println("Database Created!");
			} else {
				System.out.println("Database Found!");
			}
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Opened database successfully");

	}
}
