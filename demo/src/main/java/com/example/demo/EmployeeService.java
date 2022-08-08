package com.example.demo;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

	public List<Employee> getAllEmployees() {
		return Collections.singletonList(new Employee("1", "Andi"));
	}
public static void main(String ar[]) {
		
		int a[] = {1,3,1,2,3,4,2,1,4,5,6};
		
		//Integer arr[] =new Integer[a.length];
	    String[] array = Arrays.stream(a).mapToObj(String::valueOf).toArray(String[]::new);
	    Map<Object, Long> map = Stream.of(array).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	    System.out.println(map.toString());
		
	    String str="helloo";
	    StringBuilder stringbuil = new StringBuilder(str).reverse();
	    String str1=stringbuil.append(str).reverse().toString();
	   // Stream<Object> reverse=Stream.of(str).map(x->new StringBuilder(x).reverse().toString()).collect(String :: length);
	    //System.out.println(str1);
	    System.out.println(stringbuil.toString());

	    System.out.println(new StringBuilder(str).reverse().toString());
	    int aa[] = {1,3,1,2,3,4,2,1,4,5,6};
	    
	    Arrays.stream(aa).mapToObj(String::valueOf).toArray(String[]::new);
	    Stream.of(a).collect(Collectors.groupingBy(e->e,Collectors.counting()));
	    List<Employee> list =  Collections.singletonList(new Employee("1", "Andi"));
	    List<String> empByName= list.stream().map(x->x.getName()).collect(Collectors.toList());
	    String sentence = "Hello, I am here to help you";
	    String[] words = sentence.split(" ");
	    StringBuilder reverseString = new StringBuilder();
	    for(int j=words.length-1; j> 0; j--) {
	    	reverseString.append(words[j]);
	    	reverseString.append(" ");
	    }
	    System.out.println(reverseString);
	    
	}


}