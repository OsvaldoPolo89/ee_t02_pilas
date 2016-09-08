/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp 14
 */
public class PruebaTare2 {
    
     tarea2 p1=new tarea2(10);//{

    public String recorrer(String xmen)
    {
        for(int i=0;i<xmen.length();i++)
        {
            char x=xmen.charAt(i);
            if(x=='{')
                p1.push(x);
            if(x=='[')
                p1.push(x);
            if(x=='(')
                p1.push(x);
            if(x=='}')
            {
                char c = p1.peek();
                if(c=='{')
                    p1.pop();
                else
                    return "NO";
            }
            if(x==']') 
            {
                char c = p1.peek();
                if(c=='[')
                    p1.pop();
                else
                   return "NO";
            }
            if(x==')')
            {
                char c = p1.peek();
                if(c=='(')
                    p1.pop();
                else
                   return "NO";
            }
        }
        if(p1.peek()==' ')
        return "SI";
        return "SI..";
    }

        public static void main(String[]args)
        {
        PruebaTare2 pt1= new PruebaTare2();

        System.out.println(pt1.recorrer("{[()]}")+" 1");
        System.out.println(pt1.recorrer("{[(])}")+" 2");
        System.out.println(pt1.recorrer("{{[[(())]]}}")+" 3");
    }

}

