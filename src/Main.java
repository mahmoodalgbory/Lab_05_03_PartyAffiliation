public class
Main
{
    public static void main(String[] args)
    {
       String userOpinion = "I";
       userOpinion= userOpinion.toUpperCase();


       if(userOpinion == "R")
           System.out.println("You get the republican elephant! ");
       else if (userOpinion == "D")
       {
           System.out.println("You get the democratic donkey! ");
       } else if (userOpinion == "I")
       {
        System.out.println("you get the independant man!");
       }
       else
           System.out.println("You get other");


    }
}




//Class PoliticalAffiliation
//  main ()
//	String userOpinion
//
//	Output "What is your political party affiliation   [R,D,I] "
//	input userOpinion
//
//	if userOpinion == "R" then
//	   output "You get the republican elephant! "
//	elseIf userOpinion == "D" then
//	   output "You get the democratic doney! "
//	else
//		output "you get the independant man! "
//	endIf
//
//  return