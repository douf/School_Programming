 /*
 Program Name: Programming HW #5: Pets
 Programmer Name: Evan Chen
 Date: March 10, 2013
 OS & Compiler: MS Windows 7 x64Bit Ultimate & Eclipse Juno Service Release 1
 Description: 
 Homework 5 Pet abstract superclass: The UML diagram is in comments at the bottom of this class.
 This superclass will get the name and birthYear of the pet. It will also get the current
 age of the pet by subtracting the birthYear from the currentYear (generated by the
 GregorianCalendar method). Two abstract methods convertYears and lifeExpectancy are also declared
 in this superclass. Lastly, the superclass contains the toString that will return the 
 pet type,pet name, and birthYear
 */

package homework;

import java.util.*;

public abstract class Pet {

	protected String name = "No Name";
	protected int birthYear = 2000;
	
	public Pet(String str,int num){
	if(str!=null){
		this.name = str;
	}
	GregorianCalendar gregorianCalendar = new GregorianCalendar();
	if((num>1900) && (num<=(gregorianCalendar.get(GregorianCalendar.YEAR)))){
		this.birthYear = num;
	}
	}
	public Pet(int num){
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		if((num>1900) && (num<=(gregorianCalendar.get(GregorianCalendar.YEAR)))){
			this.birthYear = num;
		}
	}
	public Pet(){
		if(name==null){
			this.name = "No Name";
		}
		this.birthYear = 2000;
	}
	public String getName(){
		return name;
	}
	public int getbirthYear(){
		return birthYear;
	}
	public void setName(String str){
		if(str!=null){
			this.name = str;
		}
	}
	public void setbirthYear(int num){
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		if((num>1900) && (num<=(gregorianCalendar.get(GregorianCalendar.YEAR)))){
			this.birthYear = num;
		}
	}
	public int calcAge(){
		int currentYear;
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		currentYear = gregorianCalendar.get(GregorianCalendar.YEAR);
		
		return(currentYear - this.birthYear);
	}
	public abstract int convertYears();
	public abstract int lifeExpectancy();
	
	public String toString(){
		String className = this.getClass().getSimpleName();
		String petName = this.name;
		
		return(className+" Pet:"+" name="+petName+","+" birth year="+birthYear);
	}
}

/*
-------------------------------------------------------------
Pet<<abstract superclass>>
-------------------------------------------------------------
-name:String
-birthYear:int
-------------------------------------------------------------
+Pet(str:String,num:int)
+Pet(num:int)
+Pet()
<<constructor>>
+getName():String
+getbirthYear():int
+setName(str:String)
+setbirthYear(num:int)
+calcAge():int
+convertYears():int <<abstract>>
+lifeExpectancy():int <<abstract>>
+toString():String
-------------------------------------------------------------
 */