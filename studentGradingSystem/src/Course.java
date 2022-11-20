public class Course {
    private Teacher teacher;
    private String name;
    private String code;
    private String prefix;
    private int note;

    public Course(String name, String code,String prefix,int note){

        this.name=name;
        this.code = code;
        this.prefix=prefix;
        this.note=note;
    }

    void getPrintTeacherInfo(){
        System.out.println("Course \t: "+this.getName()+"\n\tTeacher Info");
        this.teacher.getTeacherInfo();
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        if (teacher.getBranch().equals(this.prefix)){
            this.teacher = teacher;
        }else {
            System.out.println("Teacher and course information don't match.");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
}
