package main.linkedlist

fun main() {
    var test = LinkedNode<Int>(20)
    var list = LinkedList<Int>()
    list.add(test)
    list.add(LinkedNode<Int>(15))
    list.add(LinkedNode<Int>(2))
    list.add(LinkedNode<Int>(5))
    list.printPretty()
}