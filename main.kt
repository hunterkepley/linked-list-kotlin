package main.linkedlist

/*

This is the main file that shows off the features of the linkedList.kt classes

Hunter Kepley
ITSC 4102
Fall 2020

*/

fun main() {
    var test = LinkedNode<Int>(20)
    var list = LinkedList<Int>()
    list.add(test)
    list.add(LinkedNode<Int>(15))
    list.add(LinkedNode<Int>(2))
    list.add(LinkedNode<Int>(5))
    list.add(LinkedNode<Int>(2))
    list.printPretty()
    var foundNodes = list.find(2)
    println("${foundNodes.size} node(s) have the value of 2")
}