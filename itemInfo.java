/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

/**
 *
 * @author Zyad
 */
import java.io.Serializable;
public class itemInfo implements Serializable {
    int id;
    String name;
    int price;
    int quantity;
    String category;
    Boolean inCart;
    
}
