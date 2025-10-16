/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Nidhi Jain
 */
public class disease {
    String diseaseid;
 String diseasename;
 String diseasekname;
 String description;
 String lowerage;
  String Upperage;
  String symptoms;
  String testrecommended;

    public String getUpperage() {
        return Upperage;
    }

    public void setUpperage(String Upperage) {
        this.Upperage = Upperage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDiseaseid() {
        return diseaseid;
    }

    public void setDiseaseid(String diseaseid) {
        this.diseaseid = diseaseid;
    }

    public String getDiseasekname() {
        return diseasekname;
    }

    public void setDiseasekname(String diseasekname) {
        this.diseasekname = diseasekname;
    }

    public String getDiseasename() {
        return diseasename;
    }

    public void setDiseasename(String diseasename) {
        this.diseasename = diseasename;
    }

    public String getLowerage() {
        return lowerage;
    }

    public void setLowerage(String lowerage) {
        this.lowerage = lowerage;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getTestrecommended() {
        return testrecommended;
    }

    public void setTestrecommended(String testrecommended) {
        this.testrecommended = testrecommended;
    }
    
}
