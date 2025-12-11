package DataStructures.Strings;

public class PasswordStrength {

    public static void main(String[] args) {
        String password = "Ab1";
        System.out.println(minimumNumber(password.length(), password));
    }

    public static int minimumNumber(int n, String password) {

        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";
        boolean hasDigit = false;
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasSpecial = false;
        for (char c : password.toCharArray()) {
            if (numbers.indexOf(c) >= 0) hasDigit = true;
            else if (lower_case.indexOf(c) >= 0) hasLower = true;
            else if (upper_case.indexOf(c) >= 0) hasUpper = true;
            else if (special_characters.indexOf(c) >= 0) hasSpecial = true;
        }
        int missing = 0;
        if (!hasDigit) missing++;
        if (!hasLower) missing++;
        if (!hasUpper) missing++;
        if (!hasSpecial) missing++;
        return Math.max(missing, 6 - n);
    }
}