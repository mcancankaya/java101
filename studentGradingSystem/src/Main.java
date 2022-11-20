public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Mahmut Mustafa","TRH","901234567890");
        Teacher teacher2 = new Teacher("Graham Bell","FZK","901234567890");
        Teacher teacher3 = new Teacher("Darwin","BIO","901234567890");

        Course course1 = new Course("Tarih","101","TRH",0);
        course1.setTeacher(teacher1);

        Course course2 = new Course("Fizik","101","FZK",0);
        course2.setTeacher(teacher2);

        Course course3 = new Course("Biyoloji","101","BIO",0);
        course3.setTeacher(teacher3);

        Student student1 = new Student(course1,course2,course3,"Can","12345","4");
        student1.addBulkExamNote(50,50,75);
        student1.addBulkQuizNote(50,50,50);
        student1.printIsPass();
    }
}