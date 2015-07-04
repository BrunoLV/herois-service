/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valhala.heroi.comparators;

import com.valhala.heroi.model.Campeao;
import java.util.Comparator;

/**
 *
 * @author brunolv
 */
public class ComparatorCampeaoPorAnoPrimeiraAparicao implements Comparator<Campeao> {

    public int compare(Campeao o1, Campeao o2) {
        return o1.getAnoPrimeiraAparicao().compareTo(o2.getAnoPrimeiraAparicao());
    }
    
}
