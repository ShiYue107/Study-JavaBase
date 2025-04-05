package com.qi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> N=new ArrayList<Integer>();
		int n=sc.nextInt();
		ArrayList<Integer> A=new ArrayList<Integer>();
		TreeSet<Integer> s=new TreeSet<Integer>();
		
		for(int x=0;x<n;x++) {
			A.add(sc.nextInt());
			s.add(A.get(x));
		}
		
		int m=sc.nextInt();
		ArrayList<Integer> B=new ArrayList<Integer>();
		for(int x=0;x<m;x++) {
			B.add(sc.nextInt());
			s.add(B.get(x));
		}
		int z=Math.min(n,m);
		for(int x=0;x<z;x++) {
			if(n<m) {
				if(B.indexOf(A.get(x))!=-1)
					N.add(A.get(x));
			}else {
				if(A.indexOf(B.get(x))!=-1)
					N.add(B.get(x));
			}
		}
		Collections.sort(N);
		for(int x=0;x<N.size();x++)
			System.out.print(N.get(x)+" ");
		System.out.println();
		
		Iterator it=s.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
		System.out.println();
		int i=0;
		while(i!=N.size())A.remove(N.get(i++));
		
		Collections.sort(A);
		for(int x=0;x<A.size();x++) 
			System.out.print(A.get(x)+" ");
	}
}
