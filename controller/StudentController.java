package controller;

import dao.StudentDAO;
import model.Student;
import java.sql.Connection;
import java.util.List;
import javax.swing.JOptionPane;

public class StudentController {

    private StudentDAO studentDAO;

    // =====================
    // CONSTRUCTOR
    // =====================
    public StudentController(Connection conn) {
        this.studentDAO = new StudentDAO(conn);
    }

    public StudentController() {
       studentDAO = new StudentDAO();
    }

    // =====================
    // INSERT
    // =====================
    public void insertStudent(String nim, String name, String gender, String studyProgram, String address, String phoneNumber) {
        Student s = new Student();

        s.setNim(nim);
        s.setName(name);
        s.setGender(gender);
        s.setStudyProgram(studyProgram);
        s.setAddress(address);
        s.setPhoneNumber(phoneNumber);

        if (studentDAO.insert(s)) {
            JOptionPane.showMessageDialog(null, "Insert berhasil");
        } else {
            JOptionPane.showMessageDialog(null, "Insert gagal");
        }
    }

    // =====================
    // UPDATE
    // =====================
    public void updateStudent(String nim, String name, String gender, String studyProgram, String address, String phoneNumber) {
        Student s = new Student();

        s.setNim(nim);
        s.setName(name);
        s.setGender(gender);
        s.setStudyProgram(studyProgram);
        s.setAddress(address);
        s.setPhoneNumber(phoneNumber);

        if (studentDAO.update(s)) {
            JOptionPane.showMessageDialog(null, "Update berhasil");
        } else {
            JOptionPane.showMessageDialog(null, "Update gagal");
        }
    }

    // =====================
    // DELETE
    // =====================
    public void deleteStudent(String nim) {

        int confirm = JOptionPane.showConfirmDialog(
                null,
                "Yakin hapus data?",
                "Konfirmasi",
                JOptionPane.YES_NO_OPTION
        );

        if (confirm == JOptionPane.YES_OPTION) {
            if (studentDAO.delete(nim)>0) {
                JOptionPane.showMessageDialog(null, "Delete berhasil");
            } else {
                JOptionPane.showMessageDialog(null, "Delete gagal");
            }
        }
    }

    // =====================
    // GET ALL
    // =====================
    public List<Student> getAllStudents() {
        return studentDAO.getAll();
    }
    
    public List<Student> getStudent() {
    return studentDAO.getStudent();
}

    public int create(Student student) {
    return studentDAO.insert(student) ? 1 : 0;
}

public int update(Student student, String selectedNIM) {
    student.setNim(selectedNIM);
    return studentDAO.update(student) ? 1 : 0;
}

public void delete(String selectedNIM) {
    studentDAO.delete(selectedNIM);
}
    }
