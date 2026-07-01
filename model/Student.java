/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.Person;
import model.KRS;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */    
public class Student extends Person{
    
    private String nim;
    private String studyProgram;
    private ArrayList<KRS> krslist;
    
    public Student(String idCard, String name, String nim, String studyProgram){
        
        super(idCard, name);
        
        this.nim = nim;
        this.studyProgram = studyProgram;
        krslist = new ArrayList<>();
    }

    /**
     *
     */
    public Student() { 
        
        super("","");
       krslist = new ArrayList<>();
    }
    

    
    @Override
    public String toString(){
        return this.name;
    }
    
    public String getCardID(){
        return idCard;
    }
    
    public String getNim(){
        return nim;
    }
    
    public String getName(){
        return name;
    }
      
    public String getStudyProgram(){
        return studyProgram;
    }
    
    public String getGender(){
        return gender;
    }
    
    public String getAddress(){
        return Address;
    }
    
    public String getPhoneNumber(){
        return PhoneNumber;
    }
    
    public void addKRS(KRS krs){
        krslist.add(krs);
    }    

    public void setNim(String nim) {
    this.nim = nim;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setStudyProgram(String studyProgram) {
        this.studyProgram = studyProgram;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }
}
