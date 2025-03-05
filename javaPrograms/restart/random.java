import java.util.Random;
 class SingleRandomChar {
    public static void main(String[] args) {
        // Character array
        char[] charArray = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        
        // Random object to pick a random index
        Random random = new Random();
        
        // Generate a random index within the bounds of the array
        int randomIndex = random.nextInt(charArray.length);
        
        // Print the randomly picked character
        System.out.println("Randomly picked character: " + charArray[randomIndex]);
    }
}
