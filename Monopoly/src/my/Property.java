/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my;

import java.util.ArrayList;
import java.util.List;
import my.board.Board;
import my.board.PropertySpace;

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
    
    public int UpgradeCost;
    public int UpgradeLevel;
    
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
        
        if(group==Group.LBlue || group==Group.Purple)
        {
            UpgradeCost=50;
        }
        else if(group==Group.Orange || group==Group.Pink)
        {
            UpgradeCost=100;
        }
        else if(group==Group.Red || group==Group.Yellow)
        {
            UpgradeCost=50;
        }
        else if(group==Group.Green || group==Group.Blue)
        {
            UpgradeCost=50;
        }
        else
        {
            UpgradeCost=0;
        }
        
        UpgradeLevel=0;
    }
    public int calcRent()
    {
        return Rent.get(UpgradeLevel);
    }
    public boolean canUpgrade()
    {
        int count=0;
        if(group == Group.Purple || group == Group.Blue)
        {
            for(int j = 0; j<Board.spaces.size();j++)
            {
                if(Board.spaces.get(j) instanceof PropertySpace )
                {
                    if(PropertySpace.class.cast(Board.spaces.get(j)).property.Owner ==
                                Game.Players.get(Game.currentPlayer))
                    {
                        if(PropertySpace.class.cast(Board.spaces.get(j)).property.group==this.group)
                        {
                            count++;
                        }
                    }
                }
            }
            return count == 2;
        }
        else
        {
            for(int j = 0; j<Board.spaces.size();j++)
            {
                if(Board.spaces.get(j) instanceof PropertySpace )
                {
                    if(PropertySpace.class.cast(Board.spaces.get(j)).property.Owner ==
                                Game.Players.get(Game.currentPlayer))
                    {
                        if(PropertySpace.class.cast(Board.spaces.get(j)).property.group==this.group)
                        {
                            count++;
                        }
                    }
                }
            }
            return count == 3;
        }
    }
}
