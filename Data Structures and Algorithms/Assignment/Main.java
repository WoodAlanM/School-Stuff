// Alan Wood Assignment for Data Structures and Algorithms
// 1/12/2024

// States:
/* Alabama, Alaska, Arizona, Arkansas, California, Colorado, 
Connecticut, Delaware, Florida, Georgia, Hawaii, Idaho, Illinois, 
Indiana, Iowa, Kansas, Kentucky, Louisiana, Maine, Maryland, 
Massachusetts, Michigan, Minnesota, Mississippi, Missouri, 
Montana, Nebraska, Nevada, New Hampshire, New Jersey, New Mexico, 
New York, North Carolina, North Dakota, Ohio, Oklahoma, Oregon, 
Pennsylvania, Rhode Island, South Carolina, South Dakota, Tennessee, 
Texas, Utah, Vermont, Virginia, Washington, West Virginia, Wisconsin, 
Wyoming */

// Capitals:
/* Montgomery, Juneau, Phoenix, Little Rock, Sacramento, Denver, 
Hartford, Dover, Tallahassee, Atlanta, Honolulu, Boise, Springfield, 
Indianapolis, Des Moines, Topeka, Frankfort, Baton Rouge, Augusta, 
Annapolis, Boston, Lansing, Saint Paul, Jackson, Jefferson City, 
Helena, Lincoln, Carson City, Concord, Trenton, Santa Fe, Albany, 
Raleigh, Bismarck, Columbus, Oklahoma City, Salem, Harrisburg, 
Providence, Columbia, Pierre, Nashville, Austin, Salt Lake City, 
Montpelier, Richmond, Olympia, Charleston, Madison, Cheyenne */

// These lists are in order so that each state will align with 
// its associated capital.

// Part 1:
import java.util.*; // Import Scanner class for input 

public class Main {
    // bubbleSort method
    static void bubbleSort(String statesCapitals[][]){
        // Variables to hold the first letters of each capital
        char cOneFirst;
        char cTwoFirst;

        for (int l = 0; l < 49; l++){
            for (int m = 0; m < (49 - l); m++){
                cOneFirst = statesCapitals[1][m].charAt(0);
                cTwoFirst = statesCapitals[1][m+1].charAt(0);
                if (Character.compare(cOneFirst, cTwoFirst) > 0){
                    // If the next capital is alphabetically greater
                    // store the corresponding capital and state 
                    // temporarily in associated variables
                    String tempCapital = statesCapitals[1][m];
                    String tempState = statesCapitals[0][m];
                    
                    // Switch capital and state to previous position
                    statesCapitals[1][m] = statesCapitals[1][m+1];
                    statesCapitals[0][m] = statesCapitals[0][m+1];

                    // Move the other capital and state to the next position
                    statesCapitals[1][m+1] = tempCapital;
                    statesCapitals[0][m+1] = tempState;    
                }
            }
        }
    }// End bubbleSort

    public static void main(String[] args){
        // Initialize scanner for accepting command line input.
        Scanner scanner = new Scanner(System.in);
        
        // Populate States and Capitals array
        String[][] stateCapitalArray = {
            {"Alabama","Alaska","Arizona","Arkansas","California",
            "Colorado","Connecticut","Delaware","Florida","Georgia",
            "Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas",
            "Kentucky","Louisiana","Maine","Maryland","Massachusetts",
            "Michigan","Minnesota","Mississippi","Missouri","Montana",
            "Nebraska","Nevada","New Hampshire","New Jersey","New Mexico",
            "New York","North Carolina","North Dakota","Ohio","Oklahoma",
            "Oregon","Pennsylvania","Rhode Island","South Carolina",
            "South Dakota","Tennessee","Texas","Utah","Vermont",
            "Virginia","Washington","West Virginia","Wisconsin","Wyoming"},
            {"Montgomery","Juneau","Phoenix","Little Rock","Sacramento",
            "Denver","Hartford","Dover","Tallahassee","Atlanta",
            "Honolulu","Boise","Springfield","Indianapolis","Des Moines",
            "Topeka","Frankfort","Baton Rouge","Augusta","Annapolis",
            "Boston","Lansing","Saint Paul","Jackson","Jefferson City",
            "Helena","Lincoln","Carson City","Concord","Trenton",
            "Santa Fe","Albany","Raleigh","Bismarck","Columbus",
            "Oklahoma City","Salem","Harrisburg","Providence","Columbia",
            "Pierre","Nashville","Austin","Salt Lake City","Montpelier",
            "Richmond","Olympia","Charleston","Madison","Cheyenne"}
        };
        // Im showing brody something
        // Display a prompt so the user knows what to expect
        System.out.println("This is a program to test your knowledge of United States Capitals. \n");
        System.out.println("First, you will be shown a list of tates and their \ncorresponding capitals to refresh your memory. \n");
        System.out.println("To continue, press ENTER.");

        // Accept an input
        String readString = scanner.nextLine();

        Boolean enterNotPressed = true;

        while (enterNotPressed == true){
            if (readString.isEmpty()){
                enterNotPressed = false;
            }
        }

        // Display the array for the user ie. each pair of State and Capital's
        for (int i = 0; i < 50; i++){
            System.out.println("State: " + stateCapitalArray[0][i].toString() + ", Capital: " + stateCapitalArray[1][i].toString());
        }

        // Sort the array by capitals.
        bubbleSort(stateCapitalArray);

        Boolean notCycled = true;
        int stateCount = 0;
        int correctCount = 0;

        System.out.println("\n\nPress ENTER after each entry to continue.\n\n");

        // Begin the capital quizzing portion
        while (notCycled == true){
            if (stateCount < 50){
                System.out.println(String.format("What is the capital of %s? ", stateCapitalArray[0][stateCount].toString()));
                String inputCapital = scanner.nextLine();
                String currentCapital = stateCapitalArray[1][stateCount].toString();
                if (inputCapital.toLowerCase().compareTo(currentCapital.toLowerCase()) == 0){
                    correctCount++;
                }
                stateCount++;
            }else {
                notCycled = false;
            }
        }// End While

        // After the quizzing cycle is completed, display number correct and exit.
        System.out.println(String.format("\n\nGreat job!  You got %d correct.\n\n", correctCount));
    }
};// Main


