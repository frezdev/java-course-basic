public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;
        lives = lives - 1;
        System.out.println(lives); // 4

        lives--; // Decrement
        System.out.println(lives); // 3

        lives++; // Increment
        System.out.println(lives); // 4
        
        // Prefija
        // Gana un regalo por ganar una vida
        int gift = 100 + ++lives;
        System.out.println(gift);
    }
}
