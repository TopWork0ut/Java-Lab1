package iot;

import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	ArtificialChrismasTree tree1 = new ArtificialChrismasTree();
	ArtificialChrismasTree tree2 = new ArtificialChrismasTree("Hangzhou Original Dot Art", 150, 2600);
	ArtificialChrismasTree tree3 = new ArtificialChrismasTree("Shandong Fandiluo Arts", 180, 4000, "plastic", 2,
		true);
	System.out.println(tree1.toString());
	System.out.println(tree2.toString());
	System.out.println(tree3.toString());

    }

}
