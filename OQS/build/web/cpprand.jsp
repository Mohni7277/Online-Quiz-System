
<%@page import="cpppackage.cppentities"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Collections"%>
<%@page import="java.awt.List"%>
<%@page import="java.util.Random"%>
<%!
int i=0;
int temp=0;
cppentities qset;
ArrayList ques;
%>
<head>
<style type="text/css">

.timer
{
	position: relative;
	font-family: "Roboto", sans-serif;
	outline: 0;
   	background: #4CAF50;
   	font-size: 36px;
    max-width: 50px;
    text-align: center;
}
</style>
 <script>
 var Timer;
 var totalSeconds;
 function CreateTimer(TimerID, Time) 
 {
     Timer = document.getElementById(TimerID);
     TotalSeconds = Time;
     UpdateTimer()
     window.setTimeout("Tick()", 1000);
 }
 function Tick() 
 {
     TotalSeconds -= 1;
     if(TotalSeconds ==-1)
       {   
     window.location="cpprand.jsp";
       }
    else
      {
     UpdateTimer()
     window.setTimeout("Tick()", 1000);
      }
 }
 function UpdateTimer() {
     Timer.innerHTML = TotalSeconds;
 }</script>
 </head>

<div class="timer">
<div id='timer'></div>
<script type="text/javascript">window.onload = CreateTimer("timer", 20);</script>
</div>

<%
/* Random r=new Random();
ArrayList<Integer> l=new ArrayList<>();
for(int i=1;i<=100;i++){
	int no=r.nextInt(10);
	
	if(!l.contains(no)){
out.println(no);
l.add(no);
if(l.size()==10){
	break;	
}
}
}
int c=l.size();
out.print( "...............>>>>>>"+c);

out.print("------------------------------------------------------------------------"); */
	if(temp++==0){
		
		//fetch data from session dbdata....................
		
  ArrayList list=(ArrayList)session.getAttribute("dbdata");
		
		//include random class..................
		
  Random r1= new Random();
		
		//create object of Arraylist ques.................
		
  ques= new ArrayList<>();
 
  
  
  	for(int i=1;i<=100;i++){
  		int indexno=r1.nextInt(list.size());
  		
  		qset=(cppentities)list.get(indexno);
  		
  		if(!ques.contains(qset)){
  			ques.add(qset);
  		}
  		if(ques.size()==10){
  			break;
  		}
  		}
	}
	if(temp>ques.size()-1){
		temp=0;
		
	}
	if(i>ques.size()-1){
  		i=0;
  	}
	
  	out.print(ques.size());
  	out.print("<br>");
  	for(int j=0;j<ques.size();j++){
  		qset=(cppentities)ques.get(j);
  		out.print(qset.getSno()+"<>");
  	}
  qset=(cppentities)ques.get(i++);
	out.print("<br>");
	out.print(qset.getSno());
	out.print("<br>");
	out.print(i);
	out.print("<br>");
	out.print(qset.getQuest());
	out.print("<br>");
	out.print(qset.getOpn1());
	out.print("<br>");
	out.print(qset.getOpn2());
	out.print("<br>");
	out.print(qset.getOpn3());
	out.print("<br>");
	out.print(qset.getOpn4());
	out.print("<br>");
	out.print(qset.getAns());
	out.print("<br>");
  	
  	out.print(i);



%>