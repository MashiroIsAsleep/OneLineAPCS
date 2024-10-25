public class ValidPassword {
    public static boolean isValidPassword(String password) {
        return password.length() >= 6 && password.length() <= 16 && !password.contains(" ") &&// Check the length and spaces
               (password.chars().anyMatch(Character::isUpperCase) ? 1 : 0) +// Check if there is at least one uppercase letter
               (password.chars().anyMatch(Character::isLowerCase) ? 1 : 0) +// Check if there is at least one lowercase letter
               (password.chars().anyMatch(Character::isDigit) ? 1 : 0) +// Check if there is at least one digit
               (password.chars().anyMatch(ch -> !Character.isLetterOrDigit(ch)) ? 1 : 0) >= 3;// Check if there is at least one special character
    }
    public static void main(String[] args) {
        // Test the method
        String[] testPasswords = {"Password1!", "password", " "};
        
        for (String password : testPasswords) {
            System.out.println("Password: " + password + " is valid? " + isValidPassword(password));
        }
    }
}
