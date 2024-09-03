public class NameInitials {
    public static void main(String[] args) {
        // Given name
        String name = "John Doe";

        // Get the first character of the first name
        char firstNameInitial = name.charAt(0);

        // Get the first character of the last name
        String[] nameParts = name.split(" ");
        char lastNameInitial = nameParts[nameParts.length - 1].charAt(0);

        // Print the initials in uppercase
        System.out.println(Character.toUpperCase(firstNameInitial) + Character.toUpperCase(lastNameInitial));
    }
}