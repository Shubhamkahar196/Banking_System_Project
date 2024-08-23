import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class User {
   private Connection connection;
   private Scanner sc;

   public User(Connection connection , Scanner sc){
       this.connection = connection;
       this.sc = sc;
   }

   public void register(){
       sc.nextLine();
       System.out.print("Full Name : ");
       String full_name = sc.nextLine();
       System.out.print("Email : ");
       String email = sc.nextLine();
       System.out.print("Password : ");
       String password = sc.nextLine();
       if(user_exist(email)) {
           System.out.println("User Already Exists for this Email Address!!");
           return;
       }
       String register_query = "INSERT INTO users(full_name,email,password) VALUES(?,?,?)";
       try{
           PreparedStatement preparedStatement = connection.prepareStatement(register_query);
           preparedStatement.setString(1,full_name);
           preparedStatement.setString(2,email);
           preparedStatement.setString(3,password);
           int affectRows = preparedStatement.executeUpdate();
           if(affectRows > 0){
               System.out.println("Register Successfully!");
           }else{
               System.out.println("Register Failed!!");
           }
       }catch (SQLException e){
           e.printStackTrace();
       }
   }

   public String login(){
       sc.nextLine();
       System.out.print("Email : ");
       String email = sc.nextLine();
       System.out.print("Password : ");
       String password = sc.nextLine();
       String login_query = "SELECT * FROM users WHERE email = ? AND password = ?";
       try{
           PreparedStatement preparedStatement = connection.prepareStatement(login_query);
           preparedStatement.setString(1,email);
           preparedStatement.setString(2,password);
           ResultSet resultSet = preparedStatement.executeQuery();
           if(resultSet.next()){
               return email;
           }else{
               return null;
           }
       }catch (SQLException e){
           e.printStackTrace();
       }
       return null;
   }

   public boolean user_exist(String email){
       String query = "SELECT * FROM users WHERE email = ?";
       try{
           PreparedStatement preparedStatement = connection.prepareStatement(query);
           preparedStatement.setString(1,email);
           ResultSet resultSet = preparedStatement.executeQuery();
           if(resultSet.next()){
               return true;
           }else{
               return false;
           }
       }catch(SQLException e){
           e.printStackTrace();
       }
       return false;
   }
}
