package main.linkedlist

/*

This is the main file that shows off the features of the linkedList.kt classes

Hunter Kepley
ITSC 4102
Fall 2020

*/

fun main() {
    var list = LinkedList<Int>()

    println("\n-- Simple linked list implemenation in Kotlin by Hunter Kepley --\n")

    println("\nAdding items to LinkedList\n")
    list.add(LinkedNode<Int>(20))
    list.add(LinkedNode<Int>(15))
    list.add(LinkedNode<Int>(2))
    list.add(LinkedNode<Int>(5))
    list.add(LinkedNode<Int>(2))

    list.printPretty()

    println("\nFinding all nodes with value of 2\n")
    var foundNodes = list.find(2)

    println("${foundNodes.size} node(s) have the value of 2\n")

    println("\nRemoving first node with value of 2\n")
    list.remove(foundNodes.get(0))

    list.printPretty()

    println("\nRemoving second node with value of 2\n")
    list.remove(foundNodes.get(1))

    list.printPretty()
}