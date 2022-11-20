public class Student {
    private Course course1;
    private Course course2;
    private Course course3;
    private String name;
    private String studentNumber;
    private String classes;
    private double average;
    private boolean isPass;

    public Student(Course course1, Course course2, Course course3, String name, String studentNumber, String classes) {
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.name = name;
        this.studentNumber = studentNumber;
        this.classes = classes;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1,int note2,int note3){
        String error="Invalid Note ! ";
        if (note1>=0 &&note1<=100)
            this.course1.setNote(note1);
        else
            System.out.println(error+note1);
        if (note2>=0 &&note2<=100)
            this.course2.setNote(note2);
        else
            System.out.println(error+note2);
        if (note3>=0 && note3<=100)
            this.course3.setNote(note3);
        else
            System.out.println(error+note3);

    }

    void printNoteInformations(){
        System.out.println(course1.getName()+" Note \t: "+course1.getNote());
        System.out.println(course2.getName()+" Note \t: "+course2.getNote());
        System.out.println(course3.getName()+" Note \t: "+course3.getNote());
        System.out.println("Average \t\t: "+this.getAverage());
    }

    void printIsPass(){
        this.average = (this.course1.getNote()+this.course2.getNote()+this.course3.getNote())/3.0;
        if (this.average>55){
            System.out.println("You passed the class.");
            this.setIsPass(true);
        }else{
            System.out.println("You failed the class.");
            this.setIsPass(false);
        }
        printNoteInformations();
    }

    public Course getCourse1() {
        return course1;
    }

    public void setCourse1(Course course1) {
        this.course1 = course1;
    }

    public Course getCourse2() {
        return course2;
    }

    public void setCourse2(Course course2) {
        this.course2 = course2;
    }

    public Course getCourse3() {
        return course3;
    }

    public void setCourse3(Course course3) {
        this.course3 = course3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public boolean getIsPass() {
        return isPass;
    }

    public void setIsPass(boolean pass) {
        isPass = pass;
    }
}
