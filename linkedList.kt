package main.linkedlist
/*
Hunter Kepley
ITSC 4102
Fall 2020
 */

class LinkedList<T> {
    var start: LinkedNode<T>? = null // Start of linked list
    var size = 0 // Size of linekd list

    // Add node to linked list
    fun add(node: LinkedNode<T>) {
        if(size == 0) {
            this.start = node
            this.size++
            return
        }

        var iterator = this.start

        while(iterator?.next != null) {
            iterator = iterator.next
        }
        iterator?.next = node
    }

    // Find all nodes that have the given value
    fun find(value: T): ArrayList<LinkedNode<T>> {
        var nodes = ArrayList<LinkedNode<T>>()
        
        var iterator = this.start

        while(iterator != null) {

            if(iterator.value == value) {
                nodes.add(iterator) // We found a node that matches, add to array list
            }
            iterator = iterator.next
        }

        return nodes
    }

    // Print a nice looking linked list if not empty
    fun printPretty() {
        if(size == 0) {
            println("Linked list empty")
            return
        }
        
        var iterator = this.start

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