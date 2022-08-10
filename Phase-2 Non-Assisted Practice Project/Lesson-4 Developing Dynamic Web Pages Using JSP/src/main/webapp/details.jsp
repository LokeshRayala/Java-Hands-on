<%@ page import = " java.util.* " %>
<% 
String username = request.getParameter("details"); 
if(username.equals("laptop") || username.equals("Laptop")){
    session.setAttribute("details",username); 
    response.sendRedirect("laptop.jsp"); 
}

if(username.equals("car") || username.equals("Car")){
    session.setAttribute("details",username); 
    response.sendRedirect("car.jsp"); 
}
if(username.equals("headset") || username.equals("Headset")){
    session.setAttribute("details",username); 
    response.sendRedirect("headset.jsp"); 
}
if(username.equals("mobile") || username.equals("Mobile")){
    session.setAttribute("details",username); 
    response.sendRedirect("mobile.jsp"); 
}
if(username.equals("watch") || username.equals("Watch")){
    session.setAttribute("details",username); 
    response.sendRedirect("watch.jsp"); 
}
else{
    out.print("Invalid Product Name !!! ");  
    out.print("<br>");
    out.print("Enter the product name from the mentioned list.");
}
%>