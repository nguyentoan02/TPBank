/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j1.s.p0070;

import java.util.Scanner;

/**
 *
 * @author MSII
 */

public class Utility {
    public static String GetStrWRegEx(String msg,String pattern,String msg_wrong)
    {
        Scanner sc = new Scanner(System.in);
        String inp;
        do
        {
            System.out.print(msg);
            inp=sc.nextLine();
            if(inp.matches(pattern))
                return inp;
            System.out.println(msg_wrong);
        }
        while(true);
    }
}
