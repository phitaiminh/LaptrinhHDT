package sqlitejdbc;

import java.sql.*;

public class SQLiteJDBC {
  public static void main( String args[] ) {
    Connection c = null;
      
    try {
        //Class.forName("org.sqlite.JDBC");
        c = DriverManager.getConnection("sqlite-jdbc-3.7.2:ebookshop.db");
    } 
    catch ( SQLException e ) {
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.exit(0);
    }
    System.out.println("Opened database successfully");
    Statement stmt = null;
      
    try {

        c = DriverManager.getConnection("sqlite-jdbc-3.7.2:ebookshop.db");
        System.out.println("Opened database successfully");

        stmt = c.createStatement();
        String sql = "CREATE TABLE COMPANY " +
                     "(ID INT PRIMARY KEY     NOT NULL," +
                     " TITLE         CHAR(50)   NOT NULL, " + 
                     " AUTHOR         CHAR(50)     NOT NULL, " + 
                     " PRICE        FLOAT, " + 
                     " QTY         INT)"; 
        stmt.executeUpdate(sql);
        stmt.close();
        c.close();
        } 
        catch (SQLException e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Table created successfully");
        
        try {
            c = DriverManager.getConnection("jdbc:sqlite:ebookshop.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String sql = "INSERT INTO COMPANY (ID,TITLE,AUTHOR,PRICE,QTY) " +
                        "VALUES (1001, 'Java for dummies', 'Tan Ah Teck', 11.11, 11);"; 
            stmt.executeUpdate(sql);

            sql = "INSERT INTO COMPANY (ID,TITLE,AUTHOR,PRICE,QTY) " +
                  "VALUES (1002, 'More Java for dummies', 'Tan Ah Teck', 22.22, 22);"; 
            stmt.executeUpdate(sql);

            sql = "INSERT INTO COMPANY (ID,TITLE,AUTHOR,PRICE,QTY) " +
                  "VALUES (1003, 'More Java for more dummies', 'Mohammad Ali', 33.33, 33);"; 
            stmt.executeUpdate(sql);

            sql = "INSERT INTO COMPANY (ID,TITLE,AUTHOR,PRICE,QTY) " +
                  "VALUES (1004, 'A Cup of Java', 'Kumar', 44.44, 44);"; 
            stmt.executeUpdate(sql);
            
            sql = "INSERT INTO COMPANY (ID,TITLE,AUTHOR,PRICE,QTY) " +
                  "VALUES (1005, 'A Teaspoon of Java', 'Kevin Jones', 55.55, 55);"; 
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
        } 
        catch (SQLException e ) {
             System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Records created successfully");
        
        //select
        
        try {
            c = DriverManager.getConnection("sqlite-jdbc-3.7.2:ebookshop.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
        try (ResultSet rs = stmt.executeQuery( "SELECT * FROM ebookshop;" )) {
            while ( rs.next() ) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                String author  = rs.getString("author");
                float price = rs.getFloat("price");
                int qty = rs.getInt("qty");
         
                System.out.println( "ID = " + id );
                System.out.println( "TITLE = " + title);
                System.out.println( "AUTHOR = " + author);
                System.out.println( "PRICE = " + price);
                System.out.println( "QTY = " + qty);
                System.out.println();
            }
        }
            stmt.close();
            c.close();
        } 
        catch (SQLException e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Operation done successfully");
        
        //delete
        try {
            c = DriverManager.getConnection("jdbc:sqlite:ebookshop   bdeee.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String sql = "DELETE from ebookshop where ID = 1001;";
            stmt.executeUpdate(sql);
            c.commit();

        try (ResultSet rs = stmt.executeQuery( "SELECT * FROM ebookshop;" )) {
            while ( rs.next() ) {
                int id = rs.getInt("id");
                String  title = rs.getString("title");
                String author  = rs.getString("author");
                float  price = rs.getFloat("price");
                int qty = rs.getInt("qty");
         
                System.out.println( "ID = " + id );
                System.out.println( "TITLE = " + title);
                System.out.println( "AUTHOR = " + author);
                System.out.println( "PRICE = " + price);
                System.out.println( "QTY = " + qty);
                System.out.println();
            }
        }
            stmt.close();
            c.close();
        } 
        catch (SQLException e ) {
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.exit(0);
        }
        System.out.println("Operation done successfully");
    }
}


