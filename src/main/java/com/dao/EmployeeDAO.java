package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.beans.Employee;
import com.beans.Employee;
import com.beans.logindetails;
import com.databaseconn.JDBCconnection;
import com.mysql.cj.protocol.Resultset;

public class EmployeeDAO {
	
	
	public boolean insertdata(logindetails reg)
	{
		String sql="insert into registration values(?,?,?,?)";
		try
		{
			PreparedStatement st=JDBCconnection.getconnect().prepareStatement(sql);
            st.setInt(1, reg.getEmpid());
            st.setString(2, reg.getEmpname());
            st.setString(3, reg.getContact());
            st.setString(4, reg.getEmail());
            
            return st.executeUpdate()>0;
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean logininsert(Employee emp)
	{
		String sql="insert into login values(?,?,?)";
		try {
			PreparedStatement st=JDBCconnection.getconnect().prepareStatement(sql);
            st.setInt(1, emp.getEmpid());
            st.setString(2, emp.getEmpname());
            st.setString(3, emp.getDate_time());
           
            return st.executeUpdate()>0;
            
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
public List<logindetails> getUser()
    
    {
        List<logindetails> list=new ArrayList<>();
        String sql="select * from registration";
        
        try {
            PreparedStatement st=JDBCconnection.getconnect().prepareStatement(sql);
            ResultSet res=st.executeQuery();
            logindetails users=null;
            
            while(res.next())
            {	
            	int empid=res.getInt("empid");
                String empname=res.getString("empname");
                String contact=res.getString("contact");
                String email=res.getString("email");
               
                users=new logindetails(empid,empname,contact,email);
                list.add(users);
                
            }
            
        }
        
        
        catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return list;
        
    }

public List<Employee> getlogindetails()

{
    List<Employee> list=new ArrayList<>();
    Employee users=null;
    String sql="select * from login";
    
    try {
        PreparedStatement st=JDBCconnection.getconnect().prepareStatement(sql);
        ResultSet res=st.executeQuery();
       
        
        while(res.next())
        {
            int empid1=res.getInt("empid");
        	String empname1=res.getString("empname");
            String date_time1=res.getString("ldate");
           
            users=new Employee(empid1,empname1,date_time1);
            list.add(users);
            
        }
        
    }
    
    
    catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
    return list;
    
}


	

}
