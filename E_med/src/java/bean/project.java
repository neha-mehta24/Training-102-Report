/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;



/**
 *
 * @author Nidhi Jain
 */
public class project {
    String department_id;
    String department_name;
    int no_of_employees;
    String description;
   String abbrevation;
 String medicine_name;
  String salt;
  int med_id;
 String chemical_name;
 String medicine_details;

    public int getMed_id() {
        return med_id;
    }

    public void setMed_id(int med_id) {
        this.med_id = med_id;
    }

    public String getAbbrevation() {
        return abbrevation;
    }

    public void setAbbrevation(String abbrevation) {
        this.abbrevation = abbrevation;
    }

    public String getChemical_name() {
        return chemical_name;
    }

    public void setChemical_name(String chemical_name) {
        this.chemical_name = chemical_name;
    }

    public String getMedicine_details() {
        return medicine_details;
    }

    public void setMedicine_details(String medicine_details) {
        this.medicine_details = medicine_details;
    }

    public String getMedicine_name() {
        return medicine_name;
    }

    public void setMedicine_name(String medicine_name) {
        this.medicine_name = medicine_name;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(String department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNo_of_employees() {
        return no_of_employees;
    }

    public void setNo_of_employees(int no_of_employees) {
        this.no_of_employees = no_of_employees;
    }
    
}
