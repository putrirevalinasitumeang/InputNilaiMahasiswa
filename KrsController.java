package controller;

import dao.KrsDAO;
import model.Student;
import model.Course;
import java.util.ArrayList;

public class KrsController {

    private final KrsDAO krsDao;

    public KrsController() {
        this.krsDao = new KrsDAO();
    }

    public void simpanMahasiswa(String idCard, String name, String nim, String studyProgram) {
        Student mhs = new Student(idCard, name, nim, studyProgram);
        krsDao.addStudent(mhs);
        System.out.println("Mahasiswa " + name + " berhasil disimpan.");
    }

    public void simpanMataKuliah(String code, String courseName, int sks, int semester) {
        Course matkul = new Course(code, courseName, sks, semester);
        krsDao.addCourse(matkul);
        System.out.println("Mata Kuliah " + courseName + " berhasil disimpan.");
    }

    public String isiKrsMahasiswa(String nim, String kodeMatkul) {
        if (nim.isEmpty() || kodeMatkul.isEmpty()) {
            return "NIM dan Kode Mata Kuliah tidak boleh kosong!";
        }

        ArrayList<Student> listStudent = krsDao.getAllStudents();
        ArrayList<Course> listCourse = krsDao.getAllCourses();

        Student mahasiswaTerpilih = null;
        Course matkulTerpilih = null;

        for (Student s : listStudent) {
            if (s.getNim().equalsIgnoreCase(nim)) {
                mahasiswaTerpilih = s;
                break;
            }
        }

        for (Course c : listCourse) {
            if (c.getCode().equalsIgnoreCase(kodeMatkul)) {
                matkulTerpilih = c;
                break;
            }
        }
        if (mahasiswaTerpilih != null && matkulTerpilih != null) {
            model.KRS krsBaru = new model.KRS(matkulTerpilih, 0.0);

            krsBaru.setSemester(matkulTerpilih.getSKS());

            mahasiswaTerpilih.addKRS(krsBaru);
            return "KRS Berhasil ditambahkan!";
        }
        return "Gagal! NIM atau Kode Mata Kuliah tidak ditemukan.";

    
    }
}
