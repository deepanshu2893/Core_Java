package Inheritance_In_Java;

import Constructors_In_Java.Dog;

import java.awt.event.ComponentListener;

public class Cog extends Cat implements Fetch {
    @Override
    public void fetch() {
        System.out.println("I got the stick but not because you asked me to I did it because I wanted to");
    }
}
