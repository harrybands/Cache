Project 1: Player Cache Programming 
Author: Harry Nguyen
Class: CS321 Section 003
Semester: Fall 2022
Overview

 This project is a about the grasp of how the cache works using the LinkedList class. Basically, users will have a list of serialized players 
information are being stored and then check to see if that information is repeated or not in a limited list. 

Reflection

 This project was not a great experience for me but it is extremely necessary for me to get things started with the CS321 class. I have been 
missing out some very basic knowledge in Java that I have already been taught without really knowing it, so it costed me days to revise most 
of it to be able to first get this project off the ground. The new Java version did a lot of works for me as regarded to calling the LinkedList 
functions out without having to code it by myself, which I am not confident that I could do it right away without scrolling back to the CS221 
documents that I have been through. But I did that anyways because I believed that is what I need to surely know if I want to keep up with the 
class pace. Not on this project though, I redid the ArrayList, SLL, and DLL in the CS221 to make sure I got everything covered before just 
importing the library and importing their methods.   

 After that, things went smoothly for me since I got introduced some basic definition about how cache works before entering this class until I 
got stuck at the currentTimesMillis() method where I could not get the exact number of time ellapsed as expected. I just kept getting the 0 
milliseconds since what I did is subtracting the end time to the start time. And I am having trouble on it still but I guessed it is time for me
to submit the work since I still believed that it is impossible to get the exact milliseconds value on each time I run the test.

Compiling and Using

 To check to see how many times the cache hits and frequents, the users can use the usage below: 
java CacheTest <cache-size> <serialized-data-filename>
 where: 
cache-size is the size of the cache sample. 
serialized-data-filename is the data name's file that has the serialized Player information are going to be cached. 

Results
 
 The results went the same with the 6 expected given outputs except for the ellapsed time.  

Sources used
“Java Oracle Array List.” ArrayList (Java Platform SE 8 ), 4 July 2022, https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html. Day 
accessed September 10th, 2022.
"Java Oracle Linked List." LinkedList (Java Platform SE 7 ), 24 June 2020, https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html.
Day accessed September 10th, 2022.  