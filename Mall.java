import java.util.Scanner;
class Appliances
{
	/* 	Two Member Methods    that will be used in constructor		*/

	String [ ] appliances = {"Refrigerator","AirConditioner","Television","Deep Freezer",
			"Generator","Washing Machine","Microwave" } ;
	int [ ] appliances_Price = {65000 ,75000,50000,40000,52000,30000,10000 } ;

/*	Constructor . It will show the details of available appliances along their prices 	*/
	Appliances ( )
	{
		System.out.println ( "\n\t\t\t Welcome To Electric Appliances Shop \n" ) ;		
		System.out.println ( "\t\t\t No. \t"+ String.format ( "%10s\t\t      ",  "Appliances ")
				+  String.format ( "%10s\t","Price")+"\n" ) ;
		for  ( int i = 0 ; i < appliances.length ; i++ )
		{ 
		                  System.out.println ( "\t\t\t" + ( i+1) +"     "
			+String.format ( "%10s\t\t",  appliances [ i ] )+ "     "
				+  String.format ( "%10d\t",appliances_Price[ i ])) ;
		}
	
	}
}
	/*	class "Buy" is inherited or extended from Parent Class "Appliances" 	*/

class Buy extends Appliances
{
	/* 	Two Member Methods    that will be used in constructor		*/

	String [ ] ThingsToBuy ;
	int [ ] priceArray ;

	Scanner input = new Scanner ( System.in ) ;

	/*	Constructor Buy ( ). It involves the whole process of buying appliances.	*/
	Buy ( )
	{
	/*	Super is a keyword that used to call superclass ( parent class ) constructor and  methods.
		Here super( ) is used to call the super class ( Appliances ) constructor.		*/

		super( );		
		
		System.out.print ( "\nHow many things do u want to buy?  " ) ;
		int quantity = input.nextInt ( ) ;

		ThingsToBuy = new String [ quantity ] ;
		priceArray = new int [ quantity ] ;

		
		for ( int i = 0 ; i < quantity ; i++ )
		{
			System.out.print ( "Enter the number of respective thing :  " ) ;
			int nums = input.nextInt( ) ; 
			int num = nums - 1 ; 
			ThingsToBuy [ i ]  = appliances[ num] ;
			priceArray [ i ] = appliances_Price [ num ] ;		
		}
	}
}
/*	class "Bill" is inherited or extended from Class "Buy" 	*/
class Bill extends Buy
{
	int Total ;		//Member


/*	Constructor Bill ( ) . It involves the billing process.	*/
	Bill ( )
	{	super( );
		for  ( int i =  0 ; i < priceArray.length ; i++ )
		{
			Total  = Total + priceArray [ i ] ;
		}
	
		System.out.println ( "\n\t\t\t	 BILL" ) ;	      
		System.out.println ( "\t\t .______________________________________.\n" ) ;
		System.out.println ( "\t\t "+String.format("|%10s\t\t|", "Names"  ) 
					+String.format("|%10s\t|","Price" ) ) ;
		System.out.println ( "\t\t |======================================|" ) ;
		System.out.println ( "\t\t |\t\t\t\t\t|" ) ;

		for  (int i = 0 ; i < ThingsToBuy.length ; i++ )
		{
			System.out.println ( "\t\t "+String.format ( "|%10s\t\t|", ThingsToBuy [ i ]  )
       						 +String.format ( "|%10d\t|", priceArray [ i ] ) ) ; 
		}
		System.out.println ( "\t\t |\t\t\t\t\t|" ) ;
		System.out.println ( "\t\t |--------------------------------------|" ) ; 
		System.out.println ( "\t\t "+String.format ( "|%10s\t\t|", "Total "  ) 
					+ String.format ( "|%10d\t|",Total ) ) ;
		System.out.println ( "\t\t |______________________________________|" ) ; 
	}

	void display( )
	{
		System.out.println("\n\t\t Thanks for shopping." );
	}
}
	/*	 Main Class	*/
public class Mall extends Bill {

	Mall ( )
	{
		super();
		super.display();
	}
	
	public static void main ( String [ ] args )
	{
		
		Mall obj = new Mall( ) ;
	 
	
	}
}
