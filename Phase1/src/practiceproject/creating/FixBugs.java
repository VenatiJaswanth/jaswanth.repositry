package practiceproject.creating;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class FixBugs{

	public static void main(String[] args) {
		System.out.println("Hello World!");
    System.out.println("\n----------------------------------------------\n");
    System.out.println("\t WELCOME TO THE DESK: \n");
    System.out.println("--------------------------------------------------");
    optionsSelection();
    }
    private static void optionsSelection() {
        String[] array = {"1. I wish to review my expenditure",
                "2. I wish to add my expenditure",
                "3. I wish to delete my expenditure",
                "4. I wish to sort the expenditures",
                "5. I wish to search for a particular expenditure",
                "6. Close the application"
        };
        int[] array1 = {1,2,3,4,5,6};
        int  Slength = array1.length;
        for(int i=0; i<Slength; i++){
            System.out.println(array[i]);
             }
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        ArrayList<Integer> Expenses = new ArrayList<Integer>();
        Expenses.add(1000);
        Expenses.add(2300);
        Expenses.add(45000);
        Expenses.add(32000);
        Expenses.add(110);
        Expenses.addAll(arraylist);
        System.out.println("\nENTER YOUR CHOICE :\t");
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        int  options =  sc.nextInt();
        for(int j=1; j<=Slength; j++){
            if(options == j){
                switch (options){
                    case 1:
                        System.out.println("Your saved expenses are listed below: \n");
                        System.out.println(Expenses+ "\n");
                        optionsSelection();
                        break;
                        
                    case 2:
                        System.out.println("Enter the values to add Your expenses: \n");
                        int value = sc.nextInt();
                        Expenses.add(value);
                        System.out.println("Your values are UPDATED\n");
                        Expenses.addAll(arraylist);
                        System.out.println(Expenses+ "\n");
                        optionsSelection();
                        break;
                        
                    case 3:
                        System.out.println("You want to delete all your expenses!! \n Confirm again by selecting the same option...\n");
                        int con_choice = sc.nextInt();
                        if(con_choice == options){
                               Expenses.clear();
                            System.out.println(Expenses+"\n");
                            System.out.println("All your expenses are deleted!\n");
                        } else {
                            System.out.println("Something went to wrong... try again!");
                        }
                        optionsSelection();
                        break;
                        
                    case 4:
                        sortExpenses(Expenses);
                        optionsSelection();
                        break;
                        
                    case 5:
                        searchExpenses(Expenses);
                        optionsSelection();
                        break;
                        
                    case 6:
                        closeApp();
                        break;
                        
                    default:
                        System.out.println("You have made an invalid choice!");
                        break;
                }
            }
        }

    }
    private static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
            }
    private static void searchExpenses(ArrayList<Integer> arrayList) {
        int length = arrayList.size();
        System.out.println("Enter the expenses you have to search:\t");
        //
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        //Linear Search
        for(int i=0;i<length;i++) {
        	if(arrayList.get(i)==input) {
        		System.out.println("Found the expenses " + input + " at " + i + " Position");
        	}
        }
    }
    private static void sortExpenses(ArrayList<Integer> arrayList) {
        @SuppressWarnings("unused")
		int arraylength =  arrayList.size();
       
        
       Collections.sort(arrayList);
        System.out.println("Sorted expenses: ");
        for(Integer i: arrayList) {
        	System.out.print(i + " ");
        }
        
        System.out.println("\n");
       
    }
}

