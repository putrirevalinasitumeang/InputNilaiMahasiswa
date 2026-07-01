package dao;

import config.DBConnection;
import model.Lecturer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LecturerDAO {

    private Connection connection;

    public LecturerDAO() {
        connection = DBConnection.getConnection();
    }

    // ================== INSERT ==================
    public boolean insertLecturer(Lecturer lecturer) {

        String sql = "INSERT INTO lecturers (lecturer_id, lecturer_name, gender, phone_number, address) VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, lecturer.getLecturerId());
            ps.setString(2, lecturer.getLecturerName());
            ps.setString(3, lecturer.getGender());
            ps.setString(4, lecturer.getPhoneNumber());
            ps.setString(5, lecturer.getAddress());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    // ================== READ ==================
    public List<Lecturer> getAllLecturers() {

        List<Lecturer> list = new ArrayList<>();

        String sql = "SELECT * FROM lecturers";

        try {

            PreparedStatement ps = connection.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Lecturer lecturer = new Lecturer();

                lecturer.setLecturerId(rs.getString("lecturer_id"));
                lecturer.setLecturerName(rs.getString("lecturer_name"));
                lecturer.setGender(rs.getString("gender"));
                lecturer.setPhoneNumber(rs.getString("phone_number"));
                lecturer.setAddress(rs.getString("address"));

                list.add(lecturer);

            }

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return list;

    }

    // ================== SEARCH ==================
    public Lecturer getLecturerById(String id) {

        String sql = "SELECT * FROM lecturers WHERE lecturer_id=?";

        try {

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                Lecturer lecturer = new Lecturer();

                lecturer.setLecturerId(rs.getString("lecturer_id"));
                lecturer.setLecturerName(rs.getString("lecturer_name"));
                lecturer.setGender(rs.getString("gender"));
                lecturer.setPhoneNumber(rs.getString("phone_number"));
                lecturer.setAddress(rs.getString("address"));

                return lecturer;

            }

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return null;

    }

    // ================== UPDATE ==================
    public boolean updateLecturer(Lecturer lecturer) {

        String sql = "UPDATE lecturers SET lecturer_name=?, gender=?, phone_number=?, address=? WHERE lecturer_id=?";

        try {

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, lecturer.getLecturerName());
            ps.setString(2, lecturer.getGender());
            ps.setString(3, lecturer.getPhoneNumber());
            ps.setString(4, lecturer.getAddress());
            ps.setString(5, lecturer.getLecturerId());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {

            System.out.println(e.getMessage());
            return false;

        }

    }

    // ================== DELETE ==================
    public boolean deleteLecturer(String id) {

        String sql = "DELETE FROM lecturers WHERE lecturer_id=?";

        try {

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, id);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {

            System.out.println(e.getMessage());
            return false;

        }

    }

}