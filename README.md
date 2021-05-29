# Electric-Appliance-Shop
A complete java program for Electric Appliance Shop using the concept of inheritance

This program is for Electric Appliance Shop. It will Print the details of available appliances along their prices. Then it will ask customer to enter the names of appliance which he wants to buy. Then it will print the Bill.
<pre>
This program is consists of Four Classes:
•	Appliances
•	Buy
•	Bill
•	Mall
</pre>


**Classes along their purpose**

<pre>
Class:        Appliances	
Purpose:      This Class contains code that will welcome and print the list of 
              available appliances along their prices On execution.
</pre>


<pre>
Class:        Buy	
Purpose:      This class is extended from Appliances. This class involves the whole 
              process of buying appliances. In this class, through super( ), 
              the constructor of parent class Appliances is called.
</pre>

<pre>
Class:        Bill	
Purpose:      This class is extended from Buy. This class involves the whole process 
              of Billing. In this class, through super( ) , the constructor of parent 
              class Buy is called.

</pre>

<pre>
Class:        Mall	
Purpose:      This class is extended from Bill. 
              This is the main Class. In this class, constructor is created in which the 
              constructor and method display() of parent class Bill is called through super( ).
              In this class object of Mall is created.

</pre>







	


