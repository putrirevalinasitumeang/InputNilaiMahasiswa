package controller;

import dao.LecturerDAO;
import model.Lecturer;

import java.util.List;

public class LecturerController {

    private LecturerDAO lecturerDAO;

    public LecturerController() {
        lecturerDAO = new LecturerDAO();
    }

    // Tambah data
    public boolean insertLecturer(String id, String name,
                                  String gender, String phone,
                                  String address) {

        Lecturer lecturer = new Lecturer();

        lecturer.setLecturerId(id);
        lecturer.setLecturerName(name);
        lecturer.setGender(gender);
        lecturer.setPhoneNumber(phone);
        lecturer.setAddress(address);

        return lecturerDAO.insertLecturer(lecturer);
    }

    // Tampilkan semua data
    public List<Lecturer> getAllLecturers() {
        return lecturerDAO.getAllLecturers();
    }

    // Cari berdasarkan ID
    public Lecturer getLecturerById(String id) {
        return lecturerDAO.getLecturerById(id);
    }

    // Update data
    public boolean updateLecturer(String id, String name,
                                  String gender, String phone,
                                  String address) {

        Lecturer lecturer = new Lecturer();

        lecturer.setLecturerId(id);
        lecturer.setLecturerName(name);
        lecturer.setGender(gender);
        lecturer.setPhoneNumber(phone);
        lecturer.setAddress(address);

        return lecturerDAO.updateLecturer(lecturer);
    }

    // Hapus data
    public boolean deleteLecturer(String id) {
        return lecturerDAO.deleteLecturer(id);
    }
}