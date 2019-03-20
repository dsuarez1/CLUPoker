package Server;
// -- download MySQL from: http://dev.mysql.com/downloads/
//    Community Server version
// -- Installation instructions are here: http://dev.mysql.com/doc/refman/5.7/en/installing.html
// -- open MySQL Workbench to see the contents of the database
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

// -- MAKE SURE THE JDBC CONNECTOR JAR IS IN THE BUILD PATH
//    workspace -> properties -> Java Build Path -> Libraries -> Add External JARs...
// -- C:\Program Files (x86)\MySQL\Connector J 5.1.26\mysql-connector-java-5.1.26-bin.jar
public class DBaseConnection {

	// -- objects to be used for database access
    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rset = null;

    // -- connect to the world database
    // -- this is the connector to the database, default port is 3306
//    private String url = "jdbc:mysql://localhost:3306/world";
    private String url = "jdbc:mysql://localhost/decimalCalcUsers";
    
    // -- this is the username/password, created during installation and in MySQL Workbench
    //    When you add a user make sure you give them the appropriate Administrative Roles
    //    (DBA sets all which works fine)
    private String user = "root";
    private String password = "research2018!";

	public DBaseConnection() {
		try {
            // -- make the connection to the database
			conn = DriverManager.getConnection(url, user, password);
            
			// -- These will be used to send queries to the database
            stmt = conn.createStatement();
            rset = stmt.executeQuery("SELECT VERSION()");

           
            
            
           
//            String insert = "insert into users values('" + name + "', '" + failed + "', '" + pass + "', '" + email + "');";
//            System.out.println(insert);
//            stmt.executeUpdate(insert);
            
//            // -- update an existing record
//            String update = "update users set username='name17' where username='name16';";
//            stmt.executeUpdate(update);
//
            // -- retrieve record(s) from database
//            String command = "SELECT * FROM users;";
//            System.out.println(command);
//            // -- a query will return a ResultSet
//            // -- city is a table within the world database
//            rset = stmt.executeQuery(command);
//            
//            // -- the metadata tells us how many columns in the data
//            ResultSetMetaData rsmd = rset.getMetaData();
//            int numberOfColumns = rsmd.getColumnCount();
//            System.out.println("columns: " + numberOfColumns);
//            
//            // -- loop through the ResultSet one row at a time
//            //    Note that the ResultSet starts at index 1
//            while (rset.next()) {
//            	// -- loop through the columns of the ResultSet
//            	for (int i = 1; i < numberOfColumns; ++i) {
//            		System.out.print(rset.getString(i) + "\t\t");
//            	}
//            	System.out.println(rset.getString(numberOfColumns));
//            }

		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}

	}

        public boolean loginUser(String username, String password){
            int lockedCount = 0;
        try
        { 
            String command = "SELECT * FROM users WHERE username = '" + username + "';";
            try
            {
                String pass = "";
                rset = stmt.executeQuery(command);
                rset.next();
                pass = rset.getString("password");
                lockedCount = rset.getInt("failed_attempt");
                
            if(password.equals(pass)){
                return true;
            }
            } catch (SQLException ex)
            {
                Logger.getLogger(DBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(rset.getString(1));
        } catch (SQLException ex)
        {
            Logger.getLogger(DBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        lockedCount++;
        System.out.println("LockedCount " + lockedCount);
        String update = "update users set failed_attempt='" + lockedCount + "' where username='" + username + "';";
        try
        {
            stmt.executeUpdate(update);
        } catch (SQLException ex)
        {
            Logger.getLogger(DBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        }
        
	public boolean checkUserExist(String username){
            
            String command = "SELECT * FROM users WHERE userName = '" + username + "';";
        try
        {
            rset = stmt.executeQuery(command);
        } catch (SQLException ex)
        {
            Logger.getLogger(DBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        try
        {
            if(rset.next()){
                return true;
            }
        } catch (SQLException ex)
        {
            Logger.getLogger(DBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
            return false;
        }
        
        
        
        
        public boolean recoverPassword(String email){
            
            String command = "SELECT * FROM users WHERE email = '" + email + "';";
        try
        {
            rset = stmt.executeQuery(command);
        } catch (SQLException ex)
        {
            Logger.getLogger(DBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        try
        {
            if(!(rset.next())){
                return false;
            } 
        } catch (SQLException ex)
        {
            Logger.getLogger(DBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
            String pass = generatePassword();
            String update = "update users set password='" + pass + "' where email='" + email + "';";
            String update2 = "update users set failed_attempt='" + 0 + "' where email='" + email + "';";
            //SendEmail.sendEmail(email,pass);
        try
        {
            stmt.executeUpdate(update);
            stmt.executeUpdate(update2);
        } catch (SQLException ex)
        {
            Logger.getLogger(DBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
            return true;
        }
        
        
        
        
        public void addUser(String username,String pass,String email){
            String insert = "insert into users values('" + username + "', '" + 0 + "', '" + pass + "', '" + email + "');";
        try
        {
            stmt.executeUpdate(insert);
        } catch (SQLException ex)
        {
            Logger.getLogger(DBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
	

        public boolean checkLocked(String username){
            String command = "SELECT * FROM users WHERE userName = '" + username + "';";
            try
        {
            rset = stmt.executeQuery(command);
        } catch (SQLException ex)
        {
            Logger.getLogger(DBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        try
        {
            rset.next();
            int lockedCount = rset.getInt("failed_attempt");
            if(lockedCount >= 3){
                return false;
            }
        } catch (SQLException ex)
        {
            Logger.getLogger(DBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
            return true;
        }
        
        public void changePassword(String userName,String newPass){
            String update = "update users set password='" + newPass + "' where userName='" + userName + "';";
        try
        {
            stmt.executeUpdate(update);
        } catch (SQLException ex)
        {
            Logger.getLogger(DBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        private String generatePassword(){
            Random rand = new Random();
            StringBuilder b = new StringBuilder();
            b.append('a');

            for(int i = 0;i<7;i++){
                int num = rand.nextInt(9);
                b.append(String.valueOf(num));
            }
            String pass = b.toString();
            return pass;
        }
}
