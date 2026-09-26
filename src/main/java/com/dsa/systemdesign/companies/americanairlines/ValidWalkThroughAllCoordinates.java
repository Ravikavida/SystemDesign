package com.dsa.systemdesign.companies.americanairlines;

public class ValidWalkThroughAllCoordinates {

    public static boolean isValidWalk(char[] coodrinates){

        int x =0;
        int y =0;

        for(char direction :coodrinates) {
            switch (direction) {
                case 'n':  //north
                    y++;
                    break;
                case 's':  //south
                    y--;
                    break;
                case 'e':  //East
                    x++;
                    break;
                case 'w':  //West
                    x--;
                    break;
                default:
                    return false;
            }
        }
        return x==0 && y ==0 ;
    }
    public static void main(String[] args) {
        char ch[] = {'n','e','n','e','n','w','s','w','s','s'};
        System.out.println(isValidWalk(ch));
    }
}


// y - veritical means north so y++ and south means below 0 means -ve so y-- same for e and west also if x =0 and y=0 means pearson reached to start potion means where x and y coordinates meet..means valid

// check cartesian coordinate system how x y works...