# Instructions

Implement a Binary Search Tree to serve as a decision tree. The purpose 
of this decision tree is just to say yes or no the node exists in the 
tree and prints out the node data.


In your node class, you will have 
String sData; // represents name 
int iData;    // represents place on top ten list 
Node left;    // left child (left subtree)
Node right;   // right child (right subtree)

Implement the necessary methods, including insert and search.
NOTE: To compare strings, look at **compareTo()** method. 

In your driver

- Make a tree, named boysNameTree.
- Insert each boy name into the tree.
- Search for the names in the list, when found print their name (sData) and placement (iData) on the top ten list.
- Search a name not listed and your name.
- Create a new tree girlsNameTree.
- Insert each girl name into the tree.
- Search for the names in the list, when found print their name (sData) and placement (iData) on the top ten list.
- Search a name not listed and your name.
- Print the results of each method call.


Listed below are the top 10 names in the US according to 
https://www.ssa.gov/oact/babynames/

1	Noah		Emma
2	Liam		Olivia
3	Mason		Sophia
4	Jacob		Ava
5	William		Isabella
6	Ethan		Mia
7	James		Abigail
8	Alexander	Emily
9	Michael		Charlotte
10	Benjamin	Harper
