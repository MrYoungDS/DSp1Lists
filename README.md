# <code>DSp1Lists</code> Array and Linked List Project

For this assignment you will implement an array list of integers.

As our first data structure (with arrays counting as our zero-th
data structure), we will implement a (simplified) list interface.
We will use an array implementation, and also a node-based
linked list implementation.

For the implementation with arrays, which you will build in the
`MyArrayList` class, you have some choices to make, but the standard
approach is to keep the data together at the beginning of the array.
This makes the `add` and `remove` methods "costly" at times,
while `get` and `set` are "cheap". You will likely also want to
add an instance field to keep track of the size of your list,
since it will typically not be the same as the length of the
underlying array (that length is known as the **capacity**).
You can see an example of an array implementation in Sec 6.4
of *Java Software Structures*.

For the implementation of the linked list, which you will build
in the `MyLinkedList` class, you can either add a new node class
in a separate file, or you can use an inner class. Be aware of
the standard encapsulation requirements, specifically,
 - if you build a separate class, the instance fields should be
private, which means you will need to include (and use) getters
and setters to access them;
 - if you build an inner class, you can make the fields public,
and access them directly in the rest of the `MyLinkedList` class,
but you will want to make the inner class private.

**IMPORTANT**: I included the second option in your starting code,
but you can feel free to remove it and go with the first option
if you prefer. Please stick with the singly-linked list.

With the linked list, `add` and `remove` methods are generally
cheaper, because we just do some plumbing and we do not have to
move a bunch of other elements every time. But `get` and `set`
are more work, especially if we are close to the end of the list.

Arrays can certainly hold primitive types, and the nodes we will
build can hold primitives, but the Java List interface has a
type parameter. In that spirit, our lists will hold values of 
type big-I `Integer` instead of little-i `int`. With Java featuring
*autoboxing*, you will likely not notice the difference.

A skeleton is provided for you, and you will need to adhere
to the public interface given there. In particular, note
that an array of `int`s initializes every entry to zero,
and that is a possible value in the list. You can find the
skeleton classes in the `java` folder, which is inside the
`main` module, under the `src` folder.

You will also see the `test` module under `src`, and within
that are two tester files. We use JUnit 5 for our unit tests,
and they should work properly in IntelliJ (VS Code and Eclipse
users may need to do some fiddling). You need to be able to
run these test files, and you will need to pass all of them
for full credit on this project.

The two classes you need to modify have been labeled with TODO
in the places where you need to make changes (and IntelliJ will
help you find the TODOs by clicking the three dots under Project |
Commit | Structure on the left margin). You may want to start by
implementing the simple methods `size`, `clear`, and `isEmpty`,
then `addFirst`, `get`, and `set`.
This will get the first test working, and you can proceed with addLast, add, and remove, finishing with indexOf
and contains. Just a suggestion.  ; )
