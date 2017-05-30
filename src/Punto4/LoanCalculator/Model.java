/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto4.LoanCalculator;

/**
 *
 * @author javier
 */
public class Model {
    public String annualInterest;
    public String numberYear;
    public String loanAmount;

    public String getAnnualInterest() {
        return annualInterest;
    }

    public void setAnnualInterest(String interes) {
        this.annualInterest = annualInterest;
    }

    public String getNumberYear() {
        return numberYear;
    }

    public void setNumberYear(String numberYear) {
        this.numberYear = numberYear;
    }

    public String getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(String loanAmount) {
        this.loanAmount = loanAmount;
    }
}