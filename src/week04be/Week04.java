package week04be;

public class Week04 {

    public static void main(String[] args) {
        // 1. Create an array of int called ages
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

        // a. Programmatically subtract the value of the first element in the array from the value in the last element of the array
        int difference = ages[ages.length - 1] - ages[0];
        System.out.println("Difference between the first and last ages: " + difference);

        // b. Create a new array of int called ages2 with 9 elements
        int addedAge = 68;
        int[] ages2 = new int[ages.length + 1];
        System.arraycopy(ages, 0, ages2, 0, ages.length);
        ages2[ages.length] = addedAge;
        ages = ages2;

        // c. Calculate the average age
        double sum = 0;
        for (int age : ages) {
            sum += age;
        }
        double averageAge = sum / ages.length;
        System.out.println("Average age: " + averageAge);

        // 2. Create an array of String called names
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

        // a. Calculate the average number of letters per name
        sum = 0;
        for (String name : names) {
            sum += name.length();
        }
        double averageNameLength = sum / names.length;
        System.out.println("Average number of letters per name: " + averageNameLength);

        // b. Concatenate all the names together
        StringBuilder concatenatedNames = new StringBuilder();
        for (String name : names) {
            concatenatedNames.append(name).append(" ");
        }
        System.out.println("Concatenated names: " + concatenatedNames.toString().trim());

        // 3. Access the last element of any array
        System.out.println("Last name in the array: " + names[names.length - 1]);

        // 4. Access the first element of any array
        System.out.println("First name in the array: " + names[0]);

        // 5. Create a new array of int called nameLengths
        int[] nameLengths = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }

        // 6. Calculate the sum of all elements in the nameLengths array
        sum = 0;
        for (int length : nameLengths) {
            sum += length;
        }
        System.out.println("Sum of all elements in the nameLengths array: " + sum);

        // 7. Repeat a word n times
        String repeatedWord = repeatWord("Hello", 3);
        System.out.println("Repeated word: " + repeatedWord);

        // 8. Concatenate first name and last name
        String fullName = concatFullName("John", "Doe");
        System.out.println("Full name: " + fullName);

        // 9. Check if the sum of all elements in the array is greater than 100
        boolean isSumGreaterThan100 = isGreaterThan100(ages);
        System.out.println("Is the sum of ages greater than 100? " + isSumGreaterThan100);

        // 10. Calculate the average of all elements in the array
        double[] sampleArray = {10.5, 20.5, 30.5};
        double arrayAvg = arrayAverage(sampleArray);
        System.out.println("Average of the elements in the array: " + arrayAvg);

        // 11. Compare averages of two arrays
        double[] array1 = {10.5, 20.5, 30.5};
        double[] array2 = {5.5, 15.5, 25.5};
        boolean isFirstArrayAverageGreater = whichArrayIsAverageIsGreater(array1, array2);
        System.out.println("Is the average of the first array greater than the second array? " + isFirstArrayAverageGreater);

        // 12. Check if will buy a drink
        boolean willBuy = willBuyDrink(true, 20.0);
        System.out.println("Will buy a drink? " + willBuy);
        
        //13.
       
        switchNames("Jim", "Bob");
    }

       
    

    // Methods

    // 7. Repeat a word n times
    public static String repeatWord(String word, int n) {
        StringBuilder repeatedWord = new StringBuilder();
        for (int i = 0; i < n; i++) {
            repeatedWord.append(word);
        }
        return repeatedWord.toString();
    }

    // 8. Concatenate first name and last name
    public static String concatFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    // 9. Check if the sum of all elements in the array is greater than 100
    public static boolean isGreaterThan100(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum > 100;
    }

    // 10. Calculate the average of all elements in the array
    public static double arrayAverage(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // 11. Compare averages of two arrays
    public static boolean whichArrayIsAverageIsGreater(double[] arrayOne, double[] arrayTwo) {
        double sum1 = 0;
        double sum2 = 0;
        for (double array : arrayOne) {
            sum1 += array;
        }
        for (double array : arrayTwo) {
            sum2 += array;
        }
        return sum1 > sum2;
    }

    // 12. Check if will buy a drink
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }



//  13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it
		
		
public static void switchNames(String firstName, String lastName) {
  
    System.out.println("Original Order: " + firstName + " " + lastName);
    
   
    System.out.println("Switched Order: " + lastName + " " + firstName);
    
}

}



// TODO Auto-generated method stub




