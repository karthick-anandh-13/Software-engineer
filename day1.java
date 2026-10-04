public class day1{
    public static void main(String[] args){
        String name = "Karthick";
        int age = 19;
        boolean isStudent = true;
        float height = 188.5f;
        char grade = 'A';
        double weight = 95.5;
        byte spend = 20;
        long days =7114L;
        int[] marks = {90,95,93,91,96};

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        System.out.println("Weight: " + weight);
        System.out.println("Spend: " + spend);
        System.out.println("Days: " + days);
        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();

    }
}