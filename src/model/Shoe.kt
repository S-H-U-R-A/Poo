package model

//Por defecto en Kotlin las clases no se pueden heredar al menos de que en su delcaración
//Usemos la palabra reservada Kotlin

//Poner parentesis lo toma como el metodo constructor
class Shoe(name: String, description: String, sku: Int, var brand: String):
            Product(name, description, sku), ICrudActions {

    override fun create(): String {
        saludar("Hola desde Create");
        return "Create shoe"
    }

    override fun read(): String {
        return "Read Shoe"
    }

    override fun update(): String {
        return "Update shoe"
    }

    override fun delete(): String {
        return "Delete Shoe"
    }

    //Polimorfismo es basicamente sobreescribir metodos
    override fun toString(): String {
        return super.toString() + "Sku ID: ${this.sku}, \nMark: ${this.brand} "
    }

    init {
        println("Sku id: ${ this.sku }")
        println("Brand: ${ this.brand }")
    }

    var size: Int = 34 //Minimo sea 34
        set(value) {
            if(value > 34){
                field = value// Variable remporal que referencia a size
            }else{
                field = 34
            }
        }
        get() = field

    var color: String = "White"

    var model: String = "Boots" // No se asigne tennis
        set(value) {
            if(value.equals("Tennis")){
                field = this.model
            }else{
                field = value
            }
        }

}