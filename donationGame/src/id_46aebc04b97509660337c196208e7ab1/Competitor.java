/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id_46aebc04b97509660337c196208e7ab1;

/**
 *
 * @author AUGUSTO
 */
public interface Competitor {
    
    // Indicates how much to donate to Competitor c
    double declareDonationTo(Competitor c);
    // Indicates how much was donated from Competitor c
    void informDonationFrom(Competitor c, double donation);
    // Adds the amount of cash
    void addCash(double amount);
    // Get the amount of cash this competitor has
    double getTotalCash();

}