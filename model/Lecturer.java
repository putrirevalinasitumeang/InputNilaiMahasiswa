package model;

public class Lecturer {

    private String lecturerId;
    private String lecturerName;
    private String nidn;
    private String course;
    private String gender;
    private String phoneNumber;
    private String address;

    // Dipakai oleh InputNilai
    public String name;

    public Lecturer() {

    }

    public Lecturer(String lecturerId,
                    String lecturerName,
                    String nidn,
                    String course) {

        this.lecturerId = lecturerId;
        this.lecturerName = lecturerName;
        this.nidn = nidn;
        this.course = course;

        this.name = lecturerName;
    }

    public Lecturer(String lecturerId,
                    String lecturerName,
                    String gender,
                    String phoneNumber,
                    String address) {

        this.lecturerId = lecturerId;
        this.lecturerName = lecturerName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;

        this.name = lecturerName;
    }

    public String getLecturerId() {
        return lecturerId;
    }

    public void setLecturerId(String lecturerId) {
        this.lecturerId = lecturerId;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
        this.name = lecturerName;
    }

    public String getNidn() {
        return nidn;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return lecturerName;
    }

    public String getAddress() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getPhoneNumber() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getGender() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setGender(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setPhoneNumber(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setAddress(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}