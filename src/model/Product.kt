package model

abstract class Product(var name: String, var description:String, var sku: Int){
    override fun toString(): String {
        return "\nname: ${this.name} \nDescription: ${this.description} \nSKU: ${this.sku}"
    }
}

//Basicamente las clases abstractas las usamos para
//Ordenar atributos redundantes y las interfaces son para metodos
//redundantes