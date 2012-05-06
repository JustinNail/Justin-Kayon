/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Justin
 */
public class Property
{
    public int Cost;
    public int Mortgage;
    
    public enum Group{Purple, LBlue, Pink, Orange, Red, Yellow, Green, Blue, Rail, Utility};
    
    public Group group;
    
    public List<Integer> Rent=new ArrayList<>();
    
    public String Name;
    
    public Player Owner;
    
    int UpgradeLevel;
    
    public Property(Group g,int cost, int mort, 
            int site,int house,int house2,int house3,int house4,int hotel, 
            String name)
    {
        group=g;
        Cost=cost;
        Mortgage=mort;
        Rent.add(site);
        Rent.add(house);
        Rent.add(house2);
        Rent.add(house3);
        Rent.add(house4);
        Rent.add(hotel);
        Name=name;
        Owner=null;
        
        UpgradeLevel=0;
    }
    public int calcRent()
    {
        return Rent.get(UpgradeLevel);
    }
}
