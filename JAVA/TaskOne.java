
import java.util.Scanner;

public class TaskOne{
public static void main(String...args){

Scanner input = new Scanner(System.in);
int startTime = (int)System.currentTimeMillis();

final int Number_question = 10;

int correct = 0;
int answer = 0;
int numberAnswered = 0;
int wrong = 0;
int answerCorrectly = 0;


while(numberAnswered != Number_question){
int numberOne = (int)(Math.random() *10);
int numberTwo = (int)(Math.random()*10);

answerCorrectly = numberOne - numberTwo;
if(numberOne > numberTwo){
int change = numberOne;
numberTwo = change ;
numberOne = numberTwo;
}
System.out.println(numberOne + " " + numberTwo);
   answer = input.nextInt();
   numberAnswered +=1;

if(answer == answerCorrectly){
    
    correct += 1;
}

if(wrong >= 2){
    break;

}
}

int stopTime =(int)System.currentTimeMillis();
int total = stopTime - startTime;

System.out.println(" Answered correctly Questioned " + correct);
System.out.println(" Time took to answer " + total/1000 + "seconds" );






}
}


