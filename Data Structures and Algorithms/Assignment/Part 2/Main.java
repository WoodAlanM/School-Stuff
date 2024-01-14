// Alan Wood Assignment for Data Structures and Algorithms
// Part 2
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
    public static void main(String[] args){
        // Initialize scanner for accepting command line input.
        Scanner scanner = new Scanner(System.in);
        
        BST bst = new BST();

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

        // Display a prompt so the user knows what to expect
        System.out.println("This is a program to test your knowledge of United States Capitals. \n");        
        System.out.println("First, you will be shown a list of states");
        System.out.println("and capitals to refresh your memory");
        System.out.println("To continue, press ENTER.");

        // Accept an input
        String readString = scanner.nextLine();

        Boolean enterNotPressed = true;

        // Halt program to wait for user response
        while (enterNotPressed == true){
            if (readString.isEmpty()){
                enterNotPressed = false;
            }
        }

        // Create and fill the HashMap using the stateCapitalArray
        HashMap<String, String> stateCapitalsHashMap = new HashMap<String, String>();
        for (int i = 0; i < 50; i++){
            stateCapitalsHashMap.put(stateCapitalArray[0][i], stateCapitalArray[1][i]);
        }

        // Display HashMap contents to user.
        for (Map.Entry<String, String> entry : stateCapitalsHashMap.entrySet()){
            String state = entry.getKey();
            String capital = entry.getValue();
            System.out.println("State: " + state + ", Capital: " + capital);
        }

        // Create a TreeMap and then fill it using the HashMap from before
        TreeMap<String, String> stateCapitalsTreeMap = new TreeMap<String, String>();
        for (Map.Entry<String, String> entry : stateCapitalsHashMap.entrySet()){
            String state = entry.getKey();
            String capital = entry.getValue();
            stateCapitalsTreeMap.put(state, capital);
        }
        
        // Fill the Binary Search Tree using the sorted TreeMap
        for (Map.Entry<String, String> entry : stateCapitalsTreeMap.entrySet()){
            
        }

        // Boolean notCycled = true;
        // int stateCount = 0;
        // int correctCount = 0;

        // System.out.println("\n\nPress ENTER after each entry to continue.\n\n");

        // // Begin the capital quizzing portion
        // while (notCycled == true){
        //     if (stateCount < 50){
        //         System.out.println(String.format("What is the capital of %s? ", stateCapitalArray[0][stateCount].toString()));
        //         String inputCapital = scanner.nextLine();
        //         String currentCapital = stateCapitalArray[1][stateCount].toString();
        //         if (inputCapital.toLowerCase().compareTo(currentCapital.toLowerCase()) == 0){
        //             correctCount++;
        //         }
        //         stateCount++;
        //     }else {
        //         notCycled = false;
        //     }
        // }// End While

        // // After the quizzing cycle is completed, display number correct and exit.
        // System.out.println(String.format("\n\nGreat job!  You got %d correct.\n\n", correctCount));
    }
};// Main


