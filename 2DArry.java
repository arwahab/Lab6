public static void main(String[] args) {

 Scanner scan = new Scanner (System.in ) ;
 System.out.println ("Enter notes here:") ;

 double [] marks= new double [5] ;

 for ( int i=0; i<=4; i++)   
 {
     System.out.println ("Please, input mark for " + i +(" subject")) ; 

     marks[i] = scan. nextDouble () ; 

     while (marks[i]<2 || marks[i]>6)
     {
         System.out.println ("Please, input marks between 2 and 6:") ;
         marks[i] = scan.nextDouble () ;
     }
 }

 double sum=0; 
 double min=marks[0];
 double max=marks[0];

 for ( int i=0; i<=4; i++)
 {
     sum = sum+marks[i] ; 
     if(marks[i]>max)
     {
         max=marks[i];
     }
     if(marks[i]<min)
     {
         min=marks[i];
     }       
 }
 System.out.println("The average is " + sum/5 + ", the minimum is " + min + " and the maximum is " + max); 
}
