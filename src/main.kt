import model.Camera
import model.Movie
import model.Shoe

fun main(args: Array<String>){

    val camera =  Camera();
    camera.setCameraStatus(true);
    println( camera.getCameraStatus() )
    camera.setResolution(1080)
    println( "La resolucion de la camara es: ${ camera.getResolution() }")

    var shoe:Shoe = Shoe("shoe","Blue Shoes",12345, "Praga")
    shoe.size = 39
    println(shoe.size)

    shoe.model = "Tennis"
    println(shoe.model)

    println("Shoe: \n" + shoe)

    val movie:Movie = Movie("Cocodrilo", "Sony", 120)
    println("\nPelicula")
    println(movie.title)
    println(movie.creator)
    println(movie.duration)

}