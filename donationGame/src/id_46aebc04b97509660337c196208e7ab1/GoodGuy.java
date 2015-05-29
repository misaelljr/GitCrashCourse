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

/*Classe que implementa um jogador que sempre doa o maximo durante as rodadas do jogo*/
public class GoodGuy implements Competitor {
    
    private double totalCash;
    private double donation;

    public void GoodGuy(){
        
        totalCash = 0;
        donation = 0;
    }
    
    @Override
    public double declareDonationTo(Competitor c) {
        return 10.00;
    }

    @Override
    public void informDonationFrom(Competitor c, double donation) {
        this.donation = donation;
    }

    @Override
    public void addCash(double amount) {
        totalCash = totalCash + amount;
    }

    @Override
    public double getTotalCash() {
        return totalCash;
    }
}