package edu.kirkwood.crcu.cis171.k0789546;

/**
 * Created by k0789546 on 2/6/2017.
 * @author: Bruno
 */
public class Student {
    private String[] names = new String[2];

    public void setName (String first, String last){
        this.names[0] = first;
        this.names[1] = last;
    }
    public String greet(){
        return "Hi " + this.names[0] + this.names[1];
    }

}
