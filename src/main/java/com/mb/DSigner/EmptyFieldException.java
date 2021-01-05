/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mb.DSigner;

/**
 *
 * @author Soham Malakar
 */
public class EmptyFieldException extends Exception{
    EmptyFieldException(){
        super("Fill in the fields");
    }
    
}
