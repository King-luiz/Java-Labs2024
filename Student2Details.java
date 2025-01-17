import java.util.HashMap;
import java.util.Map;

public class Student2Details {
    public static void main(String[] args) {
        // Create a HashMap to store student registration numbers and names
        HashMap<Integer, String> students = new HashMap<>();

        // Adding sample data to the HashMap
        students.put(100, "John Mumo");
        students.put(101, "George Otieno");
        students.put(102, "Jane Kariuki");
        students.put(103, "Nancy Moraa");

        // Display the student details
        System.out.println("Student Details:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Reg No: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}

                 //codedbyluiz
