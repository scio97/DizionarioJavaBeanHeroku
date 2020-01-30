package servlet;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
import java.sql.Statement;
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class Modifica implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	private String termine;
    private String significato;
	public Modifica(){
		
	}
	public String getRisultato(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://eu-cdbr-west-02.cleardb.net/heroku_cc602ece3a9cc08?user=b2f1387a4d8c19&password=08eb3522");
			Statement stmt = con.createStatement();
			if(stmt.executeUpdate("UPDATE termini SET significato='"+significato+"' WHERE termine='"+termine+"'")==0){
                return "Termine non trovato";
			}else{
                return "termine modificato";
			}
		}catch(Exception e){
			return "errore";
		}
	}
	public void setTermine(String val){
		termine=val;
    }
    public void setSignificato(String val){
		significato=val;
	}
	
}