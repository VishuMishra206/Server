

import java.util.ArrayList;

import java.util.List;

import java.util.function.Predicate;

public class UpperClass 
{

public static void main(String[] args) {

List<String> programmingLanguages = new ArrayList<>();

programmingLanguages.add("C");

programmingLanguages.add("C++");

programmingLanguages.add("Java");

programmingLanguages.add("Kotlin");

programmingLanguages.add("Python");

programmingLanguages.add("Perl");

programmingLanguages.add("Ruby");

System.out.println( programmingLanguages);
{
	programmingLanguages.stream()
	.filter(p->p.equals("Perl"))
	.map(p->p.toUpperCase())
	.forEach(System.out::print);
	
	
}

}

}


