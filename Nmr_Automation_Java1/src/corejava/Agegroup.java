package corejava;

public class Agegroup {
public static void main(String[] args) {
    int age = 1;
	//infant(0-2)
//	child(2-12)
//	younger(12-25)
//	adult(25-59)
//	sr.ctizen(59-100)
    if (age>0 && age<=2 ) {
    	System.out.println("The input comes under Infant age between 0-2 only ");
    } else if (age>2 && age<=12) {
    	System.out.println("The input comes under Child age ");
    }
    else if (age>12 && age<=25) {
    	System.out.println("The input comes under Younger age ");
    }
    else if (age>25 && age<=59) {
    	System.out.println("The input comes under Adult age ");
    }
    else if (age>59 && age<=100) {
  System.out.println("The input comes under Sr.Ctizen age ");
    } 
    

    }
	
	
	
	
	
	
	
}

