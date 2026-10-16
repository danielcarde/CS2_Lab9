# Lab 9: String Binary Search Tree


Java coursework implementing a binary search tree of strings with ordered insertion, duplicate rejection, size, ascending/descending output, in-order array extraction, and longest-string lookup.


## Highlights
Builds on the binary tree structure.
Uses BTNode and BinaryTree classes.
Runs through Lab9_Runner.
Keeps tree logic separated from execution logic.


## Overview
Lab 9 continues the binary tree work from the previous lab. It keeps the same style of node and tree separation while extending the practice through a new runner.
The assignment reinforces how tree implementations evolve across exercises.


## Why This Project
Repeating tree implementation with new operations helps make the concept stick. This lab gives additional practice with tree behavior and multi-class organization.


## Usage
Compile: Compile all Java files with javac *.java.
Run: Execute with java Lab9_Runner.
Review the runner to see which tree operations are demonstrated.


## Installation
Ensure you have the Java Development Kit (JDK) installed on your system.
Open a terminal in the lab folder before compiling so the program can find any required local text files.


## Architecture
File Structure: The project contains BTNode.java, BinaryTree.java, and Lab9_Runner.java.
Components: BTNode.java defines tree nodes, BinaryTree.java contains tree behavior, and Lab9_Runner.java drives the lab.


## Future Improvements
Add visual examples of the tree structure.
Add automated tests for traversal and search operations.
Unlike Lab 8, insertion enforces lexicographic String ordering and rejects duplicate strings. The tree is not balanced: insertion takes O(h), with O(n) worst-case height. Full traversal, size, array extraction, and longest-string lookup visit O(n) nodes. Add assertions for duplicates, empty trees, and sorted extraction.

