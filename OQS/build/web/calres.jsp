<%@page import="cpppackage.CConnectionPro"%>
<%
	if(session.getAttribute("uname")==null){
		response.sendRedirect("slogin.jsp");
	}
%>

<!DOCTYPE html>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
    Connection conn=CConnectionPro.getConnection();
    String query1="select * from cppqb  where username=? order by sno";
    String query2="select ans from cppqb order by sno";
    
    PreparedStatement st=conn.prepareStatement(query1);
    PreparedStatement st2=conn.prepareStatement(query2);
    st.setString(1, (String)session.getAttribute("uname"));
    ResultSet rs1=st.executeQuery();
    ResultSet rs2=st2.executeQuery();
    int c=0 ;int un=0;int w=0;
    while(rs1.next() && rs2.next())
    {
       if(rs1.getString("userans").equals("Not Attempted")){
           un++;
       }
       else if(rs1.getString("userans").equals(rs2.getString("correct_opt"))){
           c++;
       }
       else {
           w++;
       }
       }
    %>
    <br><br><div class='container'><b class="text">Total questions=<%=(un+c+w) %><br>Correct answers=<%=c%><br>Wrong answers=<%=(w) %><br>Unattempted Questions=<%=un%><br><br>
   
    Total Marks Obtained: <%=c%>/<%=un+c+w%></b>
    </div>
    <%
    int temp=un+c+w;
    session.setAttribute("noc", c);
    session.setAttribute("temp",temp);
    conn.close();
    %>

