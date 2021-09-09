package main

import java.util.*

fun main() {

    do {
        println("Get Valorant Agent Detail")
        print("Input Agent Name (astra/jett/sage): ")
        val inputString = readLine().toString()
        val valorant = Valorant(inputString)
        valorant.printDetailAgent()
        print("\nApakah ingin mencoba lagi(y/n)? ")
        val scanner = Scanner(System.`in`)
        val decision = scanner.next().single()
        print("\n")
    } while (decision == 'y' || decision == 'Y')


}

class Valorant(_nameAgent: String) {
    private var nameAgent: String = _nameAgent

    fun printDetailAgent() {
        when (nameAgent.lowercase()) {
            "astra" -> agentAstra(nameAgent)
            "jett" -> agentJett(nameAgent)
            "sage" -> agentSage(nameAgent)
            else -> println("There are no information about that agent")
        }
    }

    private fun agentAstra(nameAgent: String) {
        println("Agent Name: $nameAgent")
        println("Class Agent: Controller")
        println("Difficulty: Hard")
        println("Playstyle: Support")
    }

    private fun agentJett(nameAgent: String) {
        println("Agent Name: $nameAgent")
        println("Class Agent: Duelist")
        println("Difficulty: Medium")
        println("Playstyle: Lurk")
    }

    private fun agentSage(nameAgent: String) {
        println("Agent Name: $nameAgent")
        println("Class Agent: Sentinel")
        println("Difficulty: Easy")
        println("Playstyle: Support")
    }
}