# Harry_Potter_Sorting_Hat<img width="75" height="75" src="https://user-images.githubusercontent.com/16100486/150083860-8ef7b1be-a40b-47ed-b71b-27a46d6452cd.png">


This is a group project in Java during our Data Structures class at HEG Neuchâtel. Developped with IntelliJ IDEA.


The Sorting Hat determine which of the four school Houses (Gryffindor, Hufflepuff, Ravenclaw, and Slytherin) each new student belonged most to according to his characteristics.



## Requirements
 - Use Data Structures provided by java.util
 - Respect the concepts of OOP (abstract, encapsulation, inheritance, polymorphism, ...)
 - Testing time complexity
 - Justify the use of Data Structures into the documentation (which is not avaible on GitHub)


We're using Java Collections Framework with the implementation of TreeSet, HashSet, ArrayList and HashMap.

The datas comes from a .csv file wich contains characters (format: First Name,Last Name,Gender,Job,Blood status,Valor)

In this project, Class, Functions, Packages, etc are in English. Only comments are written in French wich was mandatory for this project.

## Some explanations
1) Load datas from .csv file into a Collection<Character>. Each line of the .csv file involves the creation of an object Student, Teacher or Founder according to the column "job".
2) Creation of data structures mentionned above.
3) Put every student of the Collection<Character> into the Treeset, every teacher into the HashSet and every founder into the HashMap.
4) Instantiation of the 4 houses with an assigned founder.
5) Course of the TreeSet<Student> and a couple of tests will determined wich house each student belonged to. Instances of Student are add into a List<Student>.
6) Print the output of the sorting hat algorithm.
