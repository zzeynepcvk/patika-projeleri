public class Main {
    public static void main(String[] args) {
        Course matematik = new Course("Matematik", "MAT101", "MAT", 0.8);
        Course fizik = new Course("Fizik", "FZK101", "FZK", 0.6);
        Course kimya = new Course("Kimya", "KMY101", "KMY", 0.4);

        Teacher t1 = new Teacher("Mahmut Hoca", "111", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "222", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "333", "KMY");

        matematik.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Zeynep", 4, "123", matematik, fizik, kimya);
        s1.addBulkExamNote(70, 60, 40);
        s1.isPass();
    }
}
