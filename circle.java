 /*A java program to compute the area and perimeter of a circle */

public class circle {
//initialize the radius with value 7
    double radius = 7, area, perimeter;
    //initialize pie
    double PIE = 3.142;//not recommended
public static void main(String[] args) {
   //create an object of cicle class
   circle circleobj = new circle ();

   /*accessing members using object
    objectname.membersname;
         variables:
         objectname.variablename;

         methods:
         objectname.methodname(arguments);
        
   */
   
   
//compute area:
circleobj.area = circleobj.PIE * circleobj.radius * circleobj.radius; 
System.out.println("Area is:" + circleobj.area);

//compute perimeter:
circleobj.perimeter = 2 * circleobj.PIE * circleobj.radius;
   }

}
    

