package maxusingGenerics;

import java.util.Scanner;
import java.lang.Math;

public class MaxOf<T extends Comparable<T>> {

	T a;
	T b;
	T c;

	MaxOf(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

	public T maximum() {

		if ((a.compareTo(b) > 0) && (a.compareTo(c) > 0)) {
			return a;
		} else if ((b.compareTo(c) > 0) && (b.compareTo(a) > 0)) {
			return b;
		} else {
			return c;
		}
	}

	public static void main(String[] args) {
		MaxOf campareInterger = new MaxOf(457,654,123);
        System.out.println("Maximum Number Out of Three Integer is:- " + campareInterger.maximum());


	}

}
