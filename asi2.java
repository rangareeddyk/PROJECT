import java.util.Scanner;
class asi2
{
public static void main(String[] args)
{
System.out.println("enter a marks");
Scanner scn=new Scanner(System.in);
int m=scn.nextInt();
int s;
if(m<35){
s=1;}
else {
s=2;}
if(35<=50){
s=3;}
else if(50<=60){
s=4;}
else if(60<=70){
s=5;}
else if(70<=80){
s=6;}
else{
s=7;}

switch(s)
{
case 1:
System.out.println("student fail");
break;
case 2:
System.out.println("student pass");
break;
case 3:
System.out.println("Grade D");
break;
case 4:
System.out.println("Grade C");
break;
case 5:
System.out.println("Grade B");
break;
case 6:
System.out.println("Grade A");
break;
case 7:
System.out.println("scent");

}
}
}