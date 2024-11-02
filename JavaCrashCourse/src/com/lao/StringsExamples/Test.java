package com.lao.StringsExamples;

public class Test {

	

		public static void main(String[] args) {
			String s1="abc";
			String s2= new String("abc");
			String s3= s2.intern();
			System.out.println(s1==s3);

			/* concat_scenario:
			 * 
			 * String x = "abc";
			 * 
			 * String y = "abc";
			 * 
			 * x.concat(y);
			 * 
			 * System.out.print(x.concat(y));
			 */

		}

	}

