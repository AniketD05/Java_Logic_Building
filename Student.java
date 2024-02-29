
public class Student {

    String name;
    int subject_1;
    int subject_2;
    int subject_3;

    void Assign(String s, int sub1, int sub2, int sub3) {
        name = s;
        subject_1 = sub1;
        subject_2 = sub2;
        subject_3 = sub3;
    }

    float Average() {

        float totalAverage;
        totalAverage = (subject_1 + subject_2 + subject_3) / 3;
        return totalAverage;

    }

    void Result() {

        int totalMarks = subject_1 + subject_2 + subject_3;
        System.out.println("Name of the Student: " + name);
        System.out.println("Total Marks: " + totalMarks);

    }

    public static void main(String[] args) {

        Student obj = new Student();

        obj.Assign("Aniket Dhiwar", 80, 80, 80);
        obj.Result();
        System.out.println("Total Average: " + obj.Average());

    }

}
