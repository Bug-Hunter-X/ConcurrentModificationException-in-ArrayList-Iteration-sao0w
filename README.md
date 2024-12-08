# ConcurrentModificationException in ArrayList Iteration

This repository demonstrates a common Java error: the `ConcurrentModificationException`.  The exception arises when attempting to modify a collection (like an ArrayList) while iterating through it using an enhanced `for` loop (or iterator). 

The `ConcurrentModificationExceptionExample.java` file contains the buggy code, and `ConcurrentModificationExceptionExampleSolution.java` presents a corrected version.

The problem lies in directly removing elements from the list during iteration.  The iterator becomes invalid, leading to the exception.

The solution provides safer approaches to modify a list while iterating.