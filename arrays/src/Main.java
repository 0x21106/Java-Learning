public class Main {

    public static void main(String[] args) {
        String[] students = new String[3];

        students[0] = "Ayxan";
        students[1] = "Ayten";
        students[2] = "Aytac";

        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println("---------------------");

        for(String student:students) {
            System.out.println(student);
        }

        String[] teachers = {"Ayxan", "Ayhan"};

        for(String teacher:teachers) {
            System.out.println(teacher);
        }

    }
}
