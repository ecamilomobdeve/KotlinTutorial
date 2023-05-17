import org.w3c.dom.NodeList

data class Node<T>(var value: T, var next: Node<T>? = null) {
    override fun toString(): String {
        return if (next != null) {
            "$value -x> ${next.toString()}"
        } else {
            "$value"
        }
    }
}