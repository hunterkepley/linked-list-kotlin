package main.linkedlist
/*
Developed by Hunter Kepley 2020
ITSC 4102
Dr. Ali Sever
 */

class LinkedList<T> {
    var start: LinkedNode<T>? = null // Start of linked list
    var size = 0 // Size of linekd list

    // Add node to linked list
    fun add(node: LinkedNode<T>) {
        if(size == 0) {
            start = node
            size++
            return
        }
        var iterator = start
        while(iterator?.next != null) {
            iterator = iterator.next
        }
        iterator?.next = node
    }

    // Print a nice looking linked list if not empty
    fun printPretty() {
        if(size == 0) {
            println("Linked list empty")
            return
        }
        
        var iterator = start
        println("LINKED LIST")
        while(iterator != null) {
            print("[${iterator.value}]")
            iterator = iterator.next
            if(iterator != null) {
                print(" -> ")
            }
        }
        println()
    }
}

// LinkedNode is a single node in a linkedlist
class LinkedNode<T>(value: T) {
    var value: T
    var next: LinkedNode<T>? = null
    init {
        this.value = value
    }
}