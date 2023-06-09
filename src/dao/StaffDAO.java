package dao;

import model.Staff;
import java.util.List;
import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Role;
import model.User;

public class StaffDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public List<Staff> showStaff(String query){
        con = dbCon.makeConnection();
        String sql = "SELECT * FROM staff as s JOIN role as r on s.idRole = r.idRole JOIN user as u on s.idUser = u.idUser  WHERE"
                + "(NIP LIKE '%" +query + "%'"
                + "OR s.nama LIKE '%" + query + "%'"
                + "OR s.TahunMasuk LIKE '%" + query + "%'"
                + "OR s.noTelp LIKE '%" + query + "%'"
                + "OR s.alamat LIKE '%" + query + "%'"
                + "OR r.namaRole LIKE '%" + query + "s'"
                + "OR u.username LIKE '%" + query + "%'"
                + "OR u.password LIKE '%" + query + "%'"
                + ")";
        
        System.out.println(sql);
        System.out.println("Menambil data setaff");
        List<Staff> list = new ArrayList();
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
                while(rs.next()){
                    Role r = new Role(rs.getInt("r.idRole"),rs.getDouble("r.gaji"),rs.getString("r.namaRole"));
                    User u  = new User(rs.getInt("u.idUser"), rs.getString("u.username"),rs.getString("u.password"));
                    Staff s = new Staff(
                    rs.getInt("s.NIP"),
                    rs.getString("s.nama"),
                    rs.getString("s.tahunMasuk"),
                    rs.getString("s.NoTelp"),
                    rs.getString("s.alamat"),r,u
                    );
                    list.add(s);
                }
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error Reading Database");
            e.printStackTrace();
        }
        dbCon.closeConnection();
        return list;
    }
    
    public void insertStaff(Staff s){
        con = dbCon.makeConnection();
        
        String sql ="INSERT INTO `staff`(`idUser`,`idRole`, `nama`, `TahunMasuk`, `noTelp`, `alamat`) VALUES ('" 
                + s.getUser().getIdUser() + "','"
                + s.getRole().getIdRole()+ "','"
                + s.getNama() +"','" 
                + s.getTahunMasuk() +"','" 
                +s.getNoTelp()+ "','" 
                +s.getAlamat()+"')";
        
        System.out.println("Adding Staff...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+ result + " Staff" );
            statement.close();
        }catch(Exception e){
            System.out.println("Error Adding Staff.."); 
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public void updateStaff(Staff s){
        con = dbCon.makeConnection();
        
        String sql = "UPDATE staff SET idRole  = '" + s.getRole().getIdRole()
                + "', nama= '" + s.getNama()
                + "', TahunMasuk = '" + s.getTahunMasuk()
                + "', noTelp = '" + s.getNoTelp()
                + "', alamat = '" + s.getAlamat()
                + "' WHERE NIP = '" + s.getNIP() + "'";
        
        System.out.println("Editing Setaf");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + " Staff " + s.getNIP());
            statement.close();
        }catch(Exception e){
            System.out.println("Error Editing Staff");
            System.out.println(e);
        }
    }
    
    public void deleteStaf(int nip){
        con = dbCon.makeConnection();
        
        String sql = "DELETE FROM staff WHERE NIP = " + nip + "";   
        System.out.println("Deleting staff");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " + result +"Staff " + nip);
            statement.close();
        }catch (Exception e){
            System.out.println("Error deleting Staff...");
            System.out.println(e);
        }
        
        dbCon.closeConnection();
    }
}
