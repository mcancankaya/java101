public class Teacher {
    private String name;
    private String phoneNumber;
    private String branch;

    public Teacher(String name, String branch, String phoneNumber){
        this.name=name;
        this.branch=branch;
        this.phoneNumber=phoneNumber;
    }

    void getTeacherInfo(){
        System.out.println("Name \t: "+this.getName()+"\nBranch \t: "+this.getBranch()+"\nPhone \t: "+this.getPhoneNumber());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
