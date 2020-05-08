package model

abstract class Product(var name: String, var description:String, var sku: Int){
    override fun toString(): String {
        return "\nname: ${this.name} \nDescription: ${this.description} \nSKU: ${this.sku}"
    }

    abstract public fun create(): String

    abstract public fun read(): String

    abstract public fun update(): String

    abstract public  fun delete(): String

}