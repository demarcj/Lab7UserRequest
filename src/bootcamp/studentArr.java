package bootcamp;

import java.util.Scanner;

/**
 * Created by DeMarcj on 2/9/2017.
 */
public class studentArr {
    public static void main(String[] args) {
        System.out.println("Welcome to our Java class. Which student would you like to learn more about?");
        getStudent();
        System.out.println("Thank you!");
    }

    public static void getStudent(){
        Scanner scan = new Scanner(System.in);
        final int TOTAL_STUDENT = 20;
        String[] studentName = new String[TOTAL_STUDENT];
        String[] favoriteMovie = new String[TOTAL_STUDENT];
        String[] hometown = new String[TOTAL_STUDENT];
        int i = 0;
        int studentID = 0;
        String repeatStudent = "";

        studentName[i] = "DeMarc Johnson";        favoriteMovie[i] = "Princess Mononoke";   hometown[i] = "Detroit"; i++;
        studentName[i] = "Royce T. Greenfield";   favoriteMovie[i] = "Donnie Darko";        hometown[i] = "Ann Arbor"; i++;
        studentName[i] = "Mark Hunter";           favoriteMovie[i] = "Drunken Master";      hometown[i] = "Chicago"; i++;
        studentName[i] = "Kindle Jones";          favoriteMovie[i] = "The Game of Death";   hometown[i] = "Los Angeles"; i++;
        studentName[i] = "Charles Joe Jackson";   favoriteMovie[i] = "Reservoir Dogs";      hometown[i] = "Selma"; i++;
        studentName[i] = "John Everyman";         favoriteMovie[i] = "The Matrix";          hometown[i] = "New York"; i++;
        studentName[i] = "Hitomi Tanaka";         favoriteMovie[i] = "Tetsou the Iron Man"; hometown[i] = "Tokyo"; i++;
        studentName[i] = "Joselin Lopez";         favoriteMovie[i] = "Lost in Translation"; hometown[i] = "Mexico City"; i++;
        studentName[i] = "Xiao Hai";              favoriteMovie[i] = "Hero";                hometown[i] = "Shanghai"; i++;
        studentName[i] = "Jarvis Brown";          favoriteMovie[i] = "Enter the Void";      hometown[i] = "New Jersey"; i++;
        studentName[i] = "Terah Weddington";      favoriteMovie[i] = "Butterfly Graveyard"; hometown[i] = "Miami"; i++;
        studentName[i] = "Maria Hernez";          favoriteMovie[i] = "Old Boy";             hometown[i] = "Costa Rica"; i++;
        studentName[i] = "Hana Yamazaki";         favoriteMovie[i] = "Ghost in the Shell";  hometown[i] = "Okinawa"; i++;
        studentName[i] = "Ryan Montgomery";       favoriteMovie[i] = "Redline";             hometown[i] = "Bangkok"; i++;
        studentName[i] = "Danny Brown";           favoriteMovie[i] = "American Psycho";     hometown[i] = "Manila"; i++;
        studentName[i] = "Max Powers";            favoriteMovie[i] = "Streamboy";           hometown[i] = "Dubai"; i++;
        studentName[i] = "Heba Muhammad";         favoriteMovie[i] = "Akira";               hometown[i] = "Royal Oak"; i++;
        studentName[i] = "Zodd Nosferatu";        favoriteMovie[i] = "The Excorist";        hometown[i] = "Cleveland"; i++;
        studentName[i] = "Torai Dawkins";         favoriteMovie[i] = "7 Samurai";           hometown[i] = "Clinton Twp"; i++;
        studentName[i] = "John Williams";         favoriteMovie[i] = "Pulp Fiction";        hometown[i] = "St. Louis"; i++;

        //Start of the data input
        do{
            boolean repeaterInput = false;
            System.out.println("Enter a number 1 - 20");

            //Checks for the student's name
            while (!repeaterInput) {
                int getID = scan.nextInt();
                studentID = getID - 1;
                if (studentID >= 20 || studentID < 0) {
                    System.out.println("That student does not exist. Please try again.");
                } else {
                    System.out.print("Student " + (studentID + 1) + " is " + studentName[studentID] + ". ");
                    System.out.println("What would you like to know about " + getFirstName(studentName[studentID]) + "?");
                    repeaterInput = true;
                }
            }//Ends the while loop for the student's name

            repeaterInput = false;
            System.out.println("Enter 1 for favorite movie or 2 for hometown");

            //Gives information about the student's hometown or favorite movie
            while (!repeaterInput) {
                int userChoice = scan.nextInt();
                if (userChoice > 2 || userChoice <= 0) {
                    System.out.println("That option does not exist. Please try again");
                } else if (userChoice == 1) {
                    System.out.println(favoriteMovie[studentID]);
                    repeaterInput = true;
                } else {
                    System.out.println(hometown[studentID]);
                    repeaterInput = true;
                }
            }//Ends the while loop for the student's information

            System.out.println("Would like to know more? Enter: Yes or No");
            repeatStudent = scan.next();
        } while(repeatStudent.equalsIgnoreCase("yes"));
        //This loop will start program at the get student's name at the beginning
    }

    //Gets the first name in the string
    public static String getFirstName(String name){
        return name.substring(0, name.indexOf(" "));
    }
}
