import java.util.Scanner;
public class IT24300344Lab10Q1{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the mark (0 - 100) : ");
int mark = scanner.nextInt();
assert (mark>=0 && mark <=100):"Invalid Mark";
System.out.println("Mark is Validated");
char grade;
if(mark>=75){
grade='A';}
else if(mark>=60){
grade='B';}
else if(mark>=50){
grade='C';}
else if(mark>=40){
grade='D';}
else{
grade='F';}
assert (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F'): "Incorrect Grade Assigned";
System.out.println("The Grade for the Entered Mark is: "+ grade);
}
}